package org.action;


import java.util.ArrayList;
import java.util.List;



import java.util.Map;

import org.model.Xyxx;
import org.service.ColService;




import org.tools.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ColAction extends ActionSupport{
	private int pageNow = 1;
	private int pageSize = 8;
	private Xyxx xy;
	private ColService colService;
	private String proName;
	//关于管理员查询
		
	
		private List<String> list2;

		public String getProName() {
			return proName;
		}
		public void setProName(String proName) {
			this.proName = proName;
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
		
		private Xyxx user;
		
		public Xyxx getUser() {
			return user;
		}
		public void setUser(Xyxx user) {
			this.user = user;
		}
		public String fromXyUsername() throws Exception {
			// TODO Auto-generated method stub
			
			System.out.println(listName1.get(0)+" "+proName);
			if (listName1.get(0).equals("按照编号查询")) {
				System.out.println("按照编号查询");
				 user=colService.find(Integer.parseInt(proName));
				 Map request = (Map)ActionContext.getContext().get("request");
				Pager page = new Pager(getPageNow(), colService.findXySize());
				System.out.println(page.getPageNow()+" page");
				request.put("list", user);
				if(user!=null){
					return SUCCESS;
				}else
					return ERROR;
			}else if(listName1.get(0).equals("按照所选学院查询")){
				List list = colService.findCollege(proName, pageNow, pageSize);
				Map request = (Map)ActionContext.getContext().get("request");
				Pager page = new Pager(getPageNow(), colService.findXySize());
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
		public  String getAllList() throws Exception  {
			// TODO Auto-generated method stub
			list2=new ArrayList<String>();
			list2.add("按照编号查询");
			list2.add("按照所选学院查询");
			return SUCCESS;
		}
		
	//关于增加	
	public String addXy() throws Exception{
		Xyxx stu = new Xyxx();
		stu.setFacultyid(xy.getFacultyid());
		stu.setFacultyName(xy.getFacultyName());
		stu.setSchoolid(xy.getSchoolid());
		System.out.println(xy.getFacultyid()+" "+xy.getFacultyName());
		colService.save(stu);
		return SUCCESS;
	}
	
	
	//查询管理员所有信息
	public String XyInfo() throws Exception{
		
		List list = colService.findAll(pageNow, pageSize);
		/*for(int i = 0;list.size();i++){
			Xyxx xyxx = list.get(i); 
			Xsxx xsxx = ;
		}*/
		Map request = (Map)ActionContext.getContext().get("request");
		Pager page = new Pager(getPageNow(), colService.findXySize());
		System.out.println(page.getPageNow()+" page");
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	} 
	//关于删除
	public String deleteXy() throws Exception{
		Integer facultyid = xy.getFacultyid();
		colService.delete(facultyid);
		return SUCCESS;
	}
	//显示修改页面
	public String updateXyView() throws Exception{
		Integer facultyid = xy.getFacultyid();
		Xyxx xyInfo = colService.find(facultyid);
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("xyInfo", xyInfo);
		return SUCCESS;
	}
	//执行修改操作
	public String updateXy() throws Exception{
		Xyxx xy1 = colService.find(xy.getFacultyid());
		xy1.setFacultyName(xy.getFacultyName());;
		xy1.setSchoolid(xy.getSchoolid());
		Map request = (Map)ActionContext.getContext().get("request");
		colService.update(xy1);
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
	public Xyxx getXy() {
		return xy;
	}
	public void setXy(Xyxx xy) {
		this.xy = xy;
	}
	public ColService getColService() {
		return colService;
	}
	public void setColService(ColService colService) {
		this.colService = colService;
	}
	
}
