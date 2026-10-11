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
           System.out.println("3 - Buscar motorista por CPF ");
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
                
                if (motoristas.isEmpty()){
                    System.out.println("Nenhum motorista cadastrado. ");

                } else {

                    for ( int i = 0; i < motoristas.size(); i++){
                        motoristas.get(i).exibirDados();
                    }

                }    
                break;

            case 3:
                System.out.println("Busca de motorista por CPF. ");
                scanner.nextLine();
                
                System.out.println("Digite o CPF que deseja buscar : ");
                String cpfBusca = scanner.nextLine();

                boolean encontrado = false;   

                    for ( int i = 0; i < motoristas.size(); i++){

                        if (cpfBusca.equals(motoristas.get(i).getCpf())){
                            motoristas.get(i).exibirDados();
                            encontrado = true;
                        }

                    } 
                        if (!encontrado) {
                            System.out.println("Motorista não encontrado. ");
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