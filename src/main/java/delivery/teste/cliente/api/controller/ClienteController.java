package delivery.teste.cliente.api.controller;

import delivery.teste.cliente.api.ClienteAPI;
import delivery.teste.cliente.api.request.ClienteAlteracaoRequest;
import delivery.teste.cliente.api.request.ClienteRequest;
import delivery.teste.cliente.api.response.ClienteDetalhadoResponse;
import delivery.teste.cliente.api.response.ClienteResponse;
import delivery.teste.cliente.domain.Cliente;
import delivery.teste.cliente.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Log4j2
@RestController
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
    private final ClienteService clienteService;

    @Override
    public ClienteResponse postCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteController - postCliente");
        ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
        log.info("[finaliza] ClienteController - postCliente");
        return clienteCriado;
    }

    @Override
    public ClienteDetalhadoResponse getClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteController - getCliente");
        log.info("[ID_CLIENTE] {}", idCliente);
        Cliente cliente = clienteService.buscaClientePorId(idCliente);
        log.info("[finaliza] ClienteController - getCliente");
        return new ClienteDetalhadoResponse(cliente);
    }

    @Override
    public void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest) {
        log.info("[inicia] ClienteController - patchCliente");
        log.info("[ID_CLIENTE] {}", idCliente);
        clienteService.alteraClientePorId(idCliente, clienteAlteracaoRequest);
        log.info("[finaliza] ClienteController - patchCliente");
    }

    @Override
    public void deletaCliente(UUID idCliente) {
        log.info("[inicia] ClienteController - deletaCliente");
        log.info("[ID] {}", idCliente);
        clienteService.deletaCliente(idCliente);
        log.info("[deleta] ClienteController - deletaCliente");

    }
}
