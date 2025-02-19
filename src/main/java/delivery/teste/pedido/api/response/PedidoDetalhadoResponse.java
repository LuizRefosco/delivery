package delivery.teste.pedido.api.response;

import delivery.teste.pedido.domain.Pedido;
import lombok.Value;

import java.util.UUID;

@Value
public class PedidoDetalhadoResponse {

    private UUID idPedido;
    private UUID idCliente;
    private String pedido;

    public PedidoDetalhadoResponse(Pedido pedido){
        this.idPedido =pedido.getIdPedido();
        this.idCliente = pedido.getIdCliente();
        this.pedido = pedido.getPedido();
    }
}
