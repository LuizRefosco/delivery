package delivery.teste.pedido.api.controller;

import delivery.teste.pedido.api.PedidoAPI;
import delivery.teste.pedido.api.request.PedidoRequest;
import delivery.teste.pedido.api.response.PedidoResponse;
import delivery.teste.pedido.service.PedidoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

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
}
