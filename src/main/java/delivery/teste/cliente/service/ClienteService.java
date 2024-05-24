package delivery.teste.cliente.service;

import delivery.teste.cliente.api.request.ClienteAlteracaoRequest;
import delivery.teste.cliente.api.request.ClienteRequest;
import delivery.teste.cliente.api.response.ClienteResponse;
import delivery.teste.cliente.domain.Cliente;

import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);

    Cliente buscaClientePorId(UUID id);

    Cliente alteraClientePorId(UUID id, ClienteAlteracaoRequest clienteAlteracaoRequest);

    void deletaCliente(UUID id);
}
