package com.sharp6.repostorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharp6.entity.UserMaster;

@Repository
public interface UserRepository  extends JpaRepository<UserMaster, String>{

}
