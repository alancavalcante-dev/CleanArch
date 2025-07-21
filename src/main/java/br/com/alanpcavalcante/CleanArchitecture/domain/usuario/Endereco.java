package br.com.alanpcavalcante.CleanArchitecture.domain.usuario;

public class Endereco {

    private String rua;
    private String cidade;
    private String estado;
    private String numero;

    public Endereco(String rua, String cidade, String estado, String numero) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        caracteresMinimos(rua);
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        caracteresMinimos(cidade);
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        caracteresMinimos(estado);
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    private void caracteresMinimos(String texto) {
        if (texto.length() <= 2) {
            throw new IllegalArgumentException("Tem que ser maior de 2 caracteres");
        }
    }
}
