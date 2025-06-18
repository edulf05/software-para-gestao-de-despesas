import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu login (e-mail): ");
        String login = scanner.nextLine().trim();

        if (login.endsWith("@gmail.com")) {
            System.out.println("E-mail aceito");
        } else {
            System.out.println("E-mail não aceito");
        }

        scanner.close();
    }
}
