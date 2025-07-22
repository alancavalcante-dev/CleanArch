package br.com.alanpcavalcante.CleanArchitecture.domain.usuario;

public class Nome {

    private final String nome;

    public Nome(String nome) {
        if (nome == null || nome.isBlank() || nome.strip().length() <= 2) {
            throw new IllegalArgumentException("O nome deve ter mais de 2 caracteres.");
        }
        this.nome = nome.strip();
    }

    public String getNome() {
        return nome;
    }
}
