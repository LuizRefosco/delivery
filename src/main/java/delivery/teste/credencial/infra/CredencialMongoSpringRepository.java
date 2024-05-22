package delivery.teste.credencial.infra;

import delivery.teste.credencial.domain.Credencial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CredencialMongoSpringRepository extends JpaRepository<Credencial, String> {
	Optional<Credencial> findByUsuario(String usuario);
}
