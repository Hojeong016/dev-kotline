# 📘 TLI (Today’s Learning Insight)  
**매일 학습한 내용을 기록하고 정리하는 리포지토리입니다.**

---

## 📈 오늘의 학습 기록
#### 오늘 학습한 내용 중 인상 깊었던 내용을 위주로 간단히 정리했습니다. 더 자세한 학습 노트는 아래 링크를 통해 확인해 주세요.
// 추후 추가할 예정
### 2024-10-14
- 주제 : null 안전관련 연산자 
- 내용 요약:
  - 코틀린은 다양한 널 관련 연산자를 통해 기존 자바에서 볼 수 있던 NullPointerException을 방지할 수 있게 해준다.
    - Nullable 타입 선언
      - | var name:String? = null
        
    - 호출 연산자
        - ?. | A?. B | A가 null -> null / notnull -> B 실행
        - ?: | A?:B  | A가 null -> B 실행
        - !! | A!!B  | A가 notnull -> 실행 / null -> 예외 발생
          
- 과제에 적용해보기
    - if(id == member?.userId && password == member?.password) "로그인에 성공했습니다" else "로그인에 실패했습니다"
      
---

## 📚 공부한 주제들  
1.2024-10-14 : 상수와 변수,null,리턴타입(Unit),Any 클래스, 스마트 캐스팅,제어문(if 표현식/when),컬렉션,함수 사용법, 연산자(전개연산자,일치 연산자, null 연산자) 

---
