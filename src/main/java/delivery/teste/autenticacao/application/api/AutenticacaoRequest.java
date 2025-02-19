package delivery.teste.autenticacao.application.api;

import lombok.Builder;
import lombok.Data;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
public class AutenticacaoRequest {
	@NotNull
	@NotBlank(message = "O usuário não pode estar em branco!")
	@Email
	private String usuario;
	@Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
	@NotNull
	private String senha;

	public UsernamePasswordAuthenticationToken getUserPassToken() {
		return new UsernamePasswordAuthenticationToken(usuario, senha);
	}
}
