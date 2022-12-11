
package com.edubridge.fooddeliveryproject.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.edubridge.fooddeliveryproject.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByEmailIDAndPassword(String emailID,String password);
	Optional<User> findByEmailID(String emailID);
	@Transactional
	void deleteByEmailID(String emailID);


}