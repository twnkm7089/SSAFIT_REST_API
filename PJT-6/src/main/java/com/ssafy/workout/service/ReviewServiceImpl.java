package com.ssafy.workout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.workout.dao.ReviewDao;
import com.ssafy.workout.dto.Review;

@Service
public class ReviewServiceImpl implements ReviewService{
	
	@Autowired
	private ReviewDao reviewDao;

	@Override
	public void writeReview(Review review) {
		reviewDao.insertReview(review);
		
	}

	@Override
	public void removeReview(int reviewId) {
		reviewDao.deleteReview(reviewId);
		
	}

	@Override
	public void modifyReview(Review review) {
		reviewDao.updateReview(review);
		
	}

	@Override
	public Review getReview(int reviewId) {
		reviewDao.updateReviewViewCnt(reviewId);
		return reviewDao.selectReview(reviewId);
	}

	@Override
	public List<Review> getVideoReview(String youtubeId) {
		return reviewDao.selectVideoReview(youtubeId);
	}
	
	
	
}
