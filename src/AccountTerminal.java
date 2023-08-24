import java.util.Locale;
import java.util.Scanner;

public class AccountTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String name = scanner.next();

        System.out.println("Digite sua agência");
        String agency = scanner.next();

        System.out.println("Digite seu numero");
        int number = scanner.nextInt();

        System.out.println("Digite seu saldo");
        double balance = scanner.nextDouble();

        System.out.println("Olá " + name + ",obrigado por criar uma conta em nosso banco, sua agência é " + agency
                + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque.");
    }

}
