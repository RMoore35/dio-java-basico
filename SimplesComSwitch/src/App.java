import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    saldo = scanner.nextDouble() + saldo;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double sacado = scanner.nextDouble();
                    if(sacado > saldo) {
                      System.out.println("Saldo insuficiente.");
                    } else {
                      saldo = saldo - sacado;
                      System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; 
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
    }
}
