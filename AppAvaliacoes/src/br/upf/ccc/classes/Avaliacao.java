/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.ccc.classes;

import java.util.Objects;

/**
 *
 * @author jaqson
 */
public class Avaliacao {
    private Integer matricula;
    private String nome;
    private Float notaUm;
    private Float notaDois;
    private Float notaTres;
    private Float notaRecuperacao;
    private Float notaExame;

    public Float getMedia() throws Exception{
        Float soma = 0f; 
        //Se não tiver uma das três notas (== null).
        if (!(notaUm != null && notaDois != null && notaTres != null)){
            // Se não tem nota de recuperação (== null).
            if (notaRecuperacao == null){
               //Gerar uma exceção que faltam notas para gerar a média.
               throw new Exception("Faltam notas para gerar a média!");
            } else { // Se tem nota de recuperação (!= null).
               Boolean usouRec = false;
               //Usar a nota de recuperação para a nota faltante.
               if (notaUm == null){
                   soma += notaRecuperacao;
                   usouRec = true;
               } else
                   soma += notaUm;
               if (notaDois == null){
                   if (!usouRec){
                      soma += notaRecuperacao;
                      usouRec = true;
                   }
               } else
                   soma += notaDois;               
               if (notaTres == null){
                   if (!usouRec){
                      soma += notaRecuperacao;
                      usouRec = true;
                   }
               } else
                   soma += notaTres;                 
               //Retornar a média aritmética das notas + nota de recuperação.
            }
        } else{
            soma = notaUm + notaDois + notaTres; 
        }
        return soma / 3;
    }
    
    public Float getMediaFinal() throws Exception{
        //Se tem nota de exame (!= null), deve ser a média aritmética entre o resultado do getMedia() e a nota de exame.
        if (notaExame != null)
            return (getMedia()+notaExame) / 2;
        //○ Se não tem nota de exame (== null) deve retornar o valor de getMedia()
        else
           return getMedia();
    }
    
    public String getSituacao() throws Exception{
       // ○ Se tem nota de exame (!= null)
       if (notaExame != null)
          //Se a média final for maior ou igual a 5 retornar “aprovado”, senão “reprovado”.
           if (getMediaFinal() >= 5f)
               return "Aprovado!";
           else 
               return "Reprovado!";
       // ○ Se não tem nota de exame (== null)
       else
          //Se a média final for maior ou igual a 7 retornar “aprovado”, senão “em exame”.
           if (getMediaFinal() >= 7f)
               return "Aprovado!";
           else
               return "Em exame!";
    }
    
    
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(Float notaUm) throws Exception {
        if (notaUm != null && (notaUm < 0 || notaUm > 10))
            throw new Exception("Nota permitida entre 0 e 10!");
        this.notaUm = notaUm; 
    }

    public Float getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(Float notaDois) throws Exception {
        if (notaDois != null && (notaDois < 0 || notaDois > 10))
            throw new Exception("Nota permitida entre 0 e 10!");
        this.notaDois = notaDois;
    }

    public Float getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(Float notaTres) throws Exception {
        if (notaTres != null && (notaTres < 0 || notaTres > 10))
            throw new Exception("Nota permitida entre 0 e 10!");
        this.notaTres = notaTres;
    }

    public Float getNotaRecuperacao() {
        return notaRecuperacao;
    }

    public void setNotaRecuperacao(Float notaRecuperacao) {
        this.notaRecuperacao = notaRecuperacao;
    }

    public Float getNotaExame() {
        return notaExame;
    }

    public void setNotaExame(Float notaExame) {
        this.notaExame = notaExame;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.matricula);
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
        final Avaliacao other = (Avaliacao) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
