# Jenkins Practice

Jenkins CI/CD 실습용 숫자 야구(Number Baseball) Java 프로젝트입니다.

## 프로젝트 구조

```
Jenkins/
├── Jenkinsfile
├── pom.xml
├── README.md
└── src/main/java/NumberBaseballGame.java
```

## 게임 규칙

- 컴퓨터가 1~9 사이의 **서로 다른 4자리** 숫자를 생성합니다.
- 플레이어는 4자리 숫자를 한 자리씩 입력합니다.
- **Strike**: 숫자와 위치가 모두 일치
- **Ball**: 숫자만 일치 (위치 다름)
- 4 Strike면 승리
- 종료: `-1` 입력

## 로컬 실행

```bash
mvn clean package
java -jar target/jenkins-1.0-SNAPSHOT.jar
```

## Jenkins 설정

1. **New Item** → **Pipeline**
2. **Pipeline script from SCM** → Git
3. Repository URL: `https://github.com/yunlisa96/Jenkins.git`
4. Script Path: `Jenkinsfile`

### 필요 도구 (Manage Jenkins → Tools)

| Jenkinsfile | 등록 이름 |
|-------------|-----------|
| `jdk 'JDK-17'` | JDK 17 |
| `maven 'Maven-3.9'` | Maven 3.9 |

Jenkins에 등록된 도구 이름이 다르면 `Jenkinsfile`의 `tools` 블록을 수정하세요.

## 빌드

파이프라인은 아래 명령으로 컴파일 및 JAR 패키징을 수행합니다.

```bash
mvn clean package -B
```

빌드 성공 시 `target/*.jar` 파일이 아카이브됩니다.
