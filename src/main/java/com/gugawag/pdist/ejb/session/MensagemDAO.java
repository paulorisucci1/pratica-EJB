package com.gugawag.pdist.ejb.session;

import com.gugawag.pdist.modelo.Mensagem;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class MensagemDAO {

    @PersistenceContext(unitName = "bd2")
    private EntityManager em;

    public void inserir(Mensagem novaMensagem) {
        em.persist(novaMensagem);
    }

    public List<Mensagem> listar() {
        return em.createQuery("SELECT m FROM Mensagem m").getResultList();
    }

    public Mensagem pesquisarPorId(long id) {
        return (Mensagem) em.createQuery("SELECT m FROM Mensagem m WHERE m.id = :id")
                .setParameter("id", id)
                .getSingleResult();
    }

}
