package delivery.teste.pedido.infra;

import delivery.teste.handler.APIException;
import delivery.teste.pedido.domain.Pedido;
import delivery.teste.pedido.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.UUID;

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

    @Override
    public Pedido buscaPedidoAtravesId(UUID idPedido) {
        log.info("[inicia] PedidoInfraRepository - buscaPedidoAtravesId");
        Pedido pedido = pedidoSpringDataJpaRepository.findById(idPedido)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Pedido não encontrado!"));
        log.info("[finaliza] PedidoInfraRepository - buscaPedidoAtravesId");
        return pedido;
    }

    @Override
    public void deletaPedido(Pedido pedido) {
        log.info("[inicia] PedidoInfraRepository - deletaPedido");
        pedidoSpringDataJpaRepository.delete(pedido);
        log.info("[finaliza] PedidoInfraRepository - deletaPedido");
    }
}
