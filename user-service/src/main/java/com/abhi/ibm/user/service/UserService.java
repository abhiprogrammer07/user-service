package com.abhi.ibm.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abhi.ibm.user.entity.User;
import com.abhi.ibm.user.repository.UserRepository;
import com.abhi.ibm.user.vo.Department;
import com.abhi.ibm.user.vo.ResponseTemplateVO;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {

		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		// return Response template VO
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);

		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
				Department.class);

		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
}
