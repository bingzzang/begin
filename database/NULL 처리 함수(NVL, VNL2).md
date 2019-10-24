# NULL 처리 함수(NVL, NVL2) 

(IN ORACLE)



### NVL 함수의 기본 사용법

```sql
NVL(NULL인지 여부를 검사할 데이터 또는 열, 앞의 데이터가 NULL일 경우 반환할 데이터)
```

> 열 또는 데이터를 입력하여 해당 데이터가 NULL이 아닐 경우 데이터를 그대로 반환하고,
>
> NULL인 경우 지정한 데이터를 반환한다

- ###### 예시

```sql
SELECT EMPNO, ENAME, SAL, COMM, SAL+COMM,
	   NVL(COMM, 0),
	   SAL+NVL(COMM,0)
  FROM EMP;
```



### NVL2 함수의 기본 사용법

```sql
NVL2(NULL인지 여부를 검사할 데이터 또는 열,
	 앞 데이터가 NULL이 아닐 경우 반환할 데이터 또는 계산식,
	 앞 데이터가 NULL일 경우 반환할 데이터 또는 계산식)
```

> 열 또는 데이터를 입력하여 해당 데이터가 NULL이 아닐 때와 NULL일 때 출력 데이터를 각각 지정한다.

- ###### 예시

```sql
SELECT EMPNO, ENAME, COMM,
	   NVL2(COMM, 'O', 'X'),
	   NVL2(COMM, SAL*12+COMM, SAL*12) AS ANNSAL
  FROM EMP;
```



### in MYSQL

* NVL : IFNULL

```mysql
IFNULL(컬럼명,'컬럼이 NULL인 경우 대체할 데이터')
```



* NVL2 : COALESCE 

```
COALESCE(EX1, EX2, EX3..)
```

EX1이 NULL이 아니면 EX1값을 그렇지 않으면 EX2, 

EX2가 NULL이 아니면 EX2, 그렇지 않으면 EX3.. 

> NVL2와 COALESCE 기능이 완전히 일치하지 않으므로
>
> NV2를 MYSQL로 고칠시에는 CASE를 쓰는 것이 나을 수도 있다



```mysql
select empno, ename, COMM,
  case 
	when comm is null then 'x'
    when comm is not null then 'o' 
    end as ox ,
  case
    when  comm is null then sal*12  
    when comm is not null then sal*12+comm END as annsal
  from emp;
```

