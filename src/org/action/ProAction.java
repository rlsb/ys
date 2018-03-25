package org.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.model.Zyxx;
import org.service.ProService;
import org.tools.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProAction extends ActionSupport{
	private int pageNow = 1;
	private int pageSize = 8;
	private Zyxx zy;
	private ProService proService;
	private String markProName;
	//���ڹ���Ա��ѯ	
		private List<String> list2;
		

		public String getMarkProName() {
			return markProName;
		}
		public void setMarkProName(String markProName) {
			this.markProName = markProName;
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
		
		private Zyxx user;
		
		public Zyxx getUser() {
			return user;
		}
		public void setUser(Zyxx user) {
			this.user = user;
		}
		public String fromZyUsername() throws Exception {
			// TODO Auto-generated method stub
			
			System.out.println(listName1.get(0)+" "+markProName);
			if (listName1.get(0).equals("���ձ�Ų�ѯ")) {
				System.out.println("���ձ�Ų�ѯ");
				 user=proService.find(Integer.parseInt(markProName));
				 Map request = (Map)ActionContext.getContext().get("request");
				Pager page = new Pager(getPageNow(), proService.findZySize());
				System.out.println(page.getPageNow()+" page");
				request.put("list", user);
				if(user!=null){
					return SUCCESS;
				}else
					return ERROR;
			}else if(listName1.get(0).equals("������ѡרҵ��ѯ")){
				List list = proService.findProfession(Integer.parseInt(markProName), pageNow, pageSize);
				Map request = (Map)ActionContext.getContext().get("request");
				Pager page = new Pager(getPageNow(), proService.findZySize());
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
		public  String getAllProList() throws Exception  {
			// TODO Auto-generated method stub
			list2=new ArrayList<String>();
			list2.add("���ձ�Ų�ѯ");
			list2.add("������ѡרҵ��ѯ");
			return SUCCESS;
		}
		
	//��������	
	public String addZy() throws Exception{
		Zyxx stu = new Zyxx();
		stu.setProfessionid(zy.getProfessionid());
		stu.setProfessionname(zy.getProfessionname());
		stu.setFacultyid(zy.getFacultyid());
		System.out.println(zy.getProfessionid()+" "+zy.getProfessionname());
		proService.save(stu);
		return SUCCESS;
	}
	
	
	//��ѯ����Ա������Ϣ
	public String ZyInfo() throws Exception{
		
		List list = proService.findAll(pageNow, pageSize);
		Map request = (Map)ActionContext.getContext().get("request");
		Pager page = new Pager(getPageNow(), proService.findZySize());
		System.out.println(page.getPageNow()+" page");
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	} 
	//����ɾ��
	public String deleteZy() throws Exception{
		Integer Professionid = zy.getProfessionid();
		proService.delete(Professionid);
		return SUCCESS;
	}
	//��ʾ�޸�ҳ��
	public String updateZyView() throws Exception{
		Integer professionid = zy.getProfessionid();
		Zyxx zyInfo = proService.find(professionid);
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("zyInfo", zyInfo);
		return SUCCESS;
	}
	//ִ���޸Ĳ���
	public String updateZy() throws Exception{
		Zyxx zy1 = proService.find(zy.getProfessionid());
		zy1.setProfessionname(zy.getProfessionname());;
		zy1.setFacultyid(zy.getFacultyid());
		Map request = (Map)ActionContext.getContext().get("request");
		proService.update(zy1);
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
	public Zyxx getZy() {
		return zy;
	}
	public void setZy(Zyxx zy) {
		this.zy = zy;
	}
	public ProService getProService() {
		return proService;
	}
	public void setProService(ProService proService) {
		this.proService = proService;
	}
	
	
	
	
	
}
