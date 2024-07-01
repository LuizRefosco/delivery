package delivery.teste.entrega.api.response;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class EntregaResponse {
    private UUID id;
}
