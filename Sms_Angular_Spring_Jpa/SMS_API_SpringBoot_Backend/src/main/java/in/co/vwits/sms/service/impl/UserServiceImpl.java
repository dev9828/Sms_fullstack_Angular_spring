package in.co.vwits.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.co.vwits.sms.model.User;
import in.co.vwits.sms.repository.UserRepository;
import in.co.vwits.sms.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;

	@Override
	public void create(User s) {
		this.repo.save(s);
	}

	@Override
	public List<User> findAll() {
		return repo.findAll();
	}

	@Override
	public User findOneUser(String username) {
		return repo.findById(username).get();
	}

	@Override
	public void delete(String username) {
		this.repo.deleteById(username);
	}

	@Override
	public User updateUser(User user) {
		return repo.save(user);
	}

}
