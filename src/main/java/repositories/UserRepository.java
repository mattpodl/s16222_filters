package repositories;

import java.util.List;

import domain.UserAccount;

public interface UserRepository {

	UserAccount getUserByUsername (String username);
	void add(UserAccount application);
	int count ();
	List<UserAccount> getAllUsers();
}
