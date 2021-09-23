package com.quest.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quest.user.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User,Integer> {

	User findByUserId(int userId);


    

}
