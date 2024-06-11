package delivery.teste.pedido.service;

import delivery.teste.pedido.api.request.PedidoAlteracaoRequest;
import delivery.teste.pedido.api.request.PedidoRequest;
import delivery.teste.pedido.api.response.PedidoResponse;
import delivery.teste.pedido.domain.Pedido;

import java.util.UUID;

public interface PedidoService {
    PedidoResponse salvaPedido(PedidoRequest pedidoRequest);

    Pedido buscaPedidoPorId(UUID idPedido);

    void alteraPedido(UUID idPedido, PedidoAlteracaoRequest pedidoAlteracaoRequest);

    void deletaPedido(UUID idPedido);
}
