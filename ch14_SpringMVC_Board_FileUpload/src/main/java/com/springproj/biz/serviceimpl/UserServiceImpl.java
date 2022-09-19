package com.springproj.biz.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproj.biz.dao.UserDAO;
import com.springproj.biz.domain.UserVO;
import com.springproj.biz.service.UserService;


@Service("userService")	
public class UserServiceImpl implements UserService {

	
	
	
	@Autowired
	UserDAO userDAO;
	
	@Override
	public void insertService(UserVO user) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public UserVO getService(UserVO user) {
	
		
		return userDAO.getUser(user);
				
	}

	@Override
	public List<UserVO> getServiceList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateService(UserVO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteService(String id) {
		// TODO Auto-generated method stub

	}

}
