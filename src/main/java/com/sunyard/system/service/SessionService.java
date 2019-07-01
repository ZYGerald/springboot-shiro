package com.sunyard.system.service;

import com.sunyard.system.domain.UserOnline;

import java.util.List;

public interface SessionService {

	List<UserOnline> list();

	boolean forceLogout(String sessionId);
}
