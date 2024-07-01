package delivery.teste.pedido.infra;

import delivery.teste.pedido.domain.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface PedidoSpringDataJpaRepository extends MongoRepository<Pedido, UUID> {
}
