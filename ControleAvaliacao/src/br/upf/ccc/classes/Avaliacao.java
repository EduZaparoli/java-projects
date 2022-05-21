package br.upf.ccc.classes;


public class Avaliacao {

    private Integer matricula;
    private String nome;
    private Float notaUm;
    private Float notaDois;
    private Float notaTres;
    private Float notaRecuperacao;
    private Float notaExame;

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
        if(notaUm < 0 || notaUm > 10){
            throw new Exception("A nota deve ser maior que 0 e manor que 10!");
        }
        this.notaUm = notaUm;
    }

    public Float getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(Float notaDois) throws Exception {
        if(notaDois < 0 || notaDois > 10){
            throw new Exception("A nota deve ser maior que 0 e manor que 10!");
        }
        this.notaDois = notaDois;
    }

    public Float getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(Float notaTres) throws Exception {
        if(notaTres < 0 || notaTres > 10){
            throw new Exception("A nota deve ser maior que 0 e manor que 10!");
        }
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
    
    public Float getMedia() throws Exception{
        if(this.getNotaRecuperacao() == null){
            if(this.getNotaUm() == null || this.getNotaDois() == null || this.getNotaTres() == null){
                throw new Exception("Faltam notas para gerar a media!");
            }
        }
        if(this.getNotaUm() == null){
            return (this.getNotaRecuperacao() + this.getNotaDois() + this.getNotaTres()) / 3; 
        }
        if(this.getNotaDois() == null){
            return (this.getNotaUm() + this.getNotaRecuperacao() + this.getNotaTres()) / 3; 
        }
        if(this.getNotaTres() == null){
            return (this.getNotaUm() + this.getNotaDois() + this.getNotaRecuperacao()) / 3; 
        }
        return (this.getNotaUm() + this.getNotaDois() + this.getNotaTres()) / 3;
    }
    
    public Float getMediaFinal() throws Exception{
        if(this.getNotaExame() != null){
            return this.getMedia() + this.getNotaExame() / 2;
        }else{
            return this.getMedia();
        }
    }
    
    public String getSituacao() throws Exception{
        if(this.getNotaExame() != null){
            if(this.getMediaFinal() >= 5 ){
                return "Aprovado";
            }else{
                return "Reprovado";
            }
        }
        else{
            if(this.getMediaFinal() >= 7){
                return "Aprovado";
            }
            else{
                return "Em exame";
            }
        }
    }
}
