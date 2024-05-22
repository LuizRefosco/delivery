package delivery.teste.cliente.api.request;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Value
public class ClienteRequest {

    private String nome;
    @NotBlank
    private String endereco;
    @NotBlank
    private double telefone;
}
