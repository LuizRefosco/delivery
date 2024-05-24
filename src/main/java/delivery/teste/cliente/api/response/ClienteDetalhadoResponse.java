package delivery.teste.cliente.api.response;

import delivery.teste.cliente.domain.Cliente;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class ClienteDetalhadoResponse {

    private UUID id;
    @NotBlank
    private String nome;
    @NotBlank
    private String endereco;
    @NotBlank
    private double telefone;

    public ClienteDetalhadoResponse(Cliente cliente){
        this.nome = cliente.getNome();
        this.id = cliente.getId();
        this.endereco = cliente.getEndereco();
        this.telefone = cliente.getTelefone();
    }
}
