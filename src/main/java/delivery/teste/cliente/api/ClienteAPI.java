package delivery.teste.cliente.api;

import delivery.teste.cliente.api.request.ClienteAlteracaoRequest;
import delivery.teste.cliente.api.request.ClienteRequest;
import delivery.teste.cliente.api.response.ClienteDetalhadoResponse;
import delivery.teste.cliente.api.response.ClienteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);

    @GetMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    ClienteDetalhadoResponse getClientePorId(UUID id);

    @PatchMapping(value = "/{id Cliente}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchAlteraCliente(@PathVariable UUID idCliente, @RequestBody @Valid ClienteAlteracaoRequest clienteAlteracaoRequest);

    @DeleteMapping(value = "/{idCliente}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaCliente(@PathVariable UUID idCliente);

}
