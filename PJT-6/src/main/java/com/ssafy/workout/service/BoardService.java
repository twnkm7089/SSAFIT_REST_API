package com.ssafy.workout.service;

import java.util.List;

import com.ssafy.workout.dto.SearchCondition;
import com.ssafy.workout.dto.Video;

public interface BoardService {
	
	// 조회수 순 다섯 개 선택
	List<Video> getInterestFitVideo();
	
	// 검색 조건으로 조회
	List<Video> search(SearchCondition condition);
	
	///////////////여기 밑에서부터는 위의 search 메서드 하나로 퉁칠 수 있음/////////////////////////
	// 분야별 다섯 개 선택
	List<Video> getPartFitVideo(String part);

	// 동영상 제목 검색
	List<Video> getSearchVideo(String word);
	
	// 리뷰 선택
	Video getVideo(String youtubeId);


}