package delivery.teste.entrega.repository;

import delivery.teste.entrega.domain.Entrega;

import java.util.UUID;

public interface EntregaRepository {
    Entrega salvaEntrega(Entrega entrega);

    Entrega buscaEntregaAtravesId(UUID idEntrega);

    void deletaEntrega(Entrega entrega);
}
