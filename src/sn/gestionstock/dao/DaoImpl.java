package sn.gestionstock.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DaoImpl <T> implements IDao<T> {

    private EntityManager em;
    public DaoImpl(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("gestionstock");
        em=emf.createEntityManager();
    }

    @Override
    public int add(T t) {
        int  ok;
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
            ok=1;
        }catch (Exception ex){
            ex.printStackTrace();
            ok =0;
        }
        return  ok;
    }

    @Override
    public int update(T t) {
        int  ok;
        try {
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
            ok=1;

        }catch (Exception ex){
            ex.printStackTrace();
            ok =0;
        }
        return  ok;
    }

    @Override
    public int delete(int id, T t) {
        int  ok;
        try {
          /*  em.getTransaction().begin();
            t=(T) em.createQuery("SELECT obj FROM "+t.getClass().getSimpleName()+
                    " obj WHERE obj.id=:idT")
                    .setParameter("idT",id)
                    .getSingleResult();*/
            t = (T) em.find(t.getClass(),id);
            em.remove(t);
            em.getTransaction().commit();
            ok=1;

        }catch (Exception ex){
            ex.printStackTrace();
            ok =0;
        }
        return  ok;

    }

    @Override
    public List<T> getAll(T t) {
        return em.createQuery("SELECT t FROM"+t.getClass().getSimpleName()+"t")
                .getResultList();    }

    @Override
    public T get(int id, T t) {
        return (T) em.find(t.getClass(),id);
    }
}
