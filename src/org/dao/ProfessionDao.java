
package org.dao;
import java.util.List;
import org.model.Zyxx;

public interface  ProfessionDao {
		//插入专业
		public void save(Zyxx xy);
		//根据编号条件查询
		public Zyxx find(Integer xy);
		//根据专业查询
		public List findProfession(String zy,int pageNow,int pageSize);
		//查询所有的专业信息
		public List findAll(int pageNow,int pageSize);
		public int findZySize();
		//根据专业编号删除学院
		public void delete(Integer professionid);
		//修改专业信息
		public void update(Zyxx xy);
}