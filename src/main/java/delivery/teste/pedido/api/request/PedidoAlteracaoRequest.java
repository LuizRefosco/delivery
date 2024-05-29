package delivery.teste.pedido.api.request;

import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value
public class PedidoAlteracaoRequest {

    @NotBlank
    private String pedido;
}
