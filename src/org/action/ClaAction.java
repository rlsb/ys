package org.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.model.Bjxx;
import org.service.ClaService;
import org.tools.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ClaAction extends ActionSupport{
	private int pageNow = 1;
	private int pageSize = 8;
	private Bjxx bj;
	private ClaService claService;
	private String markclassName;
	//关于管理员查询	
		private List<String> list2;
		

		public String getMarkclassName() {
			return markclassName;
		}
		public void setMarkclassName(String markclassName) {
			this.markclassName = markclassName;
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
		
		private Bjxx user;
		
		public Bjxx getUser() {
			return user;
		}
		public void setUser(Bjxx user) {
			this.user = user;
		}
		public String fromBjUsername() throws Exception {
			// TODO Auto-generated method stub
			
			System.out.println(listName1.get(0)+" "+markclassName);
			if (listName1.get(0).equals("按照编号查询")) {
				System.out.println("按照编号查询");
				 user=claService.find(Integer.parseInt(markclassName));
				 Map request = (Map)ActionContext.getContext().get("request");
				Pager page = new Pager(getPageNow(), claService.findBjSize());
				System.out.println(page.getPageNow()+" page");
				request.put("list", user);
				if(user!=null){
					return SUCCESS;
				}else
					return ERROR;
			}else if(listName1.get(0).equals("按照所选专业查询")){
				List list = claService.findClasses(Integer.parseInt(markclassName), pageNow, pageSize);
				Map request = (Map)ActionContext.getContext().get("request");
				Pager page = new Pager(getPageNow(), claService.findBjSize());
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
		public  String getAllClaList() throws Exception  {
			// TODO Auto-generated method stub
			list2=new ArrayList<String>();
			list2.add("按照编号查询");
			list2.add("按照所选专业查询");
			return SUCCESS;
		}
		
	//关于增加	
	public String addBj() throws Exception{
		Bjxx stu = new Bjxx();
		stu.setClassid(bj.getClassid());
		stu.setClassname(bj.getClassname());
		stu.setProfessionid(bj.getProfessionid());
		stu.setGradename(bj.getGradename());
		System.out.println(bj.getClassid()+" "+bj.getClassname());
		claService.save(stu);
		return SUCCESS;
	}
	
	
	//查询管理员所有信息
	public String BjInfo() throws Exception{
		
		List list = claService.findAll(pageNow, pageSize);
		Map request = (Map)ActionContext.getContext().get("request");
		Pager page = new Pager(getPageNow(), claService.findBjSize());
		System.out.println(page.getPageNow()+" page");
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	} 
	//关于删除
	public String deleteBj() throws Exception{
		Integer Classid = bj.getClassid();
		claService.delete(Classid);
		return SUCCESS;
	}
	//显示修改页面
	public String updateBjView() throws Exception{
		Integer classid = bj.getClassid();
		Bjxx bjInfo = claService.find(classid);
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("bjInfo", bjInfo);
		return SUCCESS;
	}
	//执行修改操作
	public String updateBj() throws Exception{
		Bjxx bj1 = claService.find(bj.getClassid());
		bj1.setClassname(bj.getClassname());;
		bj1.setProfessionid(bj.getProfessionid());
		bj1.setGradename(bj.getGradename());
		Map request = (Map)ActionContext.getContext().get("request");
		claService.update(bj1);
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
	public Bjxx getBj() {
		return bj;
	}
	public void setBj(Bjxx bj) {
		this.bj = bj;
	}
	public ClaService getClaService() {
		return claService;
	}
	public void setClaService(ClaService claService) {
		this.claService = claService;
	}
	
	
	
	
	
}
