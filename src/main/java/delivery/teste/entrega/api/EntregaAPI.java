package delivery.teste.entrega.api;
import delivery.teste.entrega.api.request.EntregaAlteracaoRequest;
import delivery.teste.entrega.api.request.EntregaRequest;
import delivery.teste.entrega.api.response.EntregaDetalhadaResponse;
import delivery.teste.entrega.api.response.EntregaResponse;
import delivery.teste.pedido.api.request.PedidoAlteracaoRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/v1/entrega")
public interface EntregaAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    EntregaResponse postEntrega(@Valid @RequestBody EntregaRequest entregaRequest);

    @GetMapping(value = "/{idEntrega}")
    @ResponseStatus(code = HttpStatus.OK)
    EntregaDetalhadaResponse getEntregaPorId(UUID idEntrega);

    @PatchMapping(value = "/alteraEntrega/{idEntrega}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchAlteraEntrega(@PathVariable UUID idEntrega, @RequestBody @Valid EntregaAlteracaoRequest entregaAlteracaoRequest);

    @DeleteMapping(value = "/deletaEntrega/{idEntrega}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deleteEntrega(@PathVariable UUID idEntrega);
}
