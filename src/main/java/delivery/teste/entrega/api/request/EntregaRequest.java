package delivery.teste.entrega.api.request;

import lombok.Value;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.util.UUID;
@Value
public class EntregaRequest{
    @Column(columnDefinition = "uuid", name = "idPedido", nullable = false)
    @NotBlank
    private UUID idPedido;
    @NotBlank
    private String entrega;
}
