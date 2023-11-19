package com.ssafy.workout.service;

import java.util.List;
import com.ssafy.workout.dto.User;

public interface UserService {

	public List<User> selectAllUsers();

	// 회원 가입
	public int signup(User user);

	// 로그인 성공 시 유저 반환. 필수적
	public User login(User user);

	// 오버로딩.
	public User getUserInfo(int userId);
}