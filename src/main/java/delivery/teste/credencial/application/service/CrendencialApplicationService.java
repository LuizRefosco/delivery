package delivery.teste.credencial.application.service;

import delivery.teste.cliente.api.request.ClienteRequest;
import delivery.teste.credencial.application.repository.CredencialRepository;
import delivery.teste.credencial.domain.Credencial;
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
	public void criaNovaCredencial(@Valid ClienteRequest clienteRequest) {
		log.info("[inicia] CrendencialService - criaNovaCredencial");
		var novaCredencial = new Credencial(clienteRequest.getNome());
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
