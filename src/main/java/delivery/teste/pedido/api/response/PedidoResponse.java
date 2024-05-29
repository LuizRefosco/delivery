package delivery.teste.pedido.api.response;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;
@Builder
@Value
public class PedidoResponse {
    private UUID id;
}
