package org.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.model.Glyxx;
import org.service.GlyService;
import org.tools.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class GlyAction extends ActionSupport{
	private int pageNow = 1;
	private int pageSize = 8;
	private Glyxx gly;
	private GlyService glyService;
	private String adminName;
	//���ڹ���Ա��ѯ
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
		private List<String> list1;
		private List<String> listName;
		public List<String> getListName() {
			return listName;
		}
		public void setListName(List<String> listName) {
			this.listName = listName;
		}
		public List<String> getList1() {
			return list1;
		}
		public void setList1(List<String> list1) {
			this.list1 = list1;
		}
		private Glyxx user;
		public Glyxx getUser() {
			return user;
		}
		public void setUser(Glyxx user) {
			this.user = user;
		}
		public String fromGlyUsername() throws Exception {
			// TODO Auto-generated method stub
				//glyService.find(gly)
			System.out.println(listName.get(0)+" "+adminName);
			if (listName.get(0).equals("�����˺Ų�ѯ")) {
				System.out.println("�����˺Ų�ѯ");
				 user=glyService.find(adminName);
				 Map request = (Map)ActionContext.getContext().get("request");
				Pager page = new Pager(getPageNow(), glyService.findGlySize());
				System.out.println(page.getPageNow()+" page");
				request.put("list", user);
				if(user!=null){
					return SUCCESS;
				}else
					return ERROR;
			}else if(listName.get(0).equals("������ѡѧԺ��ѯ")){
				List list = glyService.findCollege(adminName, pageNow, pageSize);
				Map request = (Map)ActionContext.getContext().get("request");
				Pager page = new Pager(getPageNow(), glyService.findGlySize());
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
		public  String getList() throws Exception  {
			// TODO Auto-generated method stub
			list1=new ArrayList<String>();
			list1.add("�����˺Ų�ѯ");
			list1.add("������ѡѧԺ��ѯ");
			return SUCCESS;
		}
		public  String getList11() throws Exception  {
			// TODO Auto-generated method stub
			list1=new ArrayList<String>();
			list1.add("�����˺Ų�ѯ");
			list1.add("������ѡѧԺ��ѯ");
			return SUCCESS;
		}
		
	//����רҵ��ѯ
	
	
	//��������	
	public String addJs() throws Exception{
		Glyxx stu = new Glyxx();
		stu.setUsername(gly.getUsername());
		stu.setPassword(gly.getPassword());
		stu.setFacultyName(gly.getFacultyName());
		System.out.println(gly.getUsername()+" "+gly.getPassword());
		glyService.save(stu);
		return SUCCESS;
	}
	
	
	//��ѯ����Ա������Ϣ
	public String glyInfo() throws Exception{
		
		List list = glyService.findAll(pageNow, pageSize);
		Map request = (Map)ActionContext.getContext().get("request");
		Pager page = new Pager(getPageNow(), glyService.findGlySize());
		System.out.println(page.getPageNow()+" page");
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	} 
	//����ɾ��
	public String deleteGly() throws Exception{
		String username = gly.getUsername();
		glyService.delete(username);
		return SUCCESS;
	}
	//��ʾ�޸�ҳ��
	public String updateGlyView() throws Exception{
		String username = gly.getUsername();
		Glyxx glyInfo = glyService.find(username);
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("glyInfo", glyInfo);
		return SUCCESS;
	}
	//ִ���޸Ĳ���
	public String updateGly() throws Exception{
		Glyxx gly1 = glyService.find(gly.getUsername());
		gly1.setPassword(gly.getPassword());
		gly1.setFacultyName(gly.getFacultyName());
		Map request = (Map)ActionContext.getContext().get("request");
		glyService.update(gly1);
		return SUCCESS;
	}
	
	public String updateGlyView1() throws Exception{
		String username = gly.getUsername();
		Glyxx glyInfo = glyService.find(username);
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("glyInfo", glyInfo);
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
	public Glyxx getGly() {
		return gly;
	}
	public void setGly(Glyxx gly) {
		this.gly = gly;
	}
	public GlyService getGlyService() {
		return glyService;
	}
	public void setGlyService(GlyService glyService) {
		this.glyService = glyService;
	}
	
}
