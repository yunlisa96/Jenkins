# Jenkins Practice

Jenkins의 기본 사용 방법과 CI(지속적 통합) 흐름을 학습하기 위해 진행한 실습 프로젝트입니다.

## 프로젝트 개요

Java로 작성한 숫자 야구(Number Baseball) 게임을 GitHub 저장소에 업로드한 후 Jenkins와 연동하여 자동 빌드를 수행하였습니다.

## 사용 기술

* Jenkins
* Git / GitHub
* Java
* Docker

## 실습 내용

* GitHub 저장소와 Jenkins 연동
* Jenkins Freestyle Project 생성
* Git 저장소의 소스 코드 자동 조회(Build)
* Jenkins Console Output을 통한 빌드 로그 확인
* 브랜치(main/master) 설정 오류 해결
* 소스 코드 경로 설정 오류 해결

## 프로젝트 구조

```text
Jenkins/
├── README.md
├── src
└── NumberBaseballGame.java
```

## 게임 규칙

* 컴퓨터가 1~9 사이의 서로 다른 4개의 숫자를 생성
* 플레이어는 숫자 4개를 입력
* Strike : 숫자와 위치가 모두 일치
* Ball : 숫자는 일치하지만 위치가 다름
* 4 Strike 달성 시 게임 종료

## Jenkins 빌드 결과

GitHub 저장소의 소스 코드를 Jenkins가 자동으로 가져와 빌드를 수행하였으며, 빌드 로그를 통해 성공 여부를 확인하였다.
