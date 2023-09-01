package in.vp.main.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vp.main.entity.User;
import in.vp.main.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		 
		return userRepository.save(user);
	}

}
