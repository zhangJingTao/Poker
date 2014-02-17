package poker.service.menu;

import java.sql.Timestamp;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poker.entity.Menu;
import poker.entity.User;
import poker.entity.UserMenuRelation;
import poker.entity.UserMenuRelationId;
import poker.repository.UserMenuRelationDao;

@Service
@Transactional(readOnly = true)
public class UserMenuRelationService {
	@Autowired
	UserMenuRelationDao dao;
	
	
	@Transactional(readOnly = false)
	public int saveMenuRelation(Menu menu,User user){
		try {
			UserMenuRelationId id = new UserMenuRelationId(user.getId(), menu.getId(), new Timestamp(System.currentTimeMillis()));
			UserMenuRelation umr = new UserMenuRelation(id);
			dao.save(umr);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
