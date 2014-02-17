package poker.service.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import poker.repository.MenuDao;
import poker.repository.UserDao;
import poker.repository.UserMenuRelationDao;

/**
 * 系统操作service
 * @author ZhangJingtao
 *
 */
@Component
@Transactional(readOnly = false)
public class SystemService {
	@Autowired
	MenuDao menuDao;
	@Autowired
	UserMenuRelationDao userMenuRelationDao;
	@Autowired
	UserDao userDao;
	
}
