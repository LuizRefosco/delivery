package delivery.teste.credencial.application.service;

import delivery.teste.credencial.application.repository.CredencialRepository;
import delivery.teste.credencial.domain.Credencial;
import delivery.teste.usuario.application.api.UsuarioNovoRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
@RequiredArgsConstructor
@Slf4j
public class CrendencialApplicationService implements CredencialService {
	private final CredencialRepository credencialRepository;
	
	@Override
	public void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo) {
		log.info("[inicia] CrendencialService - criaNovaCredencial");
		var novaCredencial = new Credencial(usuarioNovo.getEmail(), usuarioNovo.getSenha());
		credencialRepository.salva(novaCredencial);
		log.info("[finaliza] CrendencialService - criaNovaCredencial");
	}
	
	@Override
	public Credencial buscaCredencialPorUsuario(String usuario) {
		log.info("[inicia] CredencialSpringDataJpaService - buscaCredencial");
		Credencial credencial = credencialRepository.buscaCredencialPorUsuario(usuario);
		log.info("[finaliza] CredencialSpringDataJpaService - buscaCredencial");
		return credencial;
	}
}
