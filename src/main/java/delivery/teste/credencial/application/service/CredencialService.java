package delivery.teste.credencial.application.service;

import delivery.teste.cliente.api.request.ClienteRequest;
import delivery.teste.credencial.domain.Credencial;

import javax.validation.Valid;

public interface CredencialService {
	void criaNovaCredencial(@Valid ClienteRequest clienteRequest);
	Credencial buscaCredencialPorUsuario(String usuario);

}
