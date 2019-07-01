package com.sunyard.system.service;

import com.sunyard.common.service.IService;
import com.sunyard.system.domain.UserRole;

public interface UserRoleService extends IService<UserRole> {

	void deleteUserRolesByRoleId(String roleIds);

	void deleteUserRolesByUserId(String userIds);
}
