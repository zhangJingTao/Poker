package poker.service.menu;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import poker.entity.Menu;
import poker.repository.MenuDao;


@Component
@Transactional(readOnly = true)
public class MenuService {
	@Autowired
	MenuDao menuDao;
	
	
	public List<Menu> listAllMenu(boolean showAll){
		if (showAll) {
			return (List<Menu>) menuDao.findAll();
		}else {
			return menuDao.listEnabledMenu();
		}
	}
	
	@Transactional(readOnly = false)
	public int saveMenu(Menu menu){
		try {
			menuDao.save(menu);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	@Transactional(readOnly = false)
	public int updateMenu(Menu menu){
		try {
			menuDao.save(menu);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
