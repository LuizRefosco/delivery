package delivery.teste.cliente.repository;

import delivery.teste.cliente.domain.Cliente;

import java.util.UUID;

public interface ClienteRepository {
    Cliente salvaCliente(Cliente cliente);

    Cliente buscaClientePorId(UUID idCliente);

    void deletaCliente(Cliente cliente);
}
