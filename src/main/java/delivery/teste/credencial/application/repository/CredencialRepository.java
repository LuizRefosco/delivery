package delivery.teste.credencial.application.repository;

import delivery.teste.credencial.domain.Credencial;

public interface CredencialRepository {
	Credencial salva(Credencial credencial);
	Credencial buscaCredencialPorUsuario(String usuario);
}
