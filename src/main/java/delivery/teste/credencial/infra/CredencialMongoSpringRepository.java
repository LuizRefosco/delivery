package delivery.teste.credencial.infra;

import delivery.teste.credencial.domain.Credencial;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CredencialMongoSpringRepository extends MongoRepository<Credencial, String> {
	Optional<Credencial> findByUsuario(String usuario);
}
