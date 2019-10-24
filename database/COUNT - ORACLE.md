# COUNT - ORACLE

> COUNT 함수는 데이터 개수를 출력하는 데 사용
>
> COUNT함수에 *을 사용하면 SELECT문의 결과 값으로 나온 행 데이터의 개수를 반환해 줌



* 기본 형식

  ```
  COUNT([DISTINCT, ALL 중 선택 OR 아무 값도 지정하지 않음(선택)]
  	  [개수를 구할 열이나 연산자, 함수를 사용한 데이터(필수)]) 
   OVER(분석을 위한 여러 문법지정)(선택)
  ```

  DISTINCT :  중복된 값을 제거하고 출력

* 테이블의 데이터 개수 출력

  ```
  SELECT COUNT(*)
    FROM TAB;
  ```

* 부서 번호가 30번인 직원 수

  ```
  SELECT COUNT(*)
    FROM EMP
   WHERE DEPTNO = 30;
  ```

  WHERE 절의 조건식을 함께 사용하면 유용하게 쓸 수 있다

* COUNT - DISTINCT, ALL 사용

  ```
  SELECT COUNT(DISTINCT SAL),	-- 중복값 제거
  	   COUNT(ALL SAL),		-- 모든 값
  	   COUNT(SAL)			-- 옵션을 지정하지 않으면 ALL이 기본
    FROM EMP;
  ```

  

* 기타예제

  ```
  SELECT COUNT(COMM)
    FROM EMP;
  ```

  ```
  SELECT COUNT(COMM)
    FROM EMP
   WHERE COMM IS NOT NULL;
  ```

  COUNT 함수를 사용하면 NULL이 데이터로 포함되어 있을 경우,

  NULL 데이터는 반환 개수에서 제외 -> 두 예제의 결과 값은 같다