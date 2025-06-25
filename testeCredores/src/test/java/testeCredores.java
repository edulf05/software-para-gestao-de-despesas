import java.util.Scanner;

public class testeCredores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do credor para cadastrar: ");
        String nomeCredor = scanner.nextLine().trim();

        if (nomeCredor.isEmpty()) {
            System.out.println(" Campo nome não pode ser vazio!");
        } else {
            System.out.println(" Credor '" + nomeCredor + "' cadastrado com sucesso!");
        }

        scanner.close();
    }
}