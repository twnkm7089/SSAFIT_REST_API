package com.ssafy.workout.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.workout.dto.SearchCondition;
import com.ssafy.workout.dto.Video;
import com.ssafy.workout.service.BoardService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api-board")
@Api(tags="게시판 컨트롤러")
@CrossOrigin("*")
public class BoardRestController {

	@Autowired
	private BoardService boardService;
	
	// 조회수 순 다섯 개 조회
	@GetMapping("/board")
	public ResponseEntity<?> getInterestFitVideo() {
		List<Video> list = boardService.getInterestFitVideo();
		if(list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Video>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/board/search")
	public ResponseEntity<?> search(SearchCondition condition){
		//검색 조건이 있다면 그것으로 조회(title, youtubeId, fitPartName)
		List<Video> list = boardService.search(condition);
		if(list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Video>>(list, HttpStatus.OK);
	}

	

	
}
