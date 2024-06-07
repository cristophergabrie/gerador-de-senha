import java.security.SecureRandom;

public class GeradorDeSenha {
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
    private static final int TAMANHO_SENHA = 12;

    public static void main(String[] args) {
        System.out.println("Senha gerada: " + gerarSenha());
    }

    public static String gerarSenha() {
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder(TAMANHO_SENHA);

        for (int i = 0; i < TAMANHO_SENHA; i++) {
            int indexAleatorio = random.nextInt(CARACTERES.length());
            senha.append(CARACTERES.charAt(indexAleatorio));
        }

        return senha.toString();
    }
}
