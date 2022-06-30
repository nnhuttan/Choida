package com.example.choidaonline.repository;

import com.example.choidaonline.entity.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AdminRepository extends CrudRepository<Admin,Long>{
    
}
