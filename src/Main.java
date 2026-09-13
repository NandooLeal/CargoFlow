import model.Motorista;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Motorista> motoristas = new ArrayList<>();

        int opcao;

        do{
           
           System.out.println("========================");
           System.out.println("          CARGO FLOW    ");
           System.out.println("========================");
           System.out.println("1 - Cadastrar motorista ");
           System.out.println("2 - Listar motoristas ");
           System.out.println("0 - Sair");
           System.out.print("Escolha uma opção: ");   
                  
           opcao = scanner.nextInt();        
        
           switch (opcao) {
            case 1:
                System.out.println("Cadastro de motorista selecionado.");
                scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("CNH: ");
                String cnh = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();

                Motorista motorista = new Motorista(nome, cpf, cnh, telefone);
                motoristas.add(motorista);

                System.out.println("\nMotorista cadastro com sucesso!");
                motorista.exibirDados();

                break;

            case 2:
                System.out.println("Lista de motoristas selecionada.");

                for ( int i = 0; i < motoristas.size(); i++){
                motoristas.get(i).exibirDados();

                }
                break;

            case 0:
                System.out.println("Encerrando o CargoFlow...");
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }     
        
    }while (opcao != 0); 
    
        scanner.close();
        
    }
}