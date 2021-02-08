# 프로젝트 환경설정
## 1. 라이브러리 (Gradle)
### 스프링 부트 라이브러리
- spring-boot-starter-web
    - spring-boot-starter-tomcat: 톰캣 (웹서버)
    - spring-webmvc: 스프링 웹 MVC
- spring-boot-starter-thymeleaf: 타임리프 템플릿 엔진(View)
- spring-boot-starter(공통): 스프링 부트 + 스프링 코어 + 로깅
    - spring-boot
        - spring-core
    - spring-boot-starter-logging : 서버에서는 log를 남기기 위해 System.out.println() 을 쓰지 않고, LOG로 확인을 함
        - logback, slf4j

### 테스트 라이브러리
- spring-boot-starter-test
    - junit: 테스트 프레임워크
    - mockito: 목 라이브러리
    - assertj: 테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브러리
    - spring-test: 스프링 통합 테스트 지원

## 2. 빌드
1. ./gradlew build (안되면 ./gradlew clean build = build 파일을 삭제하고 다시 build)
2. cd build/libs
3. java -jar hello-spring-0.0.1-SNAPSHOT.jar (jar 파일 하나만 있으면 서버를 열 수 있음 / 예전에는 서버 구성을 모두 한 뒤에 했어야 했는데 간편해졌음)

--- 

