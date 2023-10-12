package ravelo.service;

import ravelo.model.User;

public interface UserService {
    User findById(Long id);
    User createUser(User userToCreate);
}
