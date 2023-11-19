package com.ssafy.workout.dto;

import java.util.Date;

public class Review {
	// 모든 review들이 공유하는 변수. 
	// 새로운 review가 생성될 떄 마다 no을 id에 찍어주고, 하나씩 증가시켜줍니다. 


	private int id;
	private String title;
	private String content;
	private String regDate;
	private int viewCnt;
	private int User_id;
	private String Video_youtubeId;
	
	public Review() {}

	public Review(int id, String title, String content, String regDate, int viewCnt, int user_id,
			String video_youtubeId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
		this.viewCnt = viewCnt;
		User_id = user_id;
		Video_youtubeId = video_youtubeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		User_id = user_id;
	}

	public String getVideo_youtubeId() {
		return Video_youtubeId;
	}

	public void setVideo_youtubeId(String video_youtubeId) {
		Video_youtubeId = video_youtubeId;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", title=" + title + ", content=" + content + ", regDate=" + regDate + ", viewCnt="
				+ viewCnt + ", User_id=" + User_id + ", Video_youtubeId=" + Video_youtubeId + "]";
	}

	
	
}
