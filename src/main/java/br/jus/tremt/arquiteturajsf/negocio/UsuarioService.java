package br.jus.tremt.arquiteturajsf.negocio;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.jus.tremt.arquiteturajsf.modelo.Usuario;

@Stateless
public class UsuarioService {

    @PersistenceContext
    private EntityManager em;

    public Usuario add(Usuario user) {
        em.persist(user);
        return user;
    }

    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public Usuario findById(Long id) {
        return em.find(Usuario.class, id);
    }
    
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public Usuario findByNome(String nome) {
        return em.createQuery("select u from Usuario u where u.nome = :nome", Usuario.class)
        		.setParameter("nome", nome)
        		.getResultList().get(0);
    }
}