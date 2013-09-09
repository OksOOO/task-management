package de.softwarepunkt.taskmanagement.data;

import javax.ejb.EJB;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import sun.java2d.loops.DrawGlyphListAA.General;
import de.softwarepunkt.taskmanagement.model.User;

@ApplicationScoped
@TransactionManagement(TransactionManagementType.CONTAINER)
public class UserSB {
	
	@EJB
    private GenericSB genericSB;
	
	public User findById(Long id) {
        return genericSB.findById(id);
    }

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public User save(User user){
		user = genericSB.saveUser(user);
		return user;
	}

}
