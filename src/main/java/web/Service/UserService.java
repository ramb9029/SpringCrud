package web.Service;

import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User getUser(int id);
    void save(User user);
    void update(int id, User updatePerson);
    void delete(int id);

}
