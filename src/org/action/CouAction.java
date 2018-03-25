package org.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.model.Kcxx;
import org.service.CouService;
import org.tools.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CouAction extends ActionSupport{
	private int pageNow = 1;
	private int pageSize = 8;
	private Kcxx kc;
	private CouService couService;
	private String courseName;
	//关于管理员查询	
		private List<String> list2;
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
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
		
		private Kcxx user;
		
		public Kcxx getUser() {
			return user;
		}
		public void setUser(Kcxx user) {
			this.user = user;
		}
		public String fromKcUsername() throws Exception {
			// TODO Auto-generated method stub
			
			System.out.println(listName1.get(0)+" "+courseName);
			if (listName1.get(0).equals("按照编号查询")) {
				System.out.println("按照编号查询");
				 user=couService.find(Integer.parseInt(courseName));
				 Map request = (Map)ActionContext.getContext().get("request");
				Pager page = new Pager(getPageNow(), couService.findKcSize());
				System.out.println(page.getPageNow()+" page");
				request.put("list", user);
				if(user!=null){
					return SUCCESS;
				}else
					return ERROR;
			}else if(listName1.get(0).equals("按照所选专业查询")){
				List list = couService.findCourse(Integer.parseInt(courseName), pageNow, pageSize);
				Map request = (Map)ActionContext.getContext().get("request");
				Pager page = new Pager(getPageNow(), couService.findKcSize());
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
		public  String getAllCouList() throws Exception  {
			// TODO Auto-generated method stub
			list2=new ArrayList<String>();
			list2.add("按照编号查询");
			list2.add("按照所选专业查询");
			return SUCCESS;
		}
		
	//关于增加	
	public String addKc() throws Exception{
		Kcxx stu = new Kcxx();
		stu.setCourseid(kc.getCourseid());
		stu.setCoursename(kc.getCoursename());
		stu.setFacultyid(kc.getFacultyid());
		stu.setCoursecredit(kc.getCoursecredit());
		System.out.println(kc.getCourseid()+" "+kc.getCoursename());
		couService.save(stu);
		return SUCCESS;
	}
	
	
	//查询管理员所有信息
	public String KcInfo() throws Exception{
		
		List list = couService.findAll(pageNow, pageSize);
		Map request = (Map)ActionContext.getContext().get("request");
		Pager page = new Pager(getPageNow(), couService.findKcSize());
		System.out.println(page.getPageNow()+" page");
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	} 
	//关于删除
	public String deleteKc() throws Exception{
		Integer Courseid = kc.getCourseid();
		couService.delete(Courseid);
		return SUCCESS;
	}
	//显示修改页面
	public String updateKcView() throws Exception{
		Integer courseid = kc.getCourseid();
		Kcxx kcInfo = couService.find(courseid);
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("kcInfo", kcInfo);
		return SUCCESS;
	}
	//执行修改操作
	public String updateKc() throws Exception{
		Kcxx kc1 = couService.find(kc.getCourseid());
		kc1.setCoursename(kc.getCoursename());;
		kc1.setFacultyid(kc.getFacultyid());
		kc1.setCoursecredit(kc.getCoursecredit());
		Map request = (Map)ActionContext.getContext().get("request");
		couService.update(kc1);
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
	public Kcxx getKc() {
		return kc;
	}
	public void setKc(Kcxx kc) {
		this.kc = kc;
	}
	public CouService getCouService() {
		return couService;
	}
	public void setCouService(CouService couService) {
		this.couService = couService;
	}
	
	
	
	
	
}
