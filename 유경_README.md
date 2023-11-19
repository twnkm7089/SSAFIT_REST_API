# PJT6_G
김영섭 김태운 정유경

#### Commit Rule
- feat : 새로운 기능 추가, 기존의 기능을 요구 사항에 맞추어 수정
- fix : 기능에 대한 버그 수정
- docs : 문서(주석) 수정
- refactor : 기능의 변화가 아닌 코드 리팩터링 ex) 변수 이름 변경
- ex) "feat: youngkimi add login api"
- git push 전 pull 먼저 받아오고 conflict 해결하기. (stash 이용)
- PJT 5 참고 -> PJT 6 수정.


##### 정유경
---
#### 💪 구현 기능
- BoardController 작성
- BoardMapper 작성하여 MySQL 연결
- 전체 동영상 조회 기능 구현
- 동적 Query 를 통해 title, fitPartName, youtubeId, channelName 등 각 조건 별 검색 기능 구현
---

#### 💪 나의 역할
- 기존에 Spring MVC로 구현했던 내용을 Spring Boot로 옮기는 작업을 수행했습니다.
- 기존에 MainDao로 한꺼번에 User, Board, Review 기능을 묶어놓았던 것을 각각 기능 별로 나누어서 구현했습니다.
- 팀원 별로 도메인을 나누어 Controller, Mapper, Service, Dao, Dto 를 만들고 병합함으로써 하나의 프로젝트를 완성할 수 있었습니다.
- 기존에는 검색 조건별로 메서드를 만들었는데, 동적 Query를 활용하여 하나의 메서드로 효율적인 코드를 만들 수 있었습니다.
---

![image](https://github.com/ssafy10-seoul07/PJT6-G/assets/83561356/58fd5380-dadb-454f-aa8d-db7f5998d8b6)
![image](https://github.com/ssafy10-seoul07/PJT6-G/assets/83561356/f3fac8ad-5ac3-4492-ad79-835a707c689b)
