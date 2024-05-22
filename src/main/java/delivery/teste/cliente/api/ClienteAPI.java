package delivery.teste.cliente.api;

import delivery.teste.cliente.api.request.ClienteRequest;
import delivery.teste.cliente.api.response.ClienteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);
}
