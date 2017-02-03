package cn.apply.service.impl;



import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import cn.apply.base.BaseServiceImpl;
import cn.apply.domain.User;
import cn.apply.service.UserService;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
	
	@Resource
	SessionFactory sessionFactory;
	
	@Override
	public User findYHMByLocalhost(String yhm) {
		User user = new User();
		user = (User) getSession()
				.createQuery("FROM User u where u.YHM = ?")
				.setParameter(0, yhm)
				.uniqueResult();
		return user;
	}

	@Override
	public User findByLoginNameAndPasswordLocalhost(String long1, String mm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByLoginNameAndPasswordSchool(String long1, String mm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changePassword(String psw1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findByPage(int pageNow, int pageSizeNow,
			String searchContent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findRecordCount(String searchContent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findYHMBySchool(String long1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findListName() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findListNameByAcademy(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
