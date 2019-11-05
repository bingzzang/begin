# JOIN



조인(join) : 두 개 이상의 테이블을 연결하여 하나의 테이블처럼 출력할 때 사용하는 방식

- 집합 연산자와 조인의 차이점

  1. 집합 연산자를 사용한 결과는 두 개 이상 SELECT문의 결과 값을 `세로`로 연결

  2. 조인을 사용한 결과는 두 개 이상의 테이블 데이터를 `가로`로 연결

  

#### FROM 절에 여러 테이블 선언

```sql
SELECT
  FROM TABLE1, TABLE2, ..., TABLEN;
```

```sql
SELECT *
  FROM EMP, DEPT
 ORDER BY EMPNO;
```

> 카테시안 곱(Cartesian product) / 크로스 조인(cross join) / 교차 조인

- FROM 절에 명시한 각 테이블을 구성하는 행이 모든 경우의 수로 조합되어 출력 

  -> 생각보다 많은 양의 데이터 출력

- 불필요한 데이터도 출력되기 때문에 `where`절이 중요함

```sql
SELECT *
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO
 ORDER BY EMPNO; 
```



#### 테이블 별칭

```sql
FROM TABLE1 ALIAS1, TABLE2 ALIAS2 ..
```

```sql
SELECT *
  FROM EMP E, DEPT D	-- E와 D가 별칭(ALIAS)
 WHERE E.DEPTNO = D.DEPTNO
 ORDER BY EMPNO; 
```



### JOIN종류

등가 조인, 비등가 조인, 자체 조인, 외부 조인으로 구분



#### 등가 조인 Equi join/inner join /simple join

테이블을 연결한 후에 출력 행을 각 테이블의 특정 열에 일치한 데이터를 기준으로 선정하는 방식

내부조인(inner join), 단순 조인(simple join)이라고도 한다.

일반적으로 가장 많이 사용되는 조인 방식

특정 열 값이 일치한 출력 결과를 사용하는 방식

```sql
SELECT EMPNO, ENAME, DEPTNO, DNAME, LOC 	-- DEPTNO가 두 테이블에 모두 있는 경우
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO;
```

-> 여러 테이블의 열 이름이 같은 경우 오류가 발생

-> 두 테이블에 모두 존재하는 열일 경우 어느 테이블의 열인지 반드시 명시해야 함

```sql
SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME, D.LOC 
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO;
   AND SAL >= 3000; -- 추가로 조건식 넣기
```

구체적인 데이터를 출력하기 위해 WHERE절에 조인 조건 외에도 다양한 조건식을 활용



###### 조인 테이블 개수와 조건식 개수의 관계

조인할 때 조건을 제대로 지정하지 않는 경우 -> 데카르트 곱(Cartesian product)

​																						-> 필요없는 데이터까지 모두 출력

기본적으로 데카르트 곱 현상이 일어나지 않게 하는 데 필요한 조건식의 최소 개수

> 조인 테이블 개수 - 1



#### 비등가 조인(non-equi join)

등가 조인 방식 외의 방식

```SQL
SELECT E.*, S.GRADE
  FROM EMP E, SALGRADE S
 WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;
```



#### SELF JOIN

하나의 테이블을 여러 개의 테이블처럼 활용

```sql
SELECT E1.EMPNO, E1.ENQME, E1.MGR,
	   E2.EMPNO AS MGR_EMPNO,
	   E2.ENAME AS MGR_ENAME
  FROM EMP E1, EMP E2
 WHERE E1.MGR = E2.EMPNO;
```



#### OUTER JOIN

두 테이블간 조인 수행에서 조인 기준 열의 어느 한쪽이 NULL이어도 출력하는 방식

