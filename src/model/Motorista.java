package model;

public class Motorista {
    private String nome;
    private String cpf;
    private String cnh;
    private String telefone;


    public Motorista(String nome, String cpf, String cnh, String telefone){
       this.nome = nome;
       this.cpf = cpf;
       this.cnh = cnh;
       this.telefone = telefone;
    }

    public String getCpf(){

        return cpf;

    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("CNH: " + cnh);
        System.out.println("Telefone: " + telefone);                
    }
}