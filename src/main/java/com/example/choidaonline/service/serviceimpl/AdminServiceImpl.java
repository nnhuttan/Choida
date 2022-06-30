package com.example.choidaonline.service.serviceimpl;

import com.example.choidaonline.entity.Admin;
import com.example.choidaonline.repository.AdminRepository;
import com.example.choidaonline.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin create(Admin admin) {
        if (admin.getUsername() == null && admin.getPassword() == null && admin.getEmail() == null) {
            return null;
        } else {
            return adminRepository.save(admin);
        }
    }

    @Override
    public Admin update(Long id, Admin admin) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public Admin findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<Admin> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

}
