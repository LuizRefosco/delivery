package delivery.teste.pedido.service;

import delivery.teste.cliente.service.ClienteService;
import delivery.teste.pedido.api.request.PedidoAlteracaoRequest;
import delivery.teste.pedido.api.request.PedidoRequest;
import delivery.teste.pedido.api.response.PedidoResponse;
import delivery.teste.pedido.domain.Pedido;
import delivery.teste.pedido.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Log4j2
@Service
@RequiredArgsConstructor
public class PedidoApplicationService implements PedidoService{
    private final PedidoRepository pedidoRepository;
    private final ClienteService clienteService;
    @Override
    public PedidoResponse salvaPedido(PedidoRequest pedidoRequest) {
        log.info("[inicia] PedidoApplicationService - salvaPedido");
        clienteService.buscaClientePorId(pedidoRequest.getIdCliente());
        Pedido pedido = pedidoRepository.salvaPedido(new Pedido(pedidoRequest));
        log.info("[finaliza] PedidoApplicationService - salvaPedido");
        return PedidoResponse.builder().id(pedido.getIdPedido()).build();
    }

    @Override
    public Pedido buscaPedidoPorId(UUID idPedido) {
        log.info("[inicia] PedidoApplicationService - buscaPedidoPorId");
        Pedido pedido = pedidoRepository.buscaPedidoAtravesId(idPedido);
        log.info("[finaliza] PedidoApplicationService - buscaPedidoPorId");
        return pedido;
    }

    @Override
    public void alteraPedido(UUID idPedido, PedidoAlteracaoRequest pedidoAlteracaoRequest) {
        log.info("[inicia] PedidoApplicationService - alteraPedido");
        Pedido pedido = pedidoRepository.buscaPedidoAtravesId(idPedido);
        pedido.altera(pedidoAlteracaoRequest);
        pedidoRepository.salvaPedido(pedido);
        log.info("[finaliza] PedidoApplicationService - alteraPedido");
    }

    @Override
    public void deletaPedido(UUID idPedido) {
        log.info("[inicia] PedidoApplicationService - deletaPedido");
        Pedido pedido = pedidoRepository.buscaPedidoAtravesId(idPedido);
        pedidoRepository.deletaPedido(pedido);
        log.info("[finaliza] PedidoApplicationService - deletaPedido");
    }
}
