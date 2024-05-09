import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu numero");
    int numero = scanner.nextInt();
    System.out.println("Digite sua agencia");
    String agencia = scanner.next();
    System.out.println("Digite seu nome");
    String nome = scanner.next();
    System.out.println("Digite saldo");
    double saldo = scanner.nextDouble();
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo);
  }
}
