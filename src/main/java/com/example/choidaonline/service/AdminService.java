package com.example.choidaonline.service;

import com.example.choidaonline.entity.Admin;
import org.springframework.stereotype.Service;


@Service
public interface AdminService {
    Admin create(Admin admin);
    Admin update (Long id,Admin admin);
    void delete(Long id);
    Admin findById(Long id);
    Iterable<Admin> findAll();
}
