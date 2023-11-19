package com.ssafy.workout.service;

import java.util.List;

import com.ssafy.workout.dto.Review;

public interface ReviewService {

	// 리뷰 추가
	public void writeReview(Review review);
	
	// 리뷰 삭제 
	public void removeReview(int reviewId);

	// 리뷰 수정
	public void modifyReview(Review review);

	// 리뷰 선택
	public Review getReview(int reviewId);
	
	// 리뷰 목록 선택
	public List<Review> getVideoReview(String youtubeId);
}
