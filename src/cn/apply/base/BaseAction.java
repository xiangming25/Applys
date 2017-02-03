package cn.apply.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cn.apply.service.IndexService;
import cn.apply.service.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T> {

	protected HttpServletRequest request = ServletActionContext.getRequest();
	protected HttpServletResponse response = ServletActionContext.getResponse();
	protected HttpSession session=request.getSession();
	
	//=====================ModelDriven的支持======================
	protected T model;

	public BaseAction(){
		try {
			//通过反射获取model的真实类型
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			//通过反射创建model的实例
			model = clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	@Override
	public T getModel() {
		return model;
	}
		
	@Resource
	protected UserService userService;
	
	@Resource
	protected IndexService indexService;
	
	
	
}
