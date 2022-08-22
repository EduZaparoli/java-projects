package br.upf.poo.imc;

import br.upf.poo.dominio.Imc;
import java.util.ArrayList;
import java.util.Scanner;


public class AppImc {

    static ArrayList<Imc> lista = new ArrayList<>();
    static Integer codigo = 1;
    
    public static void main(String[] args) {
        
       
        while (true) {  
    
            System.out.println("N = Novo Teste / L = Listar / E = Excluir Teste / S = Sair");
            System.out.print("Digite sua opção: ");
            String opcao = new Scanner(System.in).nextLine();
            switch(opcao){
                case "N": 
                    inserir();
                    break;
                case "L":
                    listar();
                    break;
                case "E":
                    System.out.print("Digite o codigo da pessoa a ser excluida: ");     
                    Integer codigo = new Scanner (System.in).nextInt();
                    excluir(codigo);
                    break;
                case "S":
                    System.exit(0);
            }
         
        }
        
    }
    //--------------------------------------------------------------------------
    private static void inserir() {
        
        Imc imc1 = new Imc();
        
        imc1.setCodigo(codigo++);
        
        /*
        try {
            Imc obj = new Imc();
            System.out.print("Nome: ");
            obj.setNome(new Scanner(System.in).nextLine());
        } catch (Exception exception) {
        }
        */
        
        Scanner nome = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa: ");
        try {
            imc1.setNome(nome.nextLine());
        } catch (Exception ex) {
        }
        
        Scanner altura = new Scanner(System.in);
        System.out.print("Digite a altura da pessoa: ");
        try {
            imc1.setAltura(altura.nextFloat());
        } catch (Exception ex) {
        }
        
        Scanner peso = new Scanner(System.in);
        System.out.print("Digite a peso da pessoa: ");
        try {
            imc1.setPeso(peso.nextFloat());
        } catch (Exception ex) {
        }
        
        lista.add(imc1);
     
    }
    //--------------------------------------------------------------------------
    private static void listar() {
        for(Imc i : lista){
            System.out.println(i.obterMensagem(""));
        }
    }
    //--------------------------------------------------------------------------
    private static void excluir(Integer codigo) {
        
        lista.removeIf(obj -> obj.getCodigo() == codigo);
        
        return ;
    }
}
