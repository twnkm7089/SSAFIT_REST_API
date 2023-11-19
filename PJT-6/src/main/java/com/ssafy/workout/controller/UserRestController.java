package com.ssafy.workout.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.workout.dto.User;
import com.ssafy.workout.service.UserService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api-user")
@Api(tags="유저 컨트롤러")
@CrossOrigin("*")
public class UserRestController {
	
	//UserService 라고 하는 친구를 주입
	@Autowired
	private UserService userService;
	
	// 전체 유저 가져와.
	@GetMapping("/list")
	public ResponseEntity<List<User>> userList() {
		return new ResponseEntity<>(userService.selectAllUsers(), HttpStatus.OK) ;
	}
	
	// 회원가입을 해보자. form 태그 형식으로 왔다.
	// json이면 request body 필요. 폼 태그는 괜찮 ㅎ.
	@PostMapping("/signup")
	public ResponseEntity<Integer> signup(User user) {
		int res = userService.signup(user);
		
		// res = 0 이면 등록 X 
		// res = 1 이면 등록 O
		// if (res == 0)
		//	return new ResponseEntity<Integer> (res, HttpStatus.CREATED);
		
		return new ResponseEntity<Integer> (res, HttpStatus.CREATED);
	}

	// 로그인
	@PostMapping("login")
	public ResponseEntity<?> login(User user, HttpSession session) {
		User tmp = userService.login(user);
		//로그인 실패 
		if(tmp == null)
			return new ResponseEntity<Void> (HttpStatus.UNAUTHORIZED); //로그인 페이지로 다시 튕기게 만듬
		
		session.setAttribute("loginUser", tmp);
		return new ResponseEntity<User> (tmp, HttpStatus.OK);
	}

	// 로그아웃
	@GetMapping("logout")
	public ResponseEntity<Void> logout(HttpSession session) {
		session.invalidate();
		
		return new ResponseEntity<Void> (HttpStatus.OK);
	}
}
