package org.service;

import java.util.List;

import org.model.Glyxx;

public interface GlyService {
	//����ѧ��
	public void save(Glyxx gly);
	//����ѧ�Ų�ѯ
	public Glyxx find(String gly);
	//����ѧԺ��ѯ
	public List findCollege(String gly,int pageNow,int pageSize);
	//��ѯ����
	public List findAll(int pageNow,int pageSize);
	public int findGlySize();
	//ɾ
	public void delete(String username);
	//�޸�
	public void update(Glyxx gly);
}
