package delivery.teste.cliente.api.response;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class ClienteResponse {
    private UUID id;
}
