# DECODE / CASE



### DECODE 함수

> 기준이 되는 데이터를 먼저 지정한 후 해당 데이터 값에 따라 다른 결과 값을 내보내는 함수

```sql
DECODE([검사 대상이 될 열 또는 데이터, 연산이나 함수의 결과],
	   [조건1], [데이터가 조건1과 일치할 때 반환할 결과],
	   [조건2], [데이터가 조건2와 일치할 때 반환할 결과],
	   ...
	   [조건N], [데이터 조건N과 일치할 때 반환할 결과],
	   [위 조건1~조건N과 일치한 경우가 없을 때 반환할 결과])
```



###### - 예시

```sql
SELECT EMPNO, ENAME, JOB, SAL,
	   DECODE(JOB,
	   		  'MANAGER', SAL*1.1,
	   		  'SALESMAN', SAL*1.05,
	   		  'ANALYST', SAL,
	   		  SAL*1.03) AS UPSAL
  FROM EMP;
```

EMP 테이블에서 직책이 MANAGER인 사람은 급여의 10%를 인상한 급여,

SALESMAN인 사람은 급여의 5%, ANALYST는 그대로, 나머지는 3%만큼 인상된 급여를 보고싶을 때



### CASE문

CASE문은 DECODE와 마찬가지로 특정 조건에 따라 반환할 데이터를 설정할 때 사용.

각 조건에 사용하는 데이터가 서로 상관없어도 된다.

`DECODE에서 CASE로의 변환은 모두 가능하지만 CASE에서 DECODE로의 변환은 가능하지 않을 수도 있다. CASE의 기능이 더 많기 때문이다`

```sql
CASE[검사 대상이 될 열 또는 데이터, 연산이나 함수의 결과(선택)]
	WHEN [조건1] THEN [조건1의 결과 값이 TRUE일 때, 반환할 결과]
	WHEN [조건2] THEN [조건2의 결과 값이 TRUE일 때, 반환할 결과]
	...
	WHEN [조건N] THEN [조건N의 결과 값이 TRUE일 때, 반환할 결과]
	ELSE [위 조건1~조건N과 일치하는 경우가 없을 때 반환할 결과]
 END
```



* ###### 예시(기준데이터 O)

```sql
SELECT EMPNO, ENAME, JOB, SAL,
  CASE JOB
  	   WHEN 'MANAGER' THEN SAL*1.1
  	   WHEN 'SALESMAN' THEN SAL*1.05
  	   WHEN 'ANALYST' THEN SAL
  	   ELSE SAL*1.03
   END AS UPSAL
  FROM EMP;
```



* ###### 예시2 (기준데이터 X)

```sql
SELECT EMPNO, ENAME, COMM,
	CASE
	 WHEN COMM IS NULL THEN '해당사항 없음'
	 WHEN COMM = 0 THEN '수당없음'
	 WHEN COMM > 0 THEN '수당 : '|| COMM
	END AS COMM_TEXT
  FROM EMP;
```

CASE문은 DECODE 함수와는 달리 비교할 기준 데이터를 지정하지 않고 값이 같은 조건 이외의 조건도 사용할 수 있다.

