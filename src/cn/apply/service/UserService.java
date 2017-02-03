package cn.apply.service;

import java.util.List;

import cn.apply.base.BaseService;
import cn.apply.domain.User;

public interface UserService extends BaseService<User> {

	/**
	 * 根据登录名或密码查询用户
	 * @param i
	 * @param password
	 * 		传来的是原文
	 * @return
	 */	

	User findByLoginNameAndPasswordLocalhost(String long1, String mm);

	User findByLoginNameAndPasswordSchool(String long1, String mm);

	void changePassword(String psw1);

	List<User> findByPage(int pageNow, int pageSizeNow, String searchContent);

	int findRecordCount(String searchContent);

	User findYHMByLocalhost(String long1);

	User findYHMBySchool(String long1);

	List<User> findListName() throws Exception;

	List<User> findListNameByAcademy(String string);


}
