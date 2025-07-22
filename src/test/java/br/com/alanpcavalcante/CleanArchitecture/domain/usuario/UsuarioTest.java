package br.com.alanpcavalcante.CleanArchitecture.domain.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    public void criaUsuario() {
        UsuarioBuild usuarioBuilder = new UsuarioBuild(new Usuario());

        Endereco endereco = new Endereco(
                "Rua Benedita...",
                "Taboão da Serra",
                "São Paulo",
                "122");

        Usuario usuario = usuarioBuilder
                .criarLogin(new Login("alan"), new Password("alan"))
                .criarPerfil(
                        new Nome("Alan Pereira Cavalcante"),
                        new Cpf("356.421.100-47"),
                        new Email("alan@example.com"),
                        new Telefone("11986815754")
                )
                .implementarEndereco(endereco)
                .build();

        Assertions.assertEquals("Alan Pereira Cavalcante", usuario.getNome().getNome());
        Assertions.assertEquals("Taboão da Serra", usuario.getEndereco().getCidade());

    }

}