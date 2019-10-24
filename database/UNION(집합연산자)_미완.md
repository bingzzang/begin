# UNION(집합연산자)

`관계형 데이터베이스`

SELECT문을 통해 데이터를 조회한 결과를 하나의 집합과 같이 다룰 수 있는 집합 연산자

두 개 이상의 SELECT문의 결과 값을 연결할 때 사용

```sql
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO = 10
 UNION
 SELECT EMPNO, ENAME, SAL, DEPTNO
   FROM EMP
  WHERE DEPTNO = 20;
```

- 집합 연산자로 두 개의 SELECT문의 결과 값을 연결할 때 각 SELECT문이 출력하려는 열 개수와 각 열의 자료형이 순서별로 일치해야 한다

  

```sql
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO = 10
 UNION
SELECT SAL, JOB, DEPTNO, SAL
  FROM EMP
 WHERE DEPTNO = 20;
```

- 연결하려는 두 SELECT문의 열 개수와 자료형이 같다면 서로 다른 테이블에서 조회하거나 조회하는 열 이름이 다른 것은 문제가 되지 않는다.





### 집한 연산자 종류 in ORACLE

| 종류      | 설명                                                         |
| --------- | :----------------------------------------------------------- |
| UNION     | 연결된 SELECT문의 결과 `합집합`으로 묶어 준다. 결과 값의 `중복은 제거` |
| UNION ALL | 연결된 SELECT문의 결과 값을 `합집합`으로 묶어 준다. `중복된 결과 값도 제거 없이 모두 출력` |
| MINUS     | 먼저 작성한 SELECT문의 결과 값에서 다음 SELECT문의 결과 값을 `차집합` 처리. 먼저 작성한 SELECT문의 결과 값 중 다음 SELECT문에 존재하지 않는 데이터만 출력 |
| INTERSECT | 먼저 작성한 SELECT문과 다음 SELECT문의 결과 값이 같은 데이터만 출력. `교집합` |



> 위와 아래의 결과 값은 다르다

- UNION

```sql
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO =10
 UNION 
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO =10;
```

-> 중복제거

- UNION ALL

```sql
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO =10
 UNION ALL
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO =10;
```

-> 중복값 제거 없이 모두 출력

