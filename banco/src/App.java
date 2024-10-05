import java.util.Scanner;

public class App {
    public static void main(String[] args)  {



    String nome = "igor";
    String tipoConta = "Corrente";
    double saldo = 154.21;
    int opcao = 0;

    System.out.println("*******************");
    System.out.println("\nNome do cilente:" + nome);
    System.out.println("Tipo conta: " + tipoConta);
    System.out.println("Saldo atual: " + saldo);
    System.out.println("\n*****************");

    String menu = """
           \n **Digite sua opção**
            1 - Consultar saldo
            2 - Transferir valor 
            3 - Receber valor
            4 - Sair

            """;
Scanner leitura = new Scanner(System.in);

    while (opcao != 4) {
        System.out.println(menu);
        opcao = leitura.nextInt();
        
        if (opcao == 1) {
            
            System.out.println("Seu saldo é de:" + saldo);

        } else if  (opcao == 2) {
            System.out.println("Qual valor deseja traferir?");
            double valorNovoNegativo = leitura.nextDouble();
            
            if (valorNovoNegativo > saldo) {
                System.out.println("Não há saldo para realizar a transferência");

            } else {
                saldo -= valorNovoNegativo;
                System.out.println("Novo saldo: " + saldo);
            }
          

        } else if (opcao == 3) {
            System.out.println("Qual valor você quer receber?");
            double valorPositivo = leitura.nextDouble();
            
            saldo += valorPositivo;

            System.out.println("Novo saldo adicionado com suscesso: " + saldo);

        } else if (opcao == 4) {
            
        } else {
            System.out.println("Opção invalida");
        }
    }
   
    }
}
