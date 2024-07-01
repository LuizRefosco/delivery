package delivery.teste.entrega.service;

import delivery.teste.entrega.api.request.EntregaAlteracaoRequest;
import delivery.teste.entrega.api.request.EntregaRequest;
import delivery.teste.entrega.api.response.EntregaResponse;
import delivery.teste.entrega.domain.Entrega;

import java.util.UUID;

public interface EntregaService {
    EntregaResponse salvaEntrega(EntregaRequest entregaRequest);

    Entrega buscaEntregaPorId(UUID idEntrega);

    void alteraEntrega(UUID idEntrega, EntregaAlteracaoRequest entregaAlteracaoRequest);

    void deletaEntrega(UUID idEntrega);
}
