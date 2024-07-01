package delivery.teste.entrega.domain;
import delivery.teste.entrega.api.request.EntregaAlteracaoRequest;
import delivery.teste.entrega.api.request.EntregaRequest;
import delivery.teste.pedido.api.request.PedidoAlteracaoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
    private UUID idEntrega;
    @NotBlank
    private UUID idPedido;
    @NotBlank
    private String entrega;

    public Entrega(EntregaRequest entregaRequest) {
        this.idPedido = entregaRequest.getIdPedido();
        this.entrega = entregaRequest.getEntrega();
    }

    public void altera(EntregaAlteracaoRequest entregaAlteracaoRequest) {
        this.entrega = entregaAlteracaoRequest.getEntrega();
    }
}
