package delivery.teste.autenticacao.application.service;

import delivery.teste.autenticacao.domain.Token;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public interface AutenticacaoApplicationService {
    Token autentica(UsernamePasswordAuthenticationToken userCredentials);
    Token reativaToken(String tokenExpirado);
}
