package fr.adaming.formation.service;

import java.util.List;
import fr.adaming.formation.model.User;

public interface IUserService {

	public User saveUser(User user);

	public void deleteUser(long idUser);

	public User getOne(long idUser);

	public List<User> getAll();

	public User updateUser(User user);

	public List<User> findByloginUser(String loginUser);

	public boolean existsUserByloginUser(String loginUser);

	public User findByLoginUserAndPwdUser(String login, String password);

}