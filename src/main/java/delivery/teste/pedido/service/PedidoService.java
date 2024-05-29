package delivery.teste.pedido.service;

import delivery.teste.pedido.api.request.PedidoRequest;
import delivery.teste.pedido.api.response.PedidoResponse;

public interface PedidoService {
    PedidoResponse salvaPedido(PedidoRequest pedidoRequest);
}
