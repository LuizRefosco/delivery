package delivery.teste.pedido.infra;

import delivery.teste.pedido.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidoSpringDataJpaRepository extends JpaRepository<Pedido, UUID> {
}
