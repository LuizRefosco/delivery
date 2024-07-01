package delivery.teste.entrega.infra;

import delivery.teste.entrega.domain.Entrega;
import delivery.teste.entrega.repository.EntregaRepository;
import delivery.teste.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Log4j2
@Repository
@RequiredArgsConstructor
public class EntregaInfraRepository implements EntregaRepository {
    private final EntregaSpringDataJpaRepository entregaSpringDataJpaRepository;
    @Override
    public Entrega salvaEntrega(Entrega entrega) {
        log.info("[inicia] EntregaInfraRepository - salvaEntrega");
        entregaSpringDataJpaRepository.save(entrega);
        log.info("[finaliza] EntregaInfraRepository - salvaEntrega");
        return entrega;
    }

    @Override
    public Entrega buscaEntregaAtravesId(UUID idEntrega) {
        log.info("[inicia] EntregaInfraRepository - buscaEntregaAtravesId");
        Entrega entrega = entregaSpringDataJpaRepository.findById(idEntrega)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Entrega não encontrado!"));
        log.info("[finaliza] EntregaInfraRepository - buscaEntregaAtravesId");
        return entrega;
    }

    @Override
    public void deletaEntrega(Entrega entrega) {
        log.info("[inicia] EntregaInfraRepository - deletaEntrega");
        entregaSpringDataJpaRepository.delete(entrega);
        log.info("[finaliza] EntregaInfraRepository - deletaEntrega");
    }
}
