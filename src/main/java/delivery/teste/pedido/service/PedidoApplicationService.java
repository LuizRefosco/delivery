package delivery.teste.pedido.service;

import delivery.teste.cliente.service.ClienteService;
import delivery.teste.pedido.api.request.PedidoRequest;
import delivery.teste.pedido.api.response.PedidoResponse;
import delivery.teste.pedido.domain.Pedido;
import delivery.teste.pedido.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

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
        return PedidoResponse.builder().id(pedido.getId()).build();
    }
}