- LEFT OUTER JOIN

  ```sql
  WHERE TABLE1.COL1 = TABLE2.COL1(+)
  ```

  ```sql
  SELECT E1.EMPNO, E1.ENAME, E1.MGR,
  	   E2.EMPNO AS MGR_EMPNO,
  	   E2.ENAME AS MGR_ENAME
    FROM EMP E1, EMP E2
   WHERE E1.MGR = E2.EMPNO(+) 
   ORDER BY E1.EMPNO;
  ```

  ![image-20191105135633639](C:\Users\Metanet\AppData\Roaming\Typora\typora-user-images\image-20191105135633639.png)

  ```mysql
  SELECT E1.EMPNO, E1.ENAME, E1.MGR
  	 , E2.EMPNO AS MGR_EMPNO,
  	 , E2.ENAME AS MGR_ENAME
    FROM EMP E1 LEFT OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO)
   ORDER BY E1.EMPNO
  ```

  

- RIGHT OUTER JOIN

  ```sql
  WHERE TABLE1.COL1(+) = TABLE2.COL1
  ```

  ```sql
  SELECT E1.EMPNO, E1.ENAME, E1.MGR,
  	   E2.EMPNO AS MGR_EMPNO
  	   E2.ENAME AS MGR_ENAME
    FROM EMP E1, EMP E2
   WHERE E1.MGR(+) = E2.EMPNO
   ORDER BY E1.EMPNO;
  ```

  ![image-20191105135748431](C:\Users\Metanet\AppData\Roaming\Typora\typora-user-images\image-20191105135748431.png)

```mysql
SELECT E1.EMPNO, E1.ENAME, E1.MGR
	 , E2.EMPNO AS MGR_EMPNO
	 , E2.ENAME AS MGR_ENAME
  FROM EMP E1 RIGHT OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO)
 ORDER BY E1.EMPNO
```



#### FULL OUTER JOIN

```mysql
SELECT E1.EMPNO, E1.ENAME, E1.MGR
	 , E2.EMPNO AS MGR_EMPNO,
	 , E2.ENAME AS MGR_ENAME
  FROM EMP E1 FULL OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO)
 ORDER BY E1.EMPNO
```

![image-20191105144948943](C:\Users\Metanet\AppData\Roaming\Typora\typora-user-images\image-20191105144948943.png)

#### NATURAL JOIN

EQUI JOIN 을 대신해 사용할 수 있는 조인 방식

조인 대상이 되는 두 테이블에 이름과 자료형이 같은 열을 찾은 후 그 열을 기준으로 EQUI JOIN 을 해주는 방식

```mysql
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM
     , DEPTNO, D.DNAME, D.LOC
  FROM EMP E NATURAL JOIN DEPT D
 ORDER BY DEPTNO, E.EMPNO;
```

![image-20191105141011845](C:\Users\Metanet\AppData\Roaming\Typora\typora-user-images\image-20191105141011845.png)

> DEPTNO를 찾고 그 열을 중심으로 EQUI JOIN



#### JOIN ~USING

```sql
FROM TABLE1 JOIN TABLE2 USING (조인에 사용한 기준열)
```

EQUI JOIN 을 대신하는 조인 방식

USING 키워드에 조인 기준으로 사용할 열을 명시하여 사용

```mysql
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR
	 , E.HIREDATE, E.SAL, E.COMM 
	 , DEPTNO, D.DNAME, D.LOC
  FROM EMP E JOIN DEPT D USING (DEPTNO)
 WHERE SAL >= 3000
 ORDER BY DEPTNO, E.EMPNO;
```

![image-20191105144024001](C:\Users\Metanet\AppData\Roaming\Typora\typora-user-images\image-20191105144024001.png)



#### JOIN ~ ON

WHERE절에 있는 조인 조건식을 ON 키워드 옆에 작성

그 밖의 조건은 WHERE에 따로 사용

```sql
FROM TABLE1 JOIN TABLE2 ON (조인 조건식)
```

```sql
SELECT E.EMPNO, E.ENAME, E.JOB. E.MGR, E.HIREDATE, E.SAL, E.COMM
	 , E.DEPTNO
	 , D.DNAME, D.LOC
  FROM EMP E JOIN DEPT D ON(E.DEPTNO = D.DEPTNO)
 WHERE SAL <= 3000
 ORDER BY E.DEPTNO, EMPNO;
```

