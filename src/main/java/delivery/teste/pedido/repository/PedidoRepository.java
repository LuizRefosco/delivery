package delivery.teste.pedido.repository;

import delivery.teste.pedido.domain.Pedido;

public interface PedidoRepository {
    Pedido salvaPedido(Pedido pedido);
}
