# 계층구조 (Hierarchical Query)

![1566178390825](C:\Users\Metanet\AppData\Roaming\Typora\typora-user-images\1566178390825.png)

-> mgr 컬럼 데이터는 해당 사원의 관리자의 empno를 의미



### Start with

- 계층 질의의 루트(부모행)로 사용될 행을 지정한다.
- 서브쿼리를 사용할 수도 있다.



### CONNECT BY

- 계층 질의에서 상위계층(부모행)과 하위계층(자식행)의 관계를 규정할 수 있다.

- PRIOR 연산자와 함께 사용하여 계층구조로 표현할 수 있다.

  > CONNECT BY PRIOR 자식컬럼 = 부모컬럼 : 부모에서 자식으로 트리구성(TOP DOWN)
  >
  > CONNECT BY PRIOR 부모컬럼 = 자식컬럼 : 자식에서 부모로 트리구성(BOTTOM UP)
  >
  > CONNECT BY NOCYCLE PRIOR : NOCYCLE 파라미터를 이용하여 무한루프 방지

-  서브쿼리를 사용할 수 없다.

```
   ex)     CONNECT BY c.no = c.base_cate_no;

                       => no 컬럼과 base_cate_no이 계층적 연결 관계에 있다라고 설정하는것

                              (self join이라 생각해도 좋음)

                        CONNECT BY PRIOR c.no = c.base_cate_no;

                       => outer join을 생각해보라.

                             c.no(+) = c.base_cate_no; 와 같이 prior 키워드의 위치에 집중하자.

                             c.no 쪽에 위치하고 있는데 이것은 이렇게 설명 할 수 있다.

                            " no 컬럼을 참조하는 base_cate_no컬럼이 속한 레코드를 모두 찾아라."
```



### LEVEL Pseudocolumn

LEVEL은 계층구조 쿼리에서 수행결과의 depth를 표현하는 의사컬럼



### ORDER SIBLINGS BY

계층구조 쿼리에서 편하게 정렬작업을 할 수 있다



> CONNECT BY의 실행순서는 다음과 같다
>
> 1.  START WITH 절
> 2.  CONNECT BY 절
> 3.  WHERE 절 