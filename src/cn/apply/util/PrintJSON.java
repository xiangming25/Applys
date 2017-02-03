package cn.apply.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintJSON {
	/**
	 * 打印JSON数据，返回给前台
	 * @param request
	 * @param response
	 * @param json
	 * @throws IOException
	 */
	public static void print(HttpServletRequest request,HttpServletResponse response,String json) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(json);
		out.flush();
		out.close();
	}
}
