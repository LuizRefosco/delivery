package delivery.teste.entrega.api.controller;

import delivery.teste.entrega.api.EntregaAPI;
import delivery.teste.entrega.api.request.EntregaAlteracaoRequest;
import delivery.teste.entrega.api.request.EntregaRequest;
import delivery.teste.entrega.api.response.EntregaDetalhadaResponse;
import delivery.teste.entrega.api.response.EntregaResponse;
import delivery.teste.entrega.domain.Entrega;
import delivery.teste.entrega.service.EntregaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Log4j2
@RestController
@RequiredArgsConstructor
public class EntregaController implements EntregaAPI {
    private final EntregaService entregaService;
    @Override
    public EntregaResponse postEntrega(EntregaRequest entregaRequest) {
        log.info("[inicia] EntregaController - PostEntrega");
        log.info("[ID_PEDIDO] {}", entregaRequest.getIdPedido());
        EntregaResponse entrega = entregaService.salvaEntrega(entregaRequest);
        log.info("[finaliza] EntregaController - postEntrega");
        return entrega;
    }

    @Override
    public EntregaDetalhadaResponse getEntregaPorId(UUID idEntrega) {
        log.info("[inicia] EntregaController - getEntregaPorId");
        log.info("[ID_ENTREGA] {}", idEntrega);
        Entrega entrega = entregaService.buscaEntregaPorId(idEntrega);
        log.info("[finaliza] EntregaController - getEntregaPorId");
        return new EntregaDetalhadaResponse(entrega);
    }

    @Override
    public void patchAlteraEntrega(UUID idEntrega, EntregaAlteracaoRequest entregaAlteracaoRequest) {
        log.info("[inicia] EntregaController - patchAlteraEntrega");
        log.info("[ID_ENTREGA] {}", idEntrega);
        entregaService.alteraEntrega(idEntrega, entregaAlteracaoRequest);
        log.info("[finaliza] EntregaController - patchAlteraEntrega");
    }

    @Override
    public void deleteEntrega(UUID idEntrega) {
        log.info("[inicia] EntregaController - deleteEntrega");
        log.info("[ID_ENTREGA] {}", idEntrega);
        entregaService.deletaEntrega(idEntrega);
        log.info("[finaliza] EntregaController - deleteEntrega");
    }
}
