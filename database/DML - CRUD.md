# DML - SELECT(조회)

##### desc

describe. 테이블의 정보를 출력



##### selection(셀렉션)

행 단위로 원하는 데이터를 조회하는 방식



##### projection(프로젝션)

열 단위로 원하는 데이터를 조회



##### 조인(join)

두 개 이상의 테이블을 양옆에 연결하여 마치 하나의 테이블인 것처럼 데이터를 조회하는 방식

##### 



## SELECT / FROM

```sql
SELECT 조회할 열1, 조회할 열2, ..., 열N
  FROM 테이블 이름
```

```sql
SELECT * 
  FROM EMP;
```

> EMP 테이블의 모든 데이터를 검색

```SQL
SELECT EMPNO
     , DEPTNO
  FROM EMP;
```

> EMP 테이블의 EMPNO와 DEPTNO 검색



## DISTINCT / ALL

중복 데이터 삭제

SELECT절에 열 이름을 명시하기 전에 선택적으로 사용할 수 있다.

```sql
SELECT DISTINCT DEPTNO FROM EMP;
```

중복행은 하나만 남겨두고 모두 제거



##### ALL로 중복되는 열 제거 없이 그대로 출력

```SQL
SELECT ALL JOB, DEPTNO
  FROM EMP;
```



## ALIAS(별칭)

본래 이름 대신 붙이는 별칭

```sql
SELECT ENAME
	 , SAL
	 , SAL*12+COMM AS ANNSAL
	 , COMM
  FROM EMP;
```

##### 별칭을 지정하는 방식

| 사용 방법               | 설명                                                         |
| ----------------------- | ------------------------------------------------------------ |
| SAL*12+COMM ANNSAL      | 연산 및 가공된 문장 이후 한 칸 띄우고 별칭 지정              |
| SAL*12+COMM "ANNSAL"    | 연산 및 가공된 문장 이후 한 칸 띄우고 별칭을 큰따옴표("")로 묶어 지정 |
| SAL*12+COMM AS ANNSAL   | 연산 및 가공된 문장 이후 한 칸 띄운 후 'AS', 한 칸 뒤에 별칭 지정 |
| SAL*12+COMM AS "ANNSAL" | 연산 및 가공된 문장 이후 한 칸 띄운 후 'AS', 한 칸 뒤에 별칭을 큰따옴표로 묶어 지정("") |

> 실무에서는 ""를 사용하는 방식은 오류가 날 수 있기 때문에 `AS 별칭`을 권장한다.

--------------

##### 쿼리 문에 연산식이 들어갈 수 있음

SAL*12+COMM 같이 들어갈 수 있다

'*'은 곱하기 '+'은 더하기를 의미

값이 NULL일 경우에는 데이터가 출력되지 않음

-------------





## ORDER BY

데이터를 정렬된 상태로 출력하기 위해 사용

```SQL
SELECT 열1, 열2, ..., 열N
  FROM 테이블
  .
  .
  
ORDER BY 열이름(여러 열 가능), 정렬 옵셥;
```

```SQL
SELECT *
  FROM EMP
 ORDER BY SAL;
```

> 오름차순으로 정렬

```sql
SELECT *
  FROM EMP
 ORDER BY SAL DESC;
```

> 내림차순으로 정렬

```sql
SELECT *
  FROM EMP
 ORDER BY DEPTNO ASC, SAL DESC;
```

> 각각의 열에 내림차순과 올림차순 동시에 사용할 수 있음



ORDER BY 절을 사용할 경우 데이터를 정렬하는 데에 시간이 많이 필요할 수 있으므로 SQL문의 효율(서비스 시간이 증가)이 낮아 질 수 있다. 

```sql
  SELECT EMPNO  AS EMPLOYEE_NO
       , ENAME  AS EMPLOYEE_NAME
       , MGR    AS MANAGER
       , SAL    AS SALARY
       , COMM   AS COMMISSION
       , DEPTNO AS DEPARTMENT_NO
    FROM EMP
ORDER BY DEPTNO DESC
       , ENAME  ASC; 
```

> SELECT문 예시





## WHERE

SELECT문으로 데이터를 조회할 때 특정 조건을 기준으로 원하는 행을 출력

```sql
SELECT *
  FROM EMP
 WHERE DEPTNO = 30;
```

> DEPTNO가 30인 데이터를 모두 출력

```sql
SELECT 열1, 열2, ..., 열N
  FROM 테이블
 WHERE 조건식;
```

WHERE절이 포함된 SELECT문을 실행하면 조회할 테이블의 각 행에 조건식을 대입하여 결과가 '참'일 경우에만 출력



### AND, OR (여러 개 조건식 사용)

```sql
SELECT *
  FROM EMP
 WHERE DEPTNO = 30
   AND JOB = 'SALESMAN';
```

> WHERE절에서 조건식을 여러 개 지정할 수 있는데 그 때 사용하는 것이 AND와 OR이다
>
> 조선식의 개수는 사실 상 제한이 없다.

> 직접 열을 비교하는 문자열 데이터는 대문자로 작성해야 한다
>
> SQL문에 사용하는 기본 형식은 대소문자를 구별하지 않지만 테이블 안에 들어 있는 문자 또는 문자열 데이터는 대소문자를 구별하기 때문이다

```SQL
SELECT *
  FROM EMP
 WHERE DEPTNO = 30
    OR JOB = 'CLERK';
```

> 부서 번호 열 값이 30이거나 열 값이 CLERK인 사원을 모두 출력





### 산술 연산자

```sql
SELECT *
  FROM EMP
 WHERE SAL*12 =36000;
```

> 곱셈 연산자, WHERE 절에서도 가능



### 비교연산자

