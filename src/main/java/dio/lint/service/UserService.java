package dio.lint.service;

import dio.lint.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create(User userToCreate);

}
