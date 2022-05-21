package br.upf.poo.dominio;

import java.util.Objects;

public class Imc {
    
    private Integer codigo;
    
    private String nome;
    
    private Float peso;
    
    private Float altura;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Imc other = (Imc) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    
    
    //seleciona a linha -- refactor -- encapsulate fields
    //seleciona a linha -- insert code -- 
    //--------------------------------------------------------------------------
    public Integer getCodigo() {
        return codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    //--------------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.length() < 2){
            throw new Exception("O nome deve ter mais de um caractere");
        }
        this.nome = nome;
    }
    //--------------------------------------------------------------------------
    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) throws Exception {
        if(peso <= 1){
            throw new Exception("Insira um peso maior que 1kg");
        }
        this.peso = peso;
    }
    //--------------------------------------------------------------------------
    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) throws Exception {
        if(altura < 0.3){
            throw new Exception("A altura deve ser maior que 0,3");
        }
        this.altura = altura;
    }
    //--------------------------------------------------------------------------
    public Float getIndice(){
        return peso / (altura * altura);
    }
    
    public String getClassificacao(){
        Float indice = getIndice();
        if(indice < 18.5){
            return "Magreza";
        }
        else if(indice >= 18.5 && indice <= 24.9){
            return "Normal";
        }
        else if(indice >= 25.0 && indice <= 29.9){
            return "Sobrepeso";
        }
        else if(indice >= 30.0 && indice <= 39.9){
            return "Obesidade";
        }
        else if(indice >= 40){
            return "Obesidade Grave";
        }
        
        return getClassificacao();
        
    }
    //--------------------------------------------------------------------------
    public String obterMensagem(String prefixo) {
        return prefixo + " " + "codigo: " + getCodigo() + " nome: " + getNome() + " altura: " + getAltura() + " peso: " + getPeso() + " Indice: " + getIndice() + " IMC: " + getClassificacao();
    }
    
    
}
