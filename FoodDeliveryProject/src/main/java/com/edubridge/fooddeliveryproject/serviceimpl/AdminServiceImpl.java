package com.edubridge.fooddeliveryproject.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.fooddeliveryproject.exception.ResourceNotFound;
import com.edubridge.fooddeliveryproject.model.Admin;
import com.edubridge.fooddeliveryproject.repository.AdminRepository;
import com.edubridge.fooddeliveryproject.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
private AdminRepository adminRepository;

	public AdminServiceImpl(AdminRepository adminRepository) {
	super();
	this.adminRepository = adminRepository;
}

	@Override
	public Admin saveAdmin(Admin admin) {
		System.out.println("admin register service"+admin);

		return adminRepository.save(admin);
	}

	@Override
	public Admin loginAdmin(Admin admin) {
		return this.adminRepository.findByAdminEmailIdAndAdminPassword(admin.adminEmailId,admin.adminPassword).orElseThrow(()->new ResourceNotFound("Admin ", "Id",admin.adminEmailId+"and password "+admin.adminPassword ));
	}

}