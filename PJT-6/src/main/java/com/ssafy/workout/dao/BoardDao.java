package com.ssafy.workout.dao;

import java.util.List;

import com.ssafy.workout.dto.SearchCondition;
import com.ssafy.workout.dto.Video;

public interface BoardDao {
	// 조회수 별 정렬
	List<Video> selectInterestFitVideo();

	// 운동부위 별 정렬
	List<Video> selectPartFitVideo(String part);
	
	// 해당하는 비디오 반환
	Video selectVideo(String youtubeId);
	
	// 검색한 비디오를 조회수 순 정렬
	List<Video> selectSearchVideo(String word);

	// 검색 조건으로 동영상 검색
	List<Video> search(SearchCondition condition);
	

}
