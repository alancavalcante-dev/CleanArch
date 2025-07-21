package br.com.alanpcavalcante.CleanArchitecture.domain.usuario;

public class Password {

    private String password;

    public Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        password = password.strip();

        if (password.isBlank() || password.length() < 9) {
            throw new IllegalArgumentException("Senha tem que ter no minímo 8 caracteres");
        }

        String especiais = "!@#$%¨&*()-_=+[{]}?/;:.,";
        boolean contemEspecial = false;

        for (char c : especiais.toCharArray()) {
            if (password.contains(String.valueOf(c))) {
                contemEspecial = true;
                break;
            }
        }
        if (contemEspecial) {
            throw new IllegalArgumentException("Senha deve ter pelo menos 1 caracter especial: !@#$%¨&*()-_=+[{]}?/;:.,");
        }

        String numeros = "0123456789";
        boolean contemNumero = false;

        for (char c : numeros.toCharArray()) {
            if (password.contains(String.valueOf(c))) {
                contemNumero = true;
                break;
            }
        }
        if (contemNumero) {
            throw new IllegalArgumentException("Deve ter pelo menos 1 número");
        }

        this.password = password;
    }
}
