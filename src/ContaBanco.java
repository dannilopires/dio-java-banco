import java.util.Scanner;

public class ContaBanco  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ContaTerminal ct = new ContaTerminal();

        System.out.println("Por favor, digite o número da agência: ");
        ct.numero = input.nextInt();
        ct.agencia = input.next();
        ct.nomeCliente = input.next();
        ct.saldo = input.nextDouble();
        
        input.close();

        System.out.println("Olá, " + ct.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + ct.agencia + ", conta " + ct.numero + " e seu saldo " + ct.saldo + " já está disponível para saque.");

    }
}
