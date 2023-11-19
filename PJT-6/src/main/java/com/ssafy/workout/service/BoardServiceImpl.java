package com.ssafy.workout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.workout.dao.BoardDao;
import com.ssafy.workout.dto.SearchCondition;
import com.ssafy.workout.dto.Video;

@Service
public class BoardServiceImpl implements BoardService{

	private BoardDao boardDao;
	
	@Autowired
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	// 조회수 순 다섯 개 선택
	@Override
	public List<Video> getInterestFitVideo() {
		System.out.println("추천 동영상 다섯개를 가지고 왔습니다.");
		return boardDao.selectInterestFitVideo();
	}

	
	// 검색 조건으로 검색
	@Override
	public List<Video> search(SearchCondition condition) {
		return boardDao.search(condition);
	}
	
	///////////////여기 밑에서부터는 위의 search 메서드 하나로 퉁칠 수 있음/////////////////////////
	// 분야별 다섯 개 선택
	@Override
	public List<Video> getPartFitVideo(String part) {
		return boardDao.selectPartFitVideo(part);
	}

	// 해당 비디오 선택.
	@Override
	public Video getVideo(String youtubeId) {
		return boardDao.selectVideo(youtubeId);
	}
	
	// 검색한 단어가 제목에 포함된 동영상을 모두 출력
	@Override
	public List<Video> getSearchVideo(String word) {
		return boardDao.selectSearchVideo(word);
	}


	
	
}
