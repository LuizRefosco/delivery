package delivery.teste.pedido.infra;

import delivery.teste.pedido.domain.Pedido;
import delivery.teste.pedido.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Log4j2
@Repository
@RequiredArgsConstructor
public class PedidoInfraRepository implements PedidoRepository {
    private final PedidoSpringDataJpaRepository pedidoSpringDataJpaRepository;
    @Override
    public Pedido salvaPedido(Pedido pedido) {
        log.info("[inicia] PedidoInfraRepository - salvaPedido");
        pedidoSpringDataJpaRepository.save(pedido);
        log.info("[finaliza] PedidoInfraRepository - salvaPedido");
        return pedido;
    }
}
