package delivery.teste.cliente.infra;

import delivery.teste.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJpaRepository extends JpaRepository<Cliente, UUID>{
}
