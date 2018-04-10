package repositories;

import domain.UserAccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DummyUserRepository implements UserRepository {

	private static List<UserAccount> db = new ArrayList<UserAccount>();

	@Override
	public UserAccount getUserByUsername(String username) {
		for(UserAccount application : db) {
			if(application.getUsername().equalsIgnoreCase(username))
				return application;
		}
		return null;
	}

	@Override
	public void add(UserAccount application) {
		db.add(application);

	}

	@Override
	public int count() {
		return db.size();
	}

	@Override
	public List<UserAccount> getAllUsers() {
		return db;
	}

}
