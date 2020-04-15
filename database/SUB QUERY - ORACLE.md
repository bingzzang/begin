# SUB QUERY - ORACLE

INSERT + SUB QUERY = SELECT문으로 한 번에 여러 행 추가 가능



select *

from A, B, C

where A.a = B.b(+)

​			B.b(+)=1  -- > 조인을 안걸어주면 위에도 조인 걸 수가 없음



select *

from A, B, C

left outer join (select b from B where b = 1) B on A.a = B.b

---> 이렇게 서브쿼리로 where문에 조건을 걸어줘도 됨