package poker.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import poker.entity.UserMenuRelation;

/**
 * @author ZhangJingtao
 */
public interface UserMenuRelationDao extends PagingAndSortingRepository<UserMenuRelation, Long>, JpaSpecificationExecutor<UserMenuRelation> {

}
