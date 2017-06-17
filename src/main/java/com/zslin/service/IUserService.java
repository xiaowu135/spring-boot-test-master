package com.zslin.service;

import com.zslin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author Administrator
 *
 */
public interface IUserService extends JpaRepository<User, Integer> {
}
