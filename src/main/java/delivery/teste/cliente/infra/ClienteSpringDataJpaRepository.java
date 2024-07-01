package delivery.teste.cliente.infra;

import delivery.teste.cliente.domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.UUID;

public interface ClienteSpringDataJpaRepository extends MongoRepository<Cliente, UUID> {
}
