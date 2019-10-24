# DATABASE (ORACLE/MYSQL)

### 	SQL 작성 규칙

1. 적당한 줄바꿈(엔터)과 줄맞춤(들여쓰기)가 필요
2. 항목별로 줄바꿈 하고, 컴마는 앞쪽에 둘 것
3. SELECT, FROM, WHERE 뒤쪽 공백에 줄맞춤
4. 명령어(대문자)와 명칭(소문자)의 대문자를 구별
5. ALIAS는 약어를 쓰는 것보다 a, b, c 쓰는게 깔끔해보임



예시)

```oracle, MYSQL
SELECT *
  FROM (SELECT a.a
  			 , a.b
  			 , b.c
  			 , b.d
  		  FROM table1 a
  		  	 , table2 b
  		 WHERE a.id  = b.id
  		   AND a.co1 = 1
  	    ) c
  WHERE ROWNUM =1
 ;
```

