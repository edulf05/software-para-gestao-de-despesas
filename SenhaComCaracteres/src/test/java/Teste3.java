import java.util.Scanner;
import java.util.regex.Pattern;

public class Teste3 {
    public static boolean validarSenha(String senha) {
        if (senha == null) return false;

        boolean temLetra = senha.matches(".*[a-zA-Z].*");
        boolean temNumero = senha.matches(".*\\d.*");
        boolean temEspecial = senha.matches(".*[!@#$%^&*(),.?\":{}|<>].*");

        return temLetra && temNumero && temEspecial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        scanner.close();

        if (validarSenha(senha)) {
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida");
        }
    }
}
