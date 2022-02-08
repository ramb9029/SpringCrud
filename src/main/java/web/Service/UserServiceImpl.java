package web.Service;

import org.springframework.stereotype.Service;
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
    public List<User> index() {
        return userDAO.index();
    }

    @Override
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    public void save(User user) {
        userDAO.save(user);

    }

    @Override
    public void update(int id, User updatePerson) {
        userDAO.update(id, updatePerson);

    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);

    }
}
