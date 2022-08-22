/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.poo.apppessoa01.dominio;

/**
 * Classe que define as características de pessoas para o software.
 * @author eduzz
 */
public class Pessoa {
    //Atrbutos para a pessoa
    /**
     * Aqui deve ter o nome da pessoa
     */
    private String nome;
    
    /**
     * Aqui deve ter a idade da pessoa em anos
     */
    private Integer idade;
    
    
    //Agora vamos definir operações / métodos
    /**
     * Este método retorna aproximadamente os dias que a pessao viveu.
     * Não considera ano bissexto, é um calculo simples.
     * @return Retorna um inteiro com os dias vividos
     */
    public Integer obterDiasVividos(){
        return idade * 365;
    }
    
    /**
     * Retorna os meses vividos aproximadamente
     * @return Retorna um inteiro com os meses vividos
     */
    public Integer obterMesesVividos(){
        return idade * 12;
    }
    
    /**
     * Metodo que retorna uma mensagem completa sobre o objeto
     * @param profixo a ser usado para o nome, EX: sr. sra.
     * @return String com mensagem completa
     */
    public String obterMensagem(String profixo){
        return profixo + " " + nome + ". Você viveu aproximadamente " + obterDiasVividos() + " dias.";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) throws Exception {
        if(idade < 18)
            throw new Exception("Não é permitido menores de 18 anos.");
        this.idade = idade;
    }
    
    
    
}
