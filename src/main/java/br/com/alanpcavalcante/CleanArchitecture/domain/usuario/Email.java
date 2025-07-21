package br.com.alanpcavalcante.CleanArchitecture.domain.usuario;

public class Email {

    private String email;

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\n")) {
            throw new IllegalArgumentException("E-mail incorreto!");
        }
        this.email = email;
    }

}
