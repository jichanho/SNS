package servlet.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("testDAO")
public class testDAO extends EgovAbstractDAO{
	
	public List<?> selectAll() throws Exception{
		System.out.println("testDAO.java - selectAll()");
		return list("ul_selectAll");
	}
	
}
