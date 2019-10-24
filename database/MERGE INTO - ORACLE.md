# MERGE INTO - ORACLE



### MERGE INTO

> 데이터베이스 테이블을 다룰 때, 특정 조건의 데이터가 존재하는 경우에는 해당 ROW를 원하는 값으로 UPDATE하고, 없는 경우에는 새로운 데이터를 INSERT해야 하는 경우에 사용한다.



```ORACLE
MERGE INTO 테이블명
USING(UPDATE나 INSERT될 데이터의 원천, 하나의 테이블만 사용한다면 FROM DUAL을 사용)
   ON(UPDATE될 조건=쿼리의 WHERE문)
 WHEN MATCHED THEN(ON에서 조건에 해당하면 실행 될 문)
 	UPDATE SET COL1=VAL1(UPDATE문 실행)
 WHEN NOT MATCHED THEN(ON에서 조건에 해당하지 않으면 실행 될 문)
 	INSERT(컬럼 LIST)VALUES(VALUE)
 ;
```

> USING(SELECT 시)에서 항상 해당 TABLE의 PK를 변수로 받아야 한다 (NULL 유의)



###### 예시

```
MERGE INTO MAP A
USING(SELECT :COL0 AS COL0
		   , :COL1 AS COL1
		   , :COL2 AS COL2
		   , :COL3 AS COL3
	    FROM DUAL) B			// FROM DUAL은 테이블을 1개만 쓸 때
   ON(A.COL0 = B.COL0 AND
   	  A.COL1 = B.COL1 AND
   	  A.COL2 = B.COL2 AND
   	  A.COL3 = B.COL3
   	  )
  WHEN MATCHED THEN
      UPDATE SET A.COL4 = 'Y'
               , A.COL5 = :받아올 값
               , A.COL6 = :받아올 값
  WHEN NOT MATCHED THEN
      INSERT(COL1, COL2, COL3, COL4, COL5, COL6)
      VALUES(:COL1, :COL2, :COL3, :COL4, :COL5, :COL6)
```

