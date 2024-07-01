package delivery.teste.entrega.api.request;

import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value
public class EntregaAlteracaoRequest {

    @NotBlank
    private String entrega;
}
