package de.softwarepunkt.taskmanagement.data;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.softwarepunkt.taskmanagement.model.User;

@Stateless
public class GenericSB {
	
	@PersistenceContext(unitName = "primary")
    private EntityManager em;

    public User saveUser(User user) {
        return em.merge(user);
    }
    
    public User findById(Long id) {
        return em.find(User.class, id);
    }

}
