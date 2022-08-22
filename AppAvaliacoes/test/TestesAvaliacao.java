
import br.upf.ccc.classes.Avaliacao;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaqson
 */
public class TestesAvaliacao {
    
    @Test
    public void testeSemNotas(){
        try {
            Avaliacao a = new Avaliacao();
            a.getMedia();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    @Test
    public void testeComDuasNotasSemRec(){
        System.out.println("testeComDuasNotasSemRec");
        try {
            Avaliacao a = new Avaliacao();
            a.setNotaUm(7.8f);
            a.setNotaDois(8.5f);
            a.getMedia();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }    
   
    @Test
    public void testeComDuasNotasComRec(){
        System.out.println("testeComDuasNotasComRec");
        try {
            Avaliacao a = new Avaliacao();
            a.setNotaUm(8.0f);
            a.setNotaDois(8.0f);
            a.setNotaRecuperacao(8.0f);
            System.out.println("média: "+a.getMedia());
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   


    @Test
    public void testeMediaFinal(){
        System.out.println("testeMediaFinal");
        try {
            Avaliacao a = new Avaliacao();
            a.setNotaUm(3.0f);
            a.setNotaDois(1.0f);
            a.setNotaRecuperacao(7.0f);
            System.out.println("média final: "+a.getMediaFinal());
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   
    
    @Test
    public void testeSituacao(){
        System.out.println("testeSituacao");
        try {
            Avaliacao a = new Avaliacao();
            a.setNotaUm(3.0f);
            a.setNotaDois(1.0f);
            a.setNotaRecuperacao(7.0f);
            System.out.println("testeSituacao: "+a.getSituacao());
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }    
    
    @Test
    public void testeSituacaoComExame(){
        System.out.println("testeSituacaoComExame");
        try {
            Avaliacao a = new Avaliacao();
            a.setNotaUm(3.0f);
            a.setNotaDois(1.0f);
            a.setNotaRecuperacao(7.0f);
            a.setNotaExame(4.0f);
            System.out.println("média final: "+a.getMediaFinal());
            System.out.println("testeSituacao: "+a.getSituacao());
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }     
    
}
