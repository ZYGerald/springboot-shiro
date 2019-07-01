package com.sunyard.system.dao;

import com.sunyard.common.config.MyMapper;
import com.sunyard.system.domain.Role;
import com.sunyard.system.domain.RoleWithMenu;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
	
	List<Role> findUserRole(String userName);
	
	List<RoleWithMenu> findById(Long roleId);
}