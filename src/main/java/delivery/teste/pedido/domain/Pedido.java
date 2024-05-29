package delivery.teste.pedido.domain;

import delivery.teste.pedido.api.request.PedidoAlteracaoRequest;
import delivery.teste.pedido.api.request.PedidoRequest;
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
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;
    @NotBlank
    private UUID idCliente;
    @NotBlank
    private String pedido;

    private LocalDateTime dataHoraCadastro;
    private LocalDateTime dataHoraAlteracao;

    public Pedido(PedidoRequest pedidoRequest){
        this.idCliente = pedidoRequest.getIdCliente();
        this.pedido = pedidoRequest.getPedido();
        this.dataHoraCadastro = LocalDateTime.now();
    }

    public void altera(PedidoAlteracaoRequest pedidoAlteracaoRequest){
        this.pedido = pedidoAlteracaoRequest.getPedido();
        this.dataHoraAlteracao = LocalDateTime.now();
    }
}
