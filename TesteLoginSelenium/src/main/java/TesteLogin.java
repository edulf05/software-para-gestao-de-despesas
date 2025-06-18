import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class TesteLogin {
    public static void main(String[] args) {
        // Caminho do chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            // Caminho local do seu HTML
            File file = new File("C:/Users/Gamer/Documents/teste_teste/software-para-gestao-de-despesas/menu.html");
            String filePath = "file:///" + file.getAbsolutePath();

            // Abre o arquivo HTML local
            driver.get(filePath);

            // Espera carregar
            Thread.sleep(2000);

            // Preenche login e senha
            WebElement login = driver.findElement(By.name("txtLogin"));
            login.sendKeys("testeLogin");

            WebElement senha = driver.findElement(By.name("txtSenha"));
            senha.sendKeys("12345678");

            // Envia o formulário
            senha.submit();

            Thread.sleep(2000);

            // Verifica se login deu certo
            if (driver.getPageSource().contains("Login efetuado")) {
                System.out.println("✅ Login testado com sucesso!");
            } else {
                System.out.println("❌ Não redirecionou corretamente!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
