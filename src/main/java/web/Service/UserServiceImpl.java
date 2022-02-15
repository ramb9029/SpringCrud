package web.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getUsers() {
        return userDAO.index();
    }

    @Override
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDAO.save(user);

    }

    @Override
    @Transactional
    public void update(int id, User updatePerson) {
        userDAO.update(id, updatePerson);

    }

    @Override
    @Transactional
    public void delete(int id) {
        userDAO.delete(id);

    }
}
