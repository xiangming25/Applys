package cn.apply.base;

import java.util.List;


public interface BaseService<T> {
	/**保存实体*/
	void save(T entity);
	
	/**删除实体*/
	void delete(Long i);
	
	/**更新内容*/
	void update(T entity);
	
	/**根据ID取值*/
	T getById(Long long1);
	
	/**根据ids取得很多的内容*/
	List<T> getByIds(Long[] roleIds);
	
	/**获取所的内容*/
	List<T> findAll();
	
	/**根据学院及专业来查询*/
	List<T> findByAcademyAndProfessor(String form,String academyName,String professorName);
	
/*	*//**根据学院及专业及输入的内容实现模糊查询*//*
	List<T> findByAcademyAndProfessorAndContent(String form,String academyName,String professorName,String content);
	
	*//**根据内容来查询*//*
	List<T> findBySearchContent(String form,String searchContent);*/
}
