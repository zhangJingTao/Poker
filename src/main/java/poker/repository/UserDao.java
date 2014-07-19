package poker.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import poker.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
