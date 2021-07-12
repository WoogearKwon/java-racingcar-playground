## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

### TDD 원칙
- 실패하는 단위 테스트를 먼저 작성하고 프로덕션 코드를 작성한다.
- 컴파일은 실패하지 않으면서 실행이 실패하는 정도로만 단위테스트를 작성한다.
- 현재 실패하는 테스트를 통과할 정도로만 실제 코드를 작성한다.

### TDD 사이클
- 실패하는 테스트를 구현
- 테스트가 성공하도록 프로덕션 코드를 구현
- 프로덕션 코드와 테스트 코드를 리팩토링

### 피드백 강의를 보면서 느낀 점
- 멤버 변수를 호출해서 사용하지말고 객체에 메시지를 보낼 것
    - ex) ball.getStrike() === 3 대신 ball.isGameEnd()
- enum을 활용
- 각 단위 작업이 끝날 때마다 commit
- Java의 Stream 사용 
- 문제를 가능한 작은 단위로 쪼개서 구현하고 테스트할 

#### 게임 진행 방식
- 랜덤 3자리 숫자(정답) 생성 -> 게임 시작
- 입력란 표시
- 정답 입력 ->  숫자 검증 -> 결과 출력
- 오답 시 게임 재개
- 정답 시 게임 종료 or 재시작 선택 

### Git 커밋 메시지 구분
- `feat`: feature
- `fix`: bug fix
- `docs`: documentation
- `style`: formatting, missing semi colons, …
- `refactor`: refactoring
- `test`: when adding missing tests
- `chore`: maintain