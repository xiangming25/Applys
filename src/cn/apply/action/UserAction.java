package cn.apply.action;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.apply.base.BaseAction;
import cn.apply.domain.User;
import cn.apply.util.PrintJSON;
import cn.apply.vo.UserVo;

@Controller
@Scope("prototype")
@SuppressWarnings("serial")
public class UserAction extends BaseAction<UserVo> {
		

	/** 初始化密码为1234 */
	public void initPassword() throws Exception {
		// 1、 从数据库中取出数据
		User user = userService.findYHMByLocalhost(model.getYHM());
		// 2、 设置要修改的属性，要使用MD5加密
		String password = DigestUtils.md5Hex("111111").toUpperCase();
		user.setMM(password);
		// 3、 更新到数据库
		try {			
			userService.update(user);
			PrintJSON.print(request, response, "success");
		} catch (Exception e) {
			PrintJSON.print(request, response, "failure");
			e.printStackTrace();
		}
	}

	/** 修改密码 */
	public void editUserInfo() throws Exception {
		User user = (User) session.getAttribute("user");
		user.setXM(model.getXM());
		user.setZC(model.getZC());
		user.setSZDW(model.getSZDW());
		user.setTEL(model.getTEL());
		user.setEMAIL(model.getEMAIL());
		user.setHeadImageUrl(model.getHeadImageUrl());
		try {
			userService.update (user);
			PrintJSON.print(request, response, "success");
			ActionContext.getContext().getSession().put("user", user);		//将用户存放在session中
		} catch (Exception e) {
			PrintJSON.print(request, response, "failure");
			e.printStackTrace();
		}

	}
	
	
	/** 登录页面 */
	public String signIn() throws Exception {
		return "signIn";
	}
	
	/**
	 * 用户列表
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception {
		return "list";
	}
	
	/**
	 * 用户信息详情
	 * @return
	 * @throws Exception
	 */
	public String detail() throws Exception {
		return "detail";
	}
	
	/**
	 * 保存用户
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception{
		return "save";
	}
	
	/** 首页页面 */
	public String index() throws Exception {
		return "index";
	}

}
