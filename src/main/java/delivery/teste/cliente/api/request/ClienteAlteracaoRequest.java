package delivery.teste.cliente.api.request;

import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value
public class ClienteAlteracaoRequest {

    private String nome;
    @NotBlank
    private String endereco;
    @NotBlank
    private double telefone;
}
