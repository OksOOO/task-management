package de.softwarepunkt.taskmanagement.util;

import org.hibernate.ejb.EntityManagerFactoryImpl;
import org.hibernate.internal.SessionFactoryImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/*import org.apache.log4j.Logger;*/

public class AbstractSB {
    /*private static final Logger LOGGER = Logger.getLogger(AbstractSB.class);*/
 
    @PersistenceContext(unitName = "persistenceUnit")
    protected EntityManager em;

    public void initializeCollection(Collection<?> collection) {
        if (collection == null) {
            return;
        }
        collection.iterator().hasNext();
    }
 
    /**
     * Probably unportable solution
     *
     * @return sql connection
     */
    public Connection getConnection() throws SQLException {
        return ((SessionFactoryImpl) ((EntityManagerFactoryImpl) em.getEntityManagerFactory()).getSessionFactory()).getConnectionProvider().getConnection();
    }
}