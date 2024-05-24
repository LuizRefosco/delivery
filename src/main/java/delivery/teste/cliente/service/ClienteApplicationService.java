package delivery.teste.cliente.service;

import delivery.teste.cliente.api.request.ClienteAlteracaoRequest;
import delivery.teste.cliente.api.request.ClienteRequest;
import delivery.teste.cliente.api.response.ClienteResponse;
import delivery.teste.cliente.domain.Cliente;
import delivery.teste.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Log4j2
@Service
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService{
    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteController - criaCliente");
        Cliente cliente = clienteRepository.salvaCliente(new Cliente(clienteRequest));
        log.info("[finaliza] ClienteController - criaCliente");
        return ClienteResponse.builder().id(cliente.getId()).build();
    }

    @Override
    public Cliente buscaClientePorId(UUID id) {
        log.info("[inicia]  ClienteController - buscaClientePorId");
        Cliente cliente = clienteRepository.buscaClientePorId(id);
        log.info("[finaliza] ClienteController - buscaClientePorId");
        return cliente;
    }

    @Override
    public Cliente alteraClientePorId(UUID id, ClienteAlteracaoRequest clienteAlteracaoRequest) {
        log.info("[inicia]  ClienteController - alteraClientePorId");
        Cliente cliente = clienteRepository.buscaClientePorId(id);
        cliente.altera(clienteAlteracaoRequest);
        clienteRepository.salvaCliente(cliente);
        log.info("[finaliza]  ClienteController - alteraClientePorId");
        return cliente;
    }

    @Override
    public void deletaCliente(UUID id) {
        log.info("[inicia]  ClienteController - alteraCliente");
            Cliente cliente = clienteRepository.buscaClientePorId(id);
        clienteRepository.deletaCliente(cliente);
        log.info("[finaliza]  ClienteController - alteraCliente");
    }
}
