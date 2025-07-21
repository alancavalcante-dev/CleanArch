package br.com.alanpcavalcante.CleanArchitecture.domain.usuario;

public class Telefone {

    private String telefone;

    public Telefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (!telefone.matches("^\\(?\\d{2}\\)?\\s?(9?\\d{4})-?\\d{4}$\n")) {
            throw new IllegalArgumentException("Telefone incorreto!");
        }
        this.telefone = telefone;
    }
}
