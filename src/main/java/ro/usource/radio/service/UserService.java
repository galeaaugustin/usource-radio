package ro.usource.radio.service;

import ro.usource.radio.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
