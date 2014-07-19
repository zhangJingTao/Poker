package poker.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import poker.entity.Menu;
/**
 * 
 * @author ZhangJingtao
 *
 */
public interface MenuDao extends PagingAndSortingRepository<Menu, Long>, JpaSpecificationExecutor<Menu> {

	Page<Menu> findById(Long id, Pageable pageRequest);
	Page<Menu> findByName(String name, Pageable pageRequest);
	
	@Query("from Menu m where m.enabled=1")
	List<Menu> listEnabledMenu();

	@Modifying
	@Query("update Menu m set enabled=0 where id=?1")
	public void delMenu(Long id);
}
