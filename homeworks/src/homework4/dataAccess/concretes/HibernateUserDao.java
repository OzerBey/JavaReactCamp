package homework4.dataAccess.concretes;

import java.util.List;

import homework4.dataAccess.abstracts.UserDao;
import homework4.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByEmail(String eMail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eMailCheck(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
