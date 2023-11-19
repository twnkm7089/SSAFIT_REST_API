package com.ssafy.workout.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.workout.dto.Review;
import com.ssafy.workout.service.ReviewService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api-review")
@Api(tags="리뷰 컨트롤러")
@CrossOrigin("*")
public class ReviewRestController {
	
	@Autowired
	private ReviewService reviewService;
	
	//리뷰 전체 불러오기
	//youtubeId 기반
	@GetMapping("/board/{youtubeid}")
	public ResponseEntity<List<Review>> reviewList(@PathVariable String youtubeid){
		List<Review> review = reviewService.getVideoReview(youtubeid);
		return new ResponseEntity<List<Review>>(review, HttpStatus.OK);
	}
	
	//리뷰 상세보기
	@GetMapping("/board/{youtubeid}/{id}")
	public ResponseEntity<Review> reviewList(@PathVariable int id){
		Review review = reviewService.getReview(id);
		return new ResponseEntity<Review>(review, HttpStatus.OK);
	}
	
	//리뷰 수정
	@PutMapping("/board")
	public ResponseEntity<Void> update(@RequestBody Review review){
		reviewService.modifyReview(review);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	//리뷰 삭제
	//reviewId 기반
	@DeleteMapping("/board/{id}")
	public ResponseEntity<Void> delete(@PathVariable int id){
		reviewService.removeReview(id);

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	//리뷰 추가
	@PostMapping("/board")
	public ResponseEntity<Void> write(@RequestBody Review review){
		reviewService.writeReview(review);

		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	
}
