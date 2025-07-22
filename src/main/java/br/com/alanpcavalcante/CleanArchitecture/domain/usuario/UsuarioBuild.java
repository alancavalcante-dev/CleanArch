package br.com.alanpcavalcante.CleanArchitecture.domain.usuario;

public class UsuarioBuild {

    private Usuario usuario;

    public UsuarioBuild(Usuario usuario) {
        this.usuario = usuario;
    }


    public UsuarioBuild criarLogin(Login login, Password password) {
        usuario.setLogin(login);
        usuario.setPassword(password);
        return this;
    }

    public UsuarioBuild criarPerfil(Nome nome, Cpf cpf, Email email, Telefone telefone) {
        usuario.setNome(nome);
        usuario.setCpf(cpf);
        usuario.setEmail(email);
        usuario.setTelefone(telefone);
        return this;
    }

    public UsuarioBuild implementarEndereco(Endereco endereco) {
        usuario.setEndereco(endereco);
        return this;
    }

    public Usuario build() {
        return usuario;
    }

}
