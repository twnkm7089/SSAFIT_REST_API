package com.ssafy.workout.dao;

import com.ssafy.workout.dto.Review;
import com.ssafy.workout.dto.User;
import com.ssafy.workout.dto.Video;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {

	// 전체 User 반환.
	public List<User> selectAllUsers();

	// 회원 가입
	public int insertUser(User user);

   	// 로그인 성공 시 유저 반환. 필수적
   	public User login(User user);
   	
   	// 오버로딩. 
   	public User selectOne(int userId);
}
