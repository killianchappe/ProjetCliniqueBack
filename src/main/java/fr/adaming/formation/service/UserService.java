package fr.adaming.formation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.formation.model.User;
import fr.adaming.formation.repository.IUserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User userVide = new User();
		List<User> listUser = userRepository.findByloginUser(user.getLoginUser());
		if (listUser.size() == 0) {
			return userRepository.save(user);
		} else {
			return userVide;
		}
	}

	@Override
	public void deleteUser(long idUser) {
		userRepository.deleteById(idUser);
	}

	@Override
	public User getOne(long idUser) {
		return userRepository.findById(idUser).get();
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> findByloginUser(String loginUser) {
		return userRepository.findByloginUser(loginUser);
	}

	@Override
	public boolean existsUserByloginUser(String loginUser) {
		return userRepository.existsUserByloginUser(loginUser);
	}

	@Override
	public User findByLoginUserAndPwdUser(String login, String password) {
		User user2 = new User();
		User user = userRepository.findByLoginUserAndPwdUser(login, password);
		if (user != null) {
			user2.setLoginUser(user.getLoginUser());
			return user2;
		}
		return user2;
	}

}