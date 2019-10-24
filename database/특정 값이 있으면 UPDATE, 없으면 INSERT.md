# 특정 값이 있으면 UPDATE, 없으면 INSERT

## in MYSQL

### `ON DUPLICATE KEY`

```mysql
INSERT INTO TABLE1
(	AAA(PK)
   ,BBB
   ,CCC
   ,DDD
   ,EEE
)
VALUES
(	'AAA'
   ,'BBB'
   ,'CCC'
   ,'DDD'
   ,'EEE'
)
ON DUPLICATE KEY
UPDATE
    BBB = '222'
   ,CCC = '333'
   ,DDD = '444'
   ,EEE = '555'
```

테이블에 기본키(Primary Key)가 동일한 값이 존재한다면 UPDATE문 실행,

그렇지 않다면 INSERT 문을 수행한다



> INSERT문 + ON DUPLICATE KEY + UPDATE 문

--> ORACLE의 MERGE INTO 구문과 비슷



`UPDATE문에는 SET을 쓰지 않는다` 







## in ORACLE

### `MERGE INTO`

1. 동일한 테이블 구조를 가지고 있는 테이블로부터 데이터를 옮길 때		

```
MERGE INTO TABLE_A A
	 USING TABLE_B B
	    ON (A.ID=B.ID)
	 WHEN MATCHED THEN
	 	UPDATE SET A.NAME = B.NAME
	 WHEN NOT MATCHED THEN
	    INSERT(A.ID, A.NAME)
	    VALUES(B.ID, B.NAME);
```



2. 다른 테이블에서 데이터를 비교하여 가져오는 것이 아닌 직접 값을 넣고자 할 때

   `dual` 을 사용

   ```
   MERGE INTO TABLE_A A    
   USING DUAL       
      ON (A.ID = 'AAA')    
   WHEN MATCHED THEN        
     UPDATE SET 
    	        A.AGE = 20    
   WHEN NOT MATCHED THEN        
     INSERT (A.ID, A.AGE)        
     VALUES ('AAA', 20);
   ```

   

3. 업데이트나 입력 하나만 할 때

   ```
   MERGE INTO TABLE_A A
        USING DUAL
           ON (A.ID = 'AAA')
   WHEN NOT MATCHED THEN
     INSERT (A.ID, A.AGE)        
     VALUES ('AAA', 20);
   ```

   

> ON 뒤에 나오는 조건은 PRIMARY KEY(기본키)를 사용해야 한다.
>
> 그렇지 않으면 중복이 발생되어 에러가 날 수 있다.