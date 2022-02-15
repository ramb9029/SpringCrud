package web.dao;

import web.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
    User getUser(int id);
    void save(User user);
    void update(int id, User updatePerson);
    void delete(int id);

}
