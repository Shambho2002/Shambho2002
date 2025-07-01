package com.rutuja.InsuranceManagementSystem.facade;

import com.rutuja.InsuranceManagementSystem.domain.User;
import com.rutuja.InsuranceManagementSystem.service.UserService;

public class SocialApproval implements SocialApprovalFacade {
	private final String username;
	public SocialApproval(String username) {
		this.username = username;
	}

	@Override
	public boolean getSocialApproval() {
		return true;
	}
}
