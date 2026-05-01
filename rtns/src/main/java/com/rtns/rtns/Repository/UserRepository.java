package com.rtns.rtns.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rtns.rtns.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //enables 

}
