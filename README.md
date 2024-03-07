# 멋쟁이사자처럼 명지대학교(자연) 12기 서버 지원 과제

___ 

### 명지대학교 자연캠퍼스엔 공용 스터디룸이 있다.

### 현재 이 스터디룸은 학생들이 예약을 하지 않고 사용하고 있다.

### 이 광경을 두고볼 수 없던 관리자 재민이는 스터디룸 예약 프로그램을 만들 계획을 하고 있다.

### 재민이를 위해 스터디룸 관리 프로그램을 만들어 보자.

___ 

### 요구사항

1. 스터디룸은 A, B, C 총 3개가 있다.
2. 모든 스터디룸은 오전 10시부터 오후 10시까지만 운영한다.
3. 예약 시 최대 예약 가능 시간은 없다.
4. 스터디룸을 예약하기 위해선 다음과 같은 정보가 필요하다.
    - 예약할 스터디룸
    - 사용 시작 시간(분 단위는 고려하지 않는다)
    - 사용 종료 시간(분 단위는 고려하지 않는다)
5. 예약 시 해당 시간에 스터디룸이 예약 상태이면 예약에 실패해야 한다.
6. 예약 시 존재하지 않는 스터디룸을 입력하면 예약에 실패해야 한다.
7. 예약 시 스터디룸의 운영 시간을 벗어난 시간이라면 예약에 실패해야 한다.
8. 모든 스터디룸의 예약 현황을 볼 수 있어야 한다.
9. 재민이는 예약을 하루 전에 받을 생각이다. 따라서 날짜는 고려하지 않는다.
10. 사용자는 관리자에게 문의를 할 수 있다.
11. 사용자가 관리자에게 문의를 하기 위해 다음과 같은 정보가 필요하다.
    - 문의 ID
    - 문의 내용
12. 모든 데이터는 프로그램 종료 시 사라진다.
13. 문의 내용을 전부 볼 수 있어야 한다.
14. 실행 시 기본 실행 예시와 일치하도록 구현해야 한다.
15. 위 요구사항에서 정의되지 않았거나, 스스로 모호하다고 생각하는 사항이 있으면 일반적인 프로그램이라고 가정하여 직접 구현한다.

___ 

### 실행 결과

```plaintext
스터디룸 예약 프로그램입니다.
----- 작업 -----

1. 스터디룸 예약
2. 예약 현황 조회
3. 문의 남기기
4. 문의 리스트 보기
5. 프로그램 종료

작업을 선택하세요 :1
예약할 스터디룸: A
사용 시작 시간: 13
사용 종료 시간: 15
스터디룸 A이(가) 13시부터 15시까지 예약되었습니다.
----- 작업 -----

1. 스터디룸 예약
2. 예약 현황 조회
3. 문의 남기기
4. 문의 리스트 보기
5. 프로그램 종료

작업을 선택하세요 :2
----- 예약 현황 -----
| A | B | C |
10시 | X | X | X | 
11시 | X | X | X | 
12시 | X | X | X | 
13시 | O | X | X | 
14시 | O | X | X | 
15시 | X | X | X | 
16시 | X | X | X | 
17시 | X | X | X | 
18시 | X | X | X | 
19시 | X | X | X | 
20시 | X | X | X | 
21시 | X | X | X | 
22시 | X | X | X | 
----- 작업 -----

1. 스터디룸 예약
2. 예약 현황 조회
3. 문의 남기기
4. 문의 리스트 보기
5. 프로그램 종료

작업을 선택하세요 :3
-----문의 남기기-----
문의 아이디: zioni
문의 내용: 안녕하세요
문의가 저장되었습니다!
----- 작업 -----

1. 스터디룸 예약
2. 예약 현황 조회
3. 문의 남기기
4. 문의 리스트 보기
5. 프로그램 종료

작업을 선택하세요 :4
-----문의 리스트 보기-----
문의 아이디: zioni
문의 내용: 안녕하세요

----- 작업 -----

1. 스터디룸 예약
2. 예약 현황 조회
3. 문의 남기기
4. 문의 리스트 보기
5. 프로그램 종료

작업을 선택하세요 :5
프로그램을 종료합니다...

```

___ 
※ 원활한 확인을 위해 동작 예시를 함께 올려주세요(기본 실행 예시 참고).

※ 적절한 주석은 평가에 도움이 됩니다.

PS. 반드시 모든 기능을 구현하지 못해도 제출해주세요. 지원자분들의 열정을 보고 싶습니다.
