package delivery.teste.pedido.api.controller;

import delivery.teste.pedido.api.PedidoAPI;
import delivery.teste.pedido.api.request.PedidoAlteracaoRequest;
import delivery.teste.pedido.api.request.PedidoRequest;
import delivery.teste.pedido.api.response.PedidoDetalhadoResponse;
import delivery.teste.pedido.api.response.PedidoResponse;
import delivery.teste.pedido.domain.Pedido;
import delivery.teste.pedido.service.PedidoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Log4j2
@RestController
@RequiredArgsConstructor
public class PedidoController implements PedidoAPI {
    private final PedidoService pedidoService;
    @Override
    public PedidoResponse postPedido(PedidoRequest pedidoRequest) {
        log.info("[inicia] PedidoController - PostPedido");
        log.info("[ID_CLIENTE] {}", pedidoRequest.getIdCliente());
        PedidoResponse pedido = pedidoService.salvaPedido(pedidoRequest);
        log.info("[finaliza] PedidoController - postPedido");
        return pedido;
    }

    @Override
    public PedidoDetalhadoResponse getPedidoPorId(UUID idPedido) {
        log.info("[inicia] PedidoController - getPedidoPorId");
        log.info("[ID_PEDIDO] {}", idPedido);
        Pedido pedido = pedidoService.buscaPedidoPorId(idPedido);
        log.info("[finaliza] PedidoController - getPedidoPorId");
        return new PedidoDetalhadoResponse(pedido);
    }

    @Override
    public void patchAlteraPedido(UUID idPedido, PedidoAlteracaoRequest pedidoAlteracaoRequest) {
        log.info("[inicia] PedidoController - patchAlteraPedido");
        log.info("[ID_PEDIDO] {}", idPedido);
        pedidoService.alteraPedido(idPedido, pedidoAlteracaoRequest);
        log.info("[finaliza] PedidoController - patchAlteraPedido");
    }

    @Override
    public void deletePedido(UUID idPedido) {
        log.info("[inicia] PedidoController - deletePedido");
        log.info("[ID_PEDIDO] {}", idPedido);
        pedidoService.deletaPedido(idPedido);
        log.info("[finaliza] PedidoController - deletePedido");
    }
}
