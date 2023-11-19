USE mydb;
 
INSERT INTO `Video`(`youtubeid`, `title`, `fitpartname`, `channelname`) VALUES
('gMaB-fG4u4g', '전신 다이어트 최고의 운동 [칼소폭 찐 핵핵매운맛]','전신','ThankyouBUBU'), 
('swRNeYw1JkY','하루 15분! 전신 칼로리 불태우는 다이어트 운동', '전신', 'ThankyouBUBU'),
('54tTYO-vU2E', '상체 다이어트 최고의 운동 BEST [팔뚝살/겨드랑이살/등살/가슴어깨라인]', '상체', 'ThankyouBUBU'),
('QqqZH3j_vH0', '상체비만 다이어트 최고의 운동 [상체 핵매운맛]', '상체', 'ThankyouBUBU'),
('tzN6ypk6Sps', '하체운동이 중요한 이유? 이것만 보고 따라하자 ! [하체운동 교과서]', '하체', '김강민'),
('u5OgcZdNbMo', '저는 하체 식주의자입니다.', '하체', 'GYM종국'),
('PjGcOP-TQPE', '11자복근 복부 최고의 운동 [복근 핵매운맛]', '복부', 'ThankyouBUBU'),
('7TLk7pscICk', '(Sub)누워서하는 5분 복부운동!! 효과보장! (매일 2주만 해보세요!)', '복부', 'SomiFit'),
('js8z5wIZ0wg', '(층간소음X, 설명O) 진짜 힘듦주의.. 초강력 힙으뜸 하체운동 2주 챌린지', '하체', '힙으뜸');



INSERT INTO `User`(`userid`, `password`, `name`, `email`) VALUES
('ssafy1', 'ssafy1', '이승헌','ssafy1@gmail.com'),
('ssafy2', 'ssafy2', '석지명','ssafy2@gmail.com'),
('ssafy3', 'ssafy3', '김예림','ssafy3@gmail.com'),
('ssafy4', 'ssafy4', '김영섭','ssafy4@gmail.com'),
('ssafy5', 'ssafy5', '김중광','ssafy5@gmail.com'),
('ssafy6', 'ssafy6', '문성현','ssafy6@gmail.com'),
('ssafy7', 'ssafy7', '유승호','ssafy7@gmail.com'),
('ssafy8', 'ssafy8', '전은평','ssafy8@gmail.com'),
('ssafy9', 'ssafy9', '김선영','ssafy9@gmail.com'),
('ssafy10', 'ssafy10', '김지은','ssafy10@gmail.com'),
('ssafy11', 'ssafy11', '류기현','ssafy11@gmail.com'),
('ssafy12', 'ssafy12', '황인승','ssafy12@gmail.com');

INSERT INTO `Review`
(`Video_youtubeId`, `title`, `User_id`, `content`) VALUES
	('swRNeYw1JkY', '개쩔어용', '1', '효과만점임'),
	('swRNeYw1JkY', '괜찮네요', '2', '애니보면서하기좋음'),
	('swRNeYw1JkY', '그정도는아닌듯?','3', '오바 ㄴㄴ염'),
	('swRNeYw1JkY', '집에갈래', '4', '집 보내 주세요 ... '),
	('7TLk7pscICk', '개쩔어용', '5', '알고리즘신에게어울리는운동이로다'),
	('7TLk7pscICk', '괜찮네요', '6', '메이플하면서하기좋음'),
	('7TLk7pscICk', '그정도는아닌듯?','7', '복근개쩔어짐 ,, '),
	('7TLk7pscICk', '집에갈래', '8', '구 살아요'),
	('js8z5wIZ0wg', '개쩔어용', '9', '송파구 사슬낫 보면 피해라'),
	('js8z5wIZ0wg', '괜찮네요', '10', '클라이밍 갈 사람 구해요'),
	('js8z5wIZ0wg', '아파요', '11', '다리다친사람은못하겠네요 '),
	('js8z5wIZ0wg', '사실 .. ', '12', '기현이 건물 나가면 제대로 걸어다닙니다... ');

SELECT * FROM `video`;
SELECT * FROM `User`;
SELECT * FROM `Review`;
SELECT * FROM `watchRecord`;

commit;