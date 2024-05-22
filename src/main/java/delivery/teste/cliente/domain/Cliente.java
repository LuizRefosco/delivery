package delivery.teste.cliente.domain;

import delivery.teste.cliente.api.request.ClienteAlteracaoRequest;
import delivery.teste.cliente.api.request.ClienteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;
    @NotBlank
    private String nome;
    @NotBlank
    private String endereco;
    @NotBlank
    private double telefone;

    public Cliente(ClienteRequest clienteRequest) {
        this.nome = clienteRequest.getNome();
        this.endereco = clienteRequest.getEndereco();
        this.telefone = clienteRequest.getTelefone();
    }

    public void altera(ClienteAlteracaoRequest clienteAlteracaoRequest) {
        this.nome = clienteAlteracaoRequest.getNome();
        this.endereco = clienteAlteracaoRequest.getEndereco();
        this.telefone = clienteAlteracaoRequest.getTelefone();
    }
}
