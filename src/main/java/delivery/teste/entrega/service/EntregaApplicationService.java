package delivery.teste.entrega.service;

import delivery.teste.entrega.api.request.EntregaAlteracaoRequest;
import delivery.teste.entrega.api.request.EntregaRequest;
import delivery.teste.entrega.api.response.EntregaResponse;
import delivery.teste.entrega.domain.Entrega;
import delivery.teste.entrega.repository.EntregaRepository;
import delivery.teste.pedido.domain.Pedido;
import delivery.teste.pedido.service.PedidoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Log4j2
@Service
@RequiredArgsConstructor
public class EntregaApplicationService implements EntregaService{
    private final EntregaRepository entregaRepository;
    private final PedidoService pedidoService;
    @Override
    public EntregaResponse salvaEntrega(EntregaRequest entregaRequest) {
        log.info("[inicia] EntregaApplicationService - salvaEntrega");
        pedidoService.buscaPedidoPorId(entregaRequest.getIdPedido());
        Entrega entrega = entregaRepository.salvaEntrega(new Entrega(entregaRequest));
        log.info("[finaliza] EntregaApplicationService - salvaEntrega");
        return EntregaResponse.builder().id(entrega.getIdEntrega()).build();
    }

    @Override
    public Entrega buscaEntregaPorId(UUID idEntrega) {
        log.info("[inicia] EntregaApplicationService - buscaEntregaPorId");
        Entrega entrega = entregaRepository.buscaEntregaAtravesId(idEntrega);
        log.info("[finaliza] EntregaApplicationService - buscaEntregaPorId");
        return entrega;
    }

    @Override
    public void alteraEntrega(UUID idEntrega, EntregaAlteracaoRequest entregaAlteracaoRequest) {
        log.info("[inicia] EntregaApplicationService - alteraEntrega");
        Entrega entrega = entregaRepository.buscaEntregaAtravesId(idEntrega);
        entrega.altera(entregaAlteracaoRequest);
        entregaRepository.salvaEntrega(entrega);
        log.info("[finaliza] EntregaApplicationService - alteraEntrega");
    }

    @Override
    public void deletaEntrega(UUID idEntrega) {
        log.info("[inicia] EntregaApplicationService - deletaEntrega");
        Entrega entrega = entregaRepository.buscaEntregaAtravesId(idEntrega);
        entregaRepository.deletaEntrega(entrega);
        log.info("[finaliza] EntregaApplicationService - deletaEntrega");
    }
}
