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

### 2024-10-16
- 주제 : 표준함수
- 내용 요약 : 
        apply	- 객체 '나 자신' / 객체의 초기화 및 수정
        run	- 결과 값 /	객체 안에서 작업을 수행 후 결과를 반환
        with - 	결과 값	/ 객체와 관련된 작업 처리, 객체는 인자로 넘김
        let	- 결과 값 /	객체를 인자로 받아 변환 및 작업 수행
        also -	객체 '나 자신' /	추가 작업을 수행하고 객체 반환
  
- 더 자세한 내용 블로깅 = https://hojeong016.tistory.com/31 
   
 

