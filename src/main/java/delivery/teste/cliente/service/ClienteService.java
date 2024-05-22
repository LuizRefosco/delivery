package delivery.teste.cliente.service;

import delivery.teste.cliente.api.request.ClienteRequest;
import delivery.teste.cliente.api.response.ClienteResponse;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);

}
