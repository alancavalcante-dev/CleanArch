package br.com.alanpcavalcante.CleanArchitecture.domain.usuario;

public class Nome {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank() || nome.length() <= 2) {
            throw new IllegalArgumentException("O nome tem que ter mais de 2 caracteres");
        }
        this.nome = nome.strip();
    }
}
