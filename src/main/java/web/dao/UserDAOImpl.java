package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@ComponentScan("config")
public class UserDAOImpl implements UserDAO {

    private EntityManager entityManager;

    @Autowired
    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<User> index() {
        return entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
    }

    public User getUser(int id){
        return entityManager.find(User.class, id);
    }

    public void save (User user){
        entityManager.persist(user);
    }

    public void update (int id, User updatePerson) {
        User personToBeUpdate =  entityManager.getReference(User.class,id);

        personToBeUpdate.setName(updatePerson.getName());
        personToBeUpdate.setLastName(updatePerson.getLastName());
        personToBeUpdate.setEmail(updatePerson.getEmail());
    }

    public void delete (int id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
        }

    }
}
