package com.example.study.repository;

import com.example.study.model.entity.User;
import com.example.study.model.network.Header;
import com.example.study.model.network.response.UserApiResponse;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /*
    // select * from user where account = ?
    Optional<User> findByAccount(String account);

    Optional<User> findByEmail(String email);

    // select * from user where account = ? and email = ?
    Optional<User> findByAccountAndEmail(String account, String email);
    */

    User findFirstByPhoneNumberOrderByIdDesc(String phoneNumber);
}
