import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Atributos
        int numero = 0;
        String agencia;
        String nomeCliente;
        Double saldo = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, Digite o número:");
        numero = sc.nextInt();
        System.out.println("Digite o número da sua agência:");
        agencia = sc.next();
        System.out.println("Digite o seu nome:");
        nomeCliente = sc.next();
        System.out.println("Digite o saldo da conta:");
        saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo +
                " já está disponível para saque.");

    }
}
