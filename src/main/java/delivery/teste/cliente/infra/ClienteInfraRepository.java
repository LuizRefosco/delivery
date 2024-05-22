package delivery.teste.cliente.infra;

import delivery.teste.cliente.domain.Cliente;
import delivery.teste.cliente.repository.ClienteRepository;
import delivery.teste.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
@Log4j2
@Repository
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
    private final ClienteSpringDataJpaRepository clienteSpringDataJpaRepository;

    @Override
    public Cliente salvaCliente(Cliente cliente) {
        log.info("[inicia] ClienteInfraRepository - salvaCliente");
        try {
            clienteSpringDataJpaRepository.save(cliente);
        } catch (DataIntegrityViolationException e) {
            throw APIException.build(HttpStatus.BAD_REQUEST, "Existem dados duplicados! ");
        }
        log.info("[finaliza] ClienteInfraRepository - salvaCliente");
        return cliente;
    }
}
