## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

### TODO
- Car 클래스 생성
- car.race() 메서드 생성
    - 시도 횟수에 따라 50% 확률로 앞으로 진행
    - 앞으로 진행 시 "-"가 진행한 만큼 출력

### 기능 요구사항
- 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.

### 힌트
- 자동차는 자동차 이름과 위치 정보를 가지는 Car 객체를 추가해 구현한다.

### 프로그래밍 요구사항
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- 기본적으로 [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html) 을 원칙으로 한다.
- 단, 들여쓰기는 '2 spaces'가 아닌 '4 spaces'로 한다.
- indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
- 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
- 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- else 예약어를 쓰지 않는다.
- 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
- else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
- 3항 연산자를 쓰지 않는다.
- 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
- 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
- UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- 모든 원시 값과 문자열을 포장한다.
- 일급 컬렉션을 쓴다.

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