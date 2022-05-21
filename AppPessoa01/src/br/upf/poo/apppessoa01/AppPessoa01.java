package br.upf.poo.apppessoa01;

import br.upf.poo.apppessoa01.dominio.Pessoa;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppPessoa01 {

    public static void main(String[] args){
        // Vamos instanciar uma pessoa
        
        Pessoa p1; // Só definição, sem inicializar
                   
        p1 = new Pessoa(); // Instanciou o objeto p1
        try {
            p1.setIdade(20);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        p1.setNome("Erikinho delas") ;
        
        //---------------------------------------------------------------------
        // Definir e instanciar pessoa 3
        
        Pessoa p3 = new Pessoa();
        
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Digite a idade da pessoa: ");
        try {
            p3.setIdade(entrada1.nextInt());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa: ");
        p3.setNome(entrada2.nextLine());
        
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
        }
        
        //---------------------------------------------------------------------
        // Vamos mostrar os dados das pessoas p1 e p2
        
        System.out.println(p1.obterMensagem("Sr."));
        System.out.println(p3.obterMensagem("Sr."));
        System.out.println(p4.obterMensagem("Sr."));
    }
    
}
