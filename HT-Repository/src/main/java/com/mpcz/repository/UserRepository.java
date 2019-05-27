package com.mpcz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpcz.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
