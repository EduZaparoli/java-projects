package br.upf.poo.apppessoa02;

import br.upf.poo.apppessoa02.dominio.Pessoa;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppPessoa02 {
    
    //definir e iniciaizar atributo para lista de pessoas
    
    static ArrayList<Pessoa> lista = new ArrayList<>();
    

    public static void main(String[] args){
                   
        while (true) {  
    //ler opção do usuário
    
            System.out.println("1 = Inserir / 2 = Listar / 3 = Sair");
            System.out.print("Digite sua opção: ");
            String opcao = new Scanner(System.in).nextLine();
            switch(opcao){
                case "1": 
                    //inserir();
                    inserir2();
                    break;
                case "2":
                    listar();
                    break;
                case "3":
                    System.exit(0);
            }
         
        }
        
    }

    private static void inserir() {
        // Vamos instanciar uma pessoa
        
        Pessoa p1; // Só definição, sem inicializar
                   
        p1 = new Pessoa(); // Instanciou o objeto p1
        try {
            System.out.print("Idade: ");
            Integer lido = new Scanner(System.in).nextInt();
            p1.setIdade(20);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.print("Nome: ");
        p1.setNome(new Scanner(System.in).nextLine());
        
        //adicionar na lista
        
        lista.add(p1);
        
    }
    
    //---------------------------------------------------------------------
    
    private static void inserir2() {
       
        // Definir e instanciar pessoa 3
        
        Pessoa p3 = new Pessoa();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa: ");
        p3.setNome(entrada2.nextLine());
        
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Digite a idade da pessoa: ");
        try {
            p3.setIdade(entrada1.nextInt());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        lista.add(p3);
    }
        
        /*
        //---------------------------------------------------------------------
        // Definir e instanciar pessoa 4
        
        Pessoa p4 = new Pessoa();
        
        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa: ");
        p4.setNome(entrada3.nextLine());
        Scanner entrada4 = new Scanner(System.in);
        System.out.print("Digite a idade da pessoa: ");
        try {
        p4.setIdade(entrada4.nextInt());
        } catch (Exception ex) {
        System.out.println(ex.getMessage());
        System.out.print("Digite a idade da pessoa: ");
        try {
        p4.setIdade(entrada4.nextInt());
        } catch (Exception ex1) {
        System.out.println(ex.getMessage());
        System.out.print("Digite a idade da pessoa: ");
        }
        }
        
        //---------------------------------------------------------------------
        // Vamos mostrar os dados das pessoas p1 e p2
        
        System.out.println(p1.obterMensagem("Sr."));
        System.out.println(p3.obterMensagem("Sr."));
        System.out.println(p4.obterMensagem("Sr."));
        */

    private static void listar() {
        for(Pessoa p : lista){
            System.out.println(p.obterMensagem(""));
        }
    }
    
}
