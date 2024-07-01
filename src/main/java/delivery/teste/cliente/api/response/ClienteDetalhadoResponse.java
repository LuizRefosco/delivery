package delivery.teste.cliente.api.response;

import delivery.teste.cliente.domain.Cliente;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class ClienteDetalhadoResponse {

    private UUID idCliente;
    @NotBlank
    private String nome;
    @NotBlank
    private String endereco;
    @NotBlank
    private double telefone;

    public ClienteDetalhadoResponse(Cliente cliente){
        this.nome = cliente.getNome();
        this.idCliente = cliente.getIdCliente();
        this.endereco = cliente.getEndereco();
        this.telefone = cliente.getTelefone();
    }
}
