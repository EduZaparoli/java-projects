package br.upf.prova.domain;

import java.util.Objects;


public class Prova183132 {
    
    private String cpf;
    private String nome;
    private Float temperatura;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if(cpf == null){
            throw new Exception("Insira um cpf!");
        }
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome == null){
            throw new Exception("Insira um nome!");
        }
        this.nome = nome;
    }

    public Float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Float temperatura) throws Exception {
        if(temperatura <30 || temperatura >45){
            throw new Exception("Temperatura deve estar entre 30 e 45!");
        }
        this.temperatura = temperatura;
    }
    
    public String getClassificacao(){
        
        if(temperatura >= 35.5 && temperatura <=37){
            return "Normotermia";
        }
        else if(temperatura <35.5 && temperatura >=30){
            return "Hipotermia";
        }
        else if(temperatura >37 && temperatura <37.5){
            return "Febre leve ou febrícula ou subfebril";
        }
        else if(temperatura >= 37.5 && temperatura <= 38.5){
            return "Febre moderada";
        }
        else if(temperatura > 38.5 && temperatura <=41){
            return "Febre alta ou elevada";
        }
        else if(temperatura > 41){
            return "Hiperpirexia";
        }
        
        return getClassificacao();
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cpf);
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
        final Prova183132 other = (Prova183132) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    
    
}
