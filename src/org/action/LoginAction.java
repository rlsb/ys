package org.action;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.model.Login;
import org.service.LoginService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

	public class LoginAction extends ActionSupport{
		private Login login;
		public Login getLogin() {
			return login;
		}
		public void setLogin(Login login) {
			this.login = login;
		}

		private LoginService loservice;
		public LoginService getLoservice() {
			return loservice;
		}
		public void setLoservice(LoginService loservice) {
			this.loservice = loservice;
		}
		
		public void loginjs() throws Exception{
			Login user=
					loservice.find(
					login.getUsername(),
						login.getPassword());
			ActionContext ac = ActionContext.getContext();
			HttpServletResponse response = (HttpServletResponse) ac.get(ServletActionContext.HTTP_RESPONSE);
			response.setContentType("text/html;charset=utf-8");
			JSONObject obj = new JSONObject();
			obj.put("id", user.getId());
			obj.put("username", user.getUsername());
			obj.put("password", user.getPassword());
			response.getWriter().write(obj.toString());
			/*if(user!=null){
				Map session=(Map)ActionContext.getContext().getSession();
				session.put("user", user);
				return SUCCESS;
			}else
				return ERROR;*/
		}

}
