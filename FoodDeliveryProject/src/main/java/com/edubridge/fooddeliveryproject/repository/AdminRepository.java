package com.edubridge.fooddeliveryproject.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.edubridge.fooddeliveryproject.model.Admin;

public interface AdminRepository extends JpaRepository <Admin, Integer>{

	Optional<Admin> findByAdminEmailIdAndAdminPassword(String emailId,String password);
	}
