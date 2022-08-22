package classes;

import br.upf.poo.dominio.Imc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean
@SessionScoped
public class ImcBean implements Serializable{

    private List<Imc> lista;
    private Imc imc;
    //atributo para a conexão ao BD
    private EntityManagerFactory factory;
    
    public void novo(){
        imc = new Imc();
    }
    
    public void salvar(){
        //salvar no BD
        EntityManager em = factory.createEntityManager();
        //transação iniciada com o BD
        em.getTransaction().begin();
        //mandar para o BD
        em.merge(imc);
        em.getTransaction().commit();
        em.close();
        //imc = new Imc();
        atualizar();
    }

    public ImcBean() {
        //iniciar a factory e a conexão ao BD
        factory = Persistence.createEntityManagerFactory("WebImc2.0BDPU");
        //imc = new Imc();
        atualizar();
    }
    
    public void atualizar() {
        EntityManager em = factory.createEntityManager();
        //pega todas as instancias de Imc, guarda em i e retorna i
        //depois monta um array list
        lista = em.createQuery("select i from Imc i").getResultList();
        em.close();
    }
    
    public List<Imc> getLista() {
        return lista;
    }

    public void setLista(List<Imc> lista) {
        this.lista = lista;
    }
    
    public Imc getImc() {
        return imc;
    }

    public void setImc(Imc imc) {
        this.imc = imc;
    }
    
}
