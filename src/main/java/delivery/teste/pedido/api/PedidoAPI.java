package delivery.teste.pedido.api;

import delivery.teste.pedido.api.request.PedidoAlteracaoRequest;
import delivery.teste.pedido.api.request.PedidoRequest;
import delivery.teste.pedido.api.response.PedidoDetalhadoResponse;
import delivery.teste.pedido.api.response.PedidoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/v1/pedido")
public interface PedidoAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PedidoResponse postPedido(@Valid @RequestBody PedidoRequest pedidoRequest);

    @GetMapping(value = "/{idPedido}")
    @ResponseStatus(code = HttpStatus.OK)
    PedidoDetalhadoResponse getPedidoPorId(UUID idPedido);

    @PatchMapping(value = "/{idPedido}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchAlteraPedido(@PathVariable UUID idPedido, @RequestBody @Valid PedidoAlteracaoRequest pedidoAlteracaoRequest);

    @DeleteMapping(value = "/{idPedido}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletePedido(@PathVariable UUID idPedido);
}
