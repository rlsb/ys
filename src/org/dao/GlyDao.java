package org.dao;

import java.util.List;

import org.model.Glyxx;

public interface GlyDao {
	//�����ʦ
	public void save(Glyxx gly);
	//����ѧ��������ѯ
	public Glyxx find(String gly);
	//����ѧԺ��ѯ
	public List findCollege(String gly,int pageNow,int pageSize);
	//��ѯ���еĹ���Ա��Ϣ
	public List findAll(int pageNow,int pageSize);
	public int findGlySize();
	//���ݽ�ʦ�û���ɾ����ʦ
	public void delete(String username);
	//�޸Ľ�ʦ��Ϣ
	public void update(Glyxx gly);
	
}
