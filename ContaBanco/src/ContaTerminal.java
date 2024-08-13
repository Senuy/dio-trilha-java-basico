import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner

        Scanner conta = new Scanner(System.in).useLocale(Locale.US);

        // Exibir e importar as mensagess para o nosso usuário

        System.out.println("Digite o número da conta: ");
        int numConta = conta.nextInt();

        System.out.println("Por Favor digite o número da Agência!");
        String numAgencia = conta.next();

        System.out.println("Digite o nome do cliente da conta: ");
        String nomeCliente = conta.next();

        System.out.println("Por Favor digite o saldo inicial da conta: ");
        double saldo = conta.nextDouble();

        // Obter pelo Scanner os valores digitados no terminal

        // Exibir mensagem de contra criada

        System.out.println("Olá, "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+numAgencia+", conta "+numConta+" e seu saldo "+saldo+" já está disponível para saque.");

    }
}
