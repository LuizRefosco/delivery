package delivery.teste.pedido.repository;

import delivery.teste.pedido.domain.Pedido;

import java.util.UUID;

public interface PedidoRepository {
    Pedido salvaPedido(Pedido pedido);

    Pedido buscaPedidoAtravesId(UUID idPedido);

    void deletaPedido(Pedido pedido);
}
