package com.sunyard.system.dao;

import com.sunyard.common.config.MyMapper;
import com.sunyard.system.domain.User;
import com.sunyard.system.domain.UserWithRole;

import java.util.List;

public interface UserMapper extends MyMapper<User> {

	List<User> findUserWithDept(User user);
	
	List<UserWithRole> findUserWithRole(Long userId);
	
	User findUserProfile(User user);
}