import java.util.Scanner;

public class ContaBancoTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numeroConta;
		String codigoAgencia;
		String nomeCliente;
		double saldoInicial;

		System.out.println("---------------CONTA BANCÁRIA---------------");
		System.out.println();
		System.out.println("Por favor, digite o número da Conta: (1234)");
		numeroConta = scanner.nextInt();

		System.out.println("Agora digite o número da Agência: (123-8)");
		codigoAgencia = scanner.next();

		System.out.println("Me informe seu nome: ");
		nomeCliente = scanner.next();
		scanner.nextLine();

		System.out.println("Agora me informa seu saldo atual: ");
		saldoInicial = scanner.nextDouble();

		System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nomeCliente, codigoAgencia, numeroConta, saldoInicial);

		scanner.close();
	}

}


