import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else {
            double difSaqueSaldo = saque - saldo;
            
            if (difSaqueSaldo<=limiteChequeEspecial) {
              System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
              System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
            
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
