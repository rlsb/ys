package org.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.model.Xsxx;
import org.service.StuService;
import org.tools.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StuAction extends ActionSupport{
	private int pageNow = 1;
	private int pageSize = 8;
	private Xsxx xs;
	private StuService stuService;
	private String markstudentName;
	//关于管理员查询	
		private List<String> list2;
		

		public String getMarkstudentName() {
			return markstudentName;
		}
		public void setMarkstudentName(String markstudentName) {
			this.markstudentName = markstudentName;
		}

		private List<String> listName1;
		
		public List<String> getList2() {
			return list2;
		}
		public void setList2(List<String> list2) {
			this.list2 = list2;
		}
		public List<String> getListName1() {
			return listName1;
		}
		public void setListName1(List<String> listName1) {
			this.listName1 = listName1;
		}
		
		private Xsxx user;
		
		public Xsxx getUser() {
			return user;
		}
		public void setUser(Xsxx user) {
			this.user = user;
		}
		public String fromXsUsername() throws Exception {
			// TODO Auto-generated method stub
			
			System.out.println(listName1.get(0)+" "+markstudentName);
			if (listName1.get(0).equals("按照学号查询")) {
				System.out.println("按照学号查询");
				 user=stuService.find(Integer.parseInt(markstudentName));
				 Map request = (Map)ActionContext.getContext().get("request");
				Pager page = new Pager(getPageNow(), stuService.findXsSize());
				System.out.println(page.getPageNow()+" page");
				request.put("list", user);
				if(user!=null){
					return SUCCESS;
				}else
					return ERROR;
			}else if(listName1.get(0).equals("按照所选姓名查询")){
				List list = stuService.findStudent(markstudentName, pageNow, pageSize);
				Map request = (Map)ActionContext.getContext().get("request");
				Pager page = new Pager(getPageNow(), stuService.findXsSize());
				System.out.println(page.getPageNow()+" page");
				request.put("list", list);
				request.put("page", page);
				if(list!=null){
					return SUCCESS;
				}else
					return ERROR;
			}
			  else	
				return ERROR;
		}
		public  String getAllStuList() throws Exception  {
			// TODO Auto-generated method stub
			list2=new ArrayList<String>();
			list2.add("按照学号查询");
			list2.add("按照所选姓名查询");
			return SUCCESS;
		}
		
	
	//查询学生所有信息
	public String XsInfo() throws Exception{
		
		List list = stuService.findAll(pageNow, pageSize);
		Map request = (Map)ActionContext.getContext().get("request");
		Pager page = new Pager(getPageNow(), stuService.findXsSize());
		System.out.println(page.getPageNow()+" page");
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public Xsxx getXs() {
		return xs;
	}
	public void setXs(Xsxx xs) {
		this.xs = xs;
	}
	public StuService getStuService() {
		return stuService;
	}
	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	} 
	
}
