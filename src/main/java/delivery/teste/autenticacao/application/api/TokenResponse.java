package delivery.teste.autenticacao.application.api;

import delivery.teste.autenticacao.domain.Token;
import lombok.Value;

@Value
public class TokenResponse {
	private String token;
	private String tipo;

	public TokenResponse(Token token) {
		this.token = token.getToken();
		this.tipo = token.getTipo();
	}
}