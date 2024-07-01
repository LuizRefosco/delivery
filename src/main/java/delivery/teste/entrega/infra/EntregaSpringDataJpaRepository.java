package delivery.teste.entrega.infra;

import delivery.teste.entrega.domain.Entrega;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface EntregaSpringDataJpaRepository extends MongoRepository<Entrega, UUID> {
}
