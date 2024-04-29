import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o saldo da conta: ");
        float saldo = scanner.nextFloat();

        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
