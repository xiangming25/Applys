package cn.apply.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class IndexAction {
	
	/**
	 * 首页
	 * @return
	 * @throws Exception
	 */
	public String index() throws Exception {
		return "index";
	}
}