```SQL
SELECT *
  FROM EMP
 WHERE SAL >=3000;
```

###### 대소 비교 연산자는 비교 대상인 데이터가 숫자가 아닌 문자열일 때도 사용할 수 있다.

```sql
SELECT *
  FROM EMP
 WHERE ENAME >='F';
```

> 사원 이름의 첫 문자가 F와 같거나 뒤쪽인 것만 검색

###### 

###### 등가비교연산자

| 연산자 | 사용법 | 의미                                          |
| ------ | ------ | --------------------------------------------- |
| =      | A = B  | A 값이 B 값과 같을 경우 TRUE, 다를 경우 FALSE |
| !=     | A != B | A 값과 B값이 다를 경우 TRUE, 같을 경우 FALSE  |
| <>     | A <> B | A 값과 B값이 다를 경우 TRUE, 같을 경우 FALSE  |
| ^=     | A ^= B | A 값과 B값이 다를 경우 TRUE, 같을 경우 FALSE  |

```sql
SELECT *
  FROM EMP
 WHERE SAL <>3000;
```

> !=, <>, ^= 같은 값을 출력, 실무에서는 <>를 많이 씀

#### 

### 논리 부정 연산자(NOT)

```SQL
SELECT *
  FROM EMP
 WHERE NOT SAL = 3000;
```

> 결과적으로는 위와 같은 값

> 여러 개 조건식이 AND, OR로 묶여 있는 상태에서 정반대 결과를 얻고자 할 때 유용하게 사용



### IN 연산자

= 기호는 WHERE 조건식에서 특정 열 데이터 값만을 조회하고자 할 때 사용

IN 연산자를 사용하면 특정 열에 해당하는 조건을 여러 개 지정할 수 있다

```sql
SELECT 열1, 열2, ..., 열N
  FROM 테이블
 WHERE 열 이름 IN (데이터1, 데이터2, ..., 데이터N);
```

```SQL
SELECT *
  FROM EMP
 WHERE JOB IN ('MANAGER', 'SALESMAN', 'CLERK');
```

> WHERE문 OR연산자를 쓴것과 같은 값이 출력

```SQL
SELECT *
  FROM EMP
 WHERE JOB NOT IN ('MANAGER', 'SALESMAN', 'CLERK');
```

> JOB이 MANAGER, SALESMAN, CLERK을 제외하고 출력



### BETWEEN A AND B

```SQL
 SELECT 열1, 열2, ..., 열N
   FROM 테이블
  WHERE 열 이름
BETWEEN 최솟값 AND 최댓값;
```

> 기본문법

```SQL
 SELECT *
   FROM EMP
  WHERE SAL BETWEEN 2000 AND 3000;
```

```sql
 SELECT *
   FROM EMP
  WHERE SAL NOT BETWEEN 2000 AND 3000;
```

WHERE 조건문에서 열값이 2000에서 3000사이인 값만 출력하고 싶을 때 사용



### LIKE 연산자/ 와일드 카드

LIKE 연산자는 이메일이나 게시판 제목 또는 내용 검색 기능처럼 일부 문자열이 포함된 데이터를 조회할 때 사용함

```SQL
SELECT *
  FROM EMP
 WHERE ENAME LIKE 'S%';
```

```sql
SELECT *
  FROM EMP
 WHERE ENAME LIKE '%AM%';
```



> ENAME LIKE 'S%' : ENAME 열 값이 대문자 S로 시작하는 데이터를 조회하라는 뜻
>
> % : 와일드 카드(WILD CARD)

| 종류 | 의미                                                         |
| ---- | ------------------------------------------------------------ |
| _    | 어떤 값이든 상관없이 한 개의 문자 데이터를 의미              |
| %    | 길이와 상관없이(문자 없는 경우도 포함) 모든 문자 데이터를 의미 |

###### 사원 이름의 두 번째 글자가 L인 사원만 출력

```sql
SELECT *
  FROM EMP
 WHERE ENAME LIKE '_L%';
```

###### 반대로 특정 단어가 포함된 데이터를 제외한 결과를 얻고자 할 때는 LIKE 앞에 NOT을 붙여 사용한다

```sql
SELECT *
  FROM EMP
 WHERE ENAME NOT LIKE '%AM%';
```



###### 와일드 카드 문자가 데이터 일부일 경우

'A_A'

```sql
SELECT *
  FROM TABLE1
 WHERE COLUNM LIKE 'A\_A%' ESCAPE '\';
```

\ 문자 바로 뒤에 오는 와일드 카드 기호는 문자로 인식하라는 의미

ESCAPE 문자 \는 ESCAPE절에서 지정할 수 있고 \ 이 아니어도 다른 문자를 지정할 수 있따



### IS NULL 연산자

NULL의 의미

- 값이 존재하지 않음
- 해당사항 없음
- 노출할 수 없는 값
- 확정되지 않은 값

```sql
SELECT *
  FROM EMP
 WHERE COMM = NULL;
```

> 아무 값도 출력되지 않음
>
> WHERE절은 조건식의 결과 값이 TRUE만 출력하는데 연산 결과 값이 NULL이 되버리면 조건식의 결과 값이 FALSE도 TRUE도 아니게 되기 때문에 출력대상에서 제외된다.
>
> 특정 열 또는 연산의 결과 값이 NULL 인지 여부를 확인하려면 `IS NULL`을 사용해야 한다

```sql
SELECT *
  FROM EMP
 WHERE COMM IS NULL;
```

```SQL
SELECT *
  FROM EMP
 WHERE COMM IS NOT NULL;
```

> 반대로 NULL값이 아닌 행을 출력하려면 `IS NOT NULL`을 사용하면 된다

