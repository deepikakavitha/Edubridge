package com.edubridge.fooddeliveryproject.service;

//import java.util.List;
import com.edubridge.fooddeliveryproject.model.Admin;

public interface AdminService {

	Admin saveAdmin(Admin admin);
	Admin loginAdmin(Admin admin);
/*	List<Admin> getAdmin();
	Admin getAdminByEmailID(String emailID);
	Admin updateAdmin(Admin admin, String emailID);
	void deleteAdmin(String emailID);  */
}
