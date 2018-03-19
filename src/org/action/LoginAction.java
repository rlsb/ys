package org.action;

import java.util.Map;

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
		
		public String execute()throws Exception{
			Login user=
					loservice.find(
					login.getUsername(),
						login.getPassword());
			if(user!=null){
				Map session=(Map)ActionContext.getContext().getSession();
				session.put("user", user);
				return SUCCESS;
			}else
				return ERROR;
		}

}
