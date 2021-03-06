package poker.service.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import poker.entity.Menu;
import poker.entity.User;
import poker.entity.UserMenuRelation;
import poker.entity.UserMenuRelationId;
import poker.repository.UserMenuRelationDao;

import java.sql.Timestamp;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserMenuRelationService {
    @Autowired
    UserMenuRelationDao dao;


    @Transactional(readOnly = false)
    public int saveMenuRelation(Menu menu, User user) {
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

    public List<UserMenuRelation> listAllRelations() {
        return (List<UserMenuRelation>) dao.findAll();
    }
}
