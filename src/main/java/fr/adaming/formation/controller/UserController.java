package fr.adaming.formation.controller;

import java.security.Key;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.adaming.formation.model.Token;
import fr.adaming.formation.model.User;
import fr.adaming.formation.service.IUserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@RestController
@RequestMapping("user")
@CrossOrigin("http://localhost:4200")
public class UserController {

	Key cle = Keys.secretKeyFor(SignatureAlgorithm.HS256);

	@Autowired
	IUserService userService;

	@GetMapping
	public List<User> getAll() {
		return userService.getAll();
	}

	@GetMapping("{id}")
	public User getOne(@PathVariable long id) {
		return userService.getOne(id);
	}

	@GetMapping("/login/{loginUser}")
	public List<User> findByloginUser(@PathVariable String loginUser) {
		return userService.findByloginUser(loginUser);
	}

	@PostMapping
	public User addUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@PutMapping("{id}")
	public User updateUser(@RequestBody User user, @PathVariable long id) {
		User userActuel = new User();
		userActuel = userService.getOne(id);
		userActuel.setLoginUser(user.getLoginUser());
		userActuel.setPwdUser(user.getPwdUser());
		userActuel.setEmailUser(user.getEmailUser());
		return userService.updateUser(userActuel);
	}

	@DeleteMapping("{id}")
	public boolean deleteUser(@PathVariable long id) {
		try {
			userService.deleteUser(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@GetMapping("/exist/{login}")
	public boolean existsUserByloginUser(@PathVariable String login) {
		return userService.existsUserByloginUser(login);
	}

	@PostMapping("/login")
	public Token findByLoginUserAndPwdUser(@RequestBody User user) {
		User u = userService.findByLoginUserAndPwdUser(user.getLoginUser(), user.getPwdUser());
		if (u.getLoginUser() != null) {
			String token;
			token = Jwts.builder().setSubject(u.getLoginUser()).signWith(cle).compact();
			Token t = new Token();
			t.setToken(token);
			return t;
		} else {
			return null;
		}
	}

}