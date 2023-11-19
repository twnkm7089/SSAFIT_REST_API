package com.ssafy.workout.dao;

import java.util.List;

import com.ssafy.workout.dto.Review;


public interface ReviewDao {

	//리뷰 추가
	public void insertReview(Review review);
	
	//리뷰 삭제
	public void deleteReview(int reviewId);
	
	//리뷰 수정
	public void updateReview(Review review);
	
	//리뷰 선택
	public Review selectReview(int reviewId);
	
	//리뷰 조회수 증가.
	public void updateReviewViewCnt(int reviewId);
	
	//비디오 상세, 모든 리뷰 돌려주기
	public List<Review> selectVideoReview(String youtubeId);
}
