package cn.apply.base;

import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

//@Transactional这个方法可以被继承
@Transactional
@SuppressWarnings("unchecked")
public class BaseServiceImpl<T> implements BaseService<T> {

	@Resource
	private SessionFactory sessionFactory;
	private Class<T> clazz;
	
	public BaseServiceImpl(){
		//使用反射技术得到T的真实类型
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();//获取当前new的对象的泛型的父类类型
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];	//获取第一个类型参数的真实类型
//		System.out.println("clazz:  "+clazz);
	}
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void save(T entity) {
		getSession().save(entity);
		
	}

	@Override
	public void delete(Long id) {
		Object object = getById(id);
		if(object != null){
			getSession().delete(object);
		}
		
	}

	@Override
	public void update(T entity) {
		getSession().update(entity);
		
	}

	@Override
	public T getById(Long id) {
		return (T)getSession().get(clazz, id);
	}

	@Override
	public List<T> getByIds(Long[] ids) {
		if(ids == null || ids.length == 0){
			return Collections.EMPTY_LIST;		//如果返回的是空值的话后面的内容会报错
		}else{			
			System.out.println("getByIds:  "+ids);
			return getSession().createQuery(//
					"FROM "+clazz.getSimpleName()+" WHERE id IN (:ids)")//
					.setParameterList("ids", ids)//
					.list();
		}
	}

	@Override
	public List<T> findAll() {
		return getSession().createQuery(
				"FROM "+clazz.getSimpleName())
				.list();
	}


	@Override
	public List<T> findByAcademyAndProfessor(String form, String academyName,
			String professorName) {
		String sql = "SELECT * FROM "+form+" WHERE academyName="+academyName+" AND professorName="+professorName+"";
		return getSession().createSQLQuery(sql).list();
	}
/*
	@Override
	public List<T> findByAcademyAndProfessorAndContent(String form,
			String academyName, String professorName, String content) {
		String sql = "SELECT * FROM "+form+" WHERE academyName="+academyName+" AND professorName="+professorName+" AND concat()";
		return null;
	}

	@Override
	public List<T> findBySearchContent(String form, String searchContent) {
		// TODO Auto-generated method stub
		return null;
	}*/


}
