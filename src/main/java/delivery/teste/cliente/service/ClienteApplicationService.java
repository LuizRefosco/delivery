package delivery.teste.cliente.service;

import delivery.teste.cliente.api.request.ClienteRequest;
import delivery.teste.cliente.api.response.ClienteResponse;
import delivery.teste.cliente.domain.Cliente;
import delivery.teste.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

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
}
