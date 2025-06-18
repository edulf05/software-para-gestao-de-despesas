import java.util.Scanner;

public class TesteDespesas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da despesa para cadastrar: ");
        String nomeDespesa = scanner.nextLine().trim();

        if (nomeDespesa.isEmpty()) {
            System.out.println(" Campo nome da despesa não pode ser vazio!");
        } else {
            System.out.println(" Despesa '" + nomeDespesa + "' cadastrada com sucesso!");
        }

        scanner.close();
    }
}