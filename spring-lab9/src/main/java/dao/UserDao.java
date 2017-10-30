package dao;

import java.util.List;

import domain.User;


public interface UserDao {
	
	public void insert(User user);
	
	public User select(int id);
	
	public List<User> selectAll();
	
}
