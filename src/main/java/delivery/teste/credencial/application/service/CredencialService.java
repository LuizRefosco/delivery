package delivery.teste.credencial.application.service;

import delivery.teste.credencial.domain.Credencial;
import delivery.teste.usuario.application.api.UsuarioNovoRequest;

import javax.validation.Valid;

public interface CredencialService {
	void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo);
	Credencial buscaCredencialPorUsuario(String usuario);
}
