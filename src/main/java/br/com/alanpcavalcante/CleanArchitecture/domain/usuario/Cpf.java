package br.com.alanpcavalcante.CleanArchitecture.domain.usuario;

public class Cpf {

    String cpf;

    public Cpf(String cpf) {
        validarExpressaoCpf(cpf);
        validarCpf(cpf);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }


    private void validarExpressaoCpf(String cpf) {
        if (!cpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$")) {
            throw new IllegalArgumentException("Formato do cpf incorreto, valor esperado: xxx.xxx.xxx-xx");
        }
    }

    private void validarCpf(String cpf) {

        cpf = cpf.replace(".", "").replace("-", "");

        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            throw new IllegalArgumentException("");
        }

        try {
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (cpf.charAt(i) - '0') * (10 - i);
            }
            int digito1 = 11 - (soma % 11);
            digito1 = (digito1 >= 10) ? 0 : digito1;

            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (cpf.charAt(i) - '0') * (11 - i);
            }
            int digito2 = 11 - (soma % 11);
            digito2 = (digito2 >= 10) ? 0 : digito2;

            boolean validado = (cpf.charAt(9) - '0') == digito1 && (cpf.charAt(10) - '0') == digito2;
            if (!validado) {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("CPF incorreto!");
        }
    }


}
