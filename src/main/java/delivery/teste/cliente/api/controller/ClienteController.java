package delivery.teste.cliente.api.controller;

import delivery.teste.cliente.api.ClienteAPI;
import delivery.teste.cliente.api.request.ClienteRequest;
import delivery.teste.cliente.api.response.ClienteResponse;
import delivery.teste.cliente.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

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
}
