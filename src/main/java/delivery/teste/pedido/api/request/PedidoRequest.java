package delivery.teste.pedido.api.request;

import lombok.Value;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Value
public class PedidoRequest {
    @Column(columnDefinition = "uuid", name = "idCliente", nullable = false)
    @NotBlank
    private UUID idCliente;
    @NotBlank
    private String pedido;

}
