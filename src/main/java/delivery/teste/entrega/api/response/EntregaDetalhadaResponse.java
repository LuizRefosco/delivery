package delivery.teste.entrega.api.response;

import delivery.teste.entrega.domain.Entrega;
import lombok.Value;

import java.util.UUID;

@Value
public class EntregaDetalhadaResponse {

    private UUID idEntrega;
    private UUID idPedido;
    private String entrega;

    public EntregaDetalhadaResponse(Entrega entrega){
        this.idEntrega = entrega.getIdEntrega();
        this.idPedido = entrega.getIdPedido();
        this.entrega = entrega.getEntrega();
    }

}
