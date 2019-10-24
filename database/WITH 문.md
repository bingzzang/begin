# WITH 문

FROM 절에 너무 많은 서브쿼리를 지정하면 가독성이나 성능이 떨어질 수 있기 때문에 경우에 따라 WITH절을 사용함

(오라클 9i부터 지원)



```
WITH
[별칭] AS (SELECT문 1),
[별칭] AS (SELECT문 2),
...
[별칭] AS (SELECT문 N)
SELECT
FROM 별칭1, 별칭2, 별칭3
...
```

메인쿼리가 될 SELECT문 안에서 사용할 서브쿼리와 별칭을 먼저 지정한 후 메인쿼리에서 사용

1=1 : TRUE



