# begin

기초 자바

# JAVA Beginning

## Chapter 1

### JDK

JDK (Java Development Kit) : Oracle이 배포하는 JAVA 언어 개발 환경



### PATH 환경설정

###### WINDOW 10

[시스템] - [고급 시스템 설정] -  고급 - 환경변수

- JAVA_HOME = C:\Program Files\Java\jdk-10.0.2(jdk설치경로)

- Path = %JAVA_HOME%\bin;
- classpath = . 


### 1. JAVA의 특징

* 이식성이 높은 언어 : 자바 실행 환경(JRE : Java Runtime Environmnet)이 설치되어 있는 모든 운영체제에서 실행 가능
* 객체 지향 언어 : 캡슐화, 상속, 다형성 기능을 완벽하게 지원
* 합수적 스타일 코딩 지원 : 람다식 지원(컬렉션의 요소를 필터링, 매핑, 집계처리하는데 쉬워지고 코드가 간결해짐)
* 메모리를 자동으로 관리
* 다양한 어플리케이션 개발 가능
* 멀티 스레드(Multi-Thread)를 쉽게 구현
* 동적 로딩(Dynamic Loading)을 지원
* 오픈소스 라이브러리 풍부

### 2. JAVA SE

JAVA SE는 자바 프로그램들이 공통적으로 사용하는 자바 가상 기계(JVM:Java Vertual Machine), 자바 프로그램 개발에 필요한 도구와 라이브러리 API를 정의한다.

자바 프로그램을 개발하기 위해서는 반드시 java se 구현체인 자바 개발 키트(JDK:Java Development Kit)를 설치해야 한다.

* JVM : 운영체제가 자바 프로그램을 바로 실행할 수 없어 이것을 해석하고 실행할 수 있는 가상의 운영체제. JDK 또는 JRE를 설치하면 자동으로 설치됨.
* JRE = JVM+표즌 클래스 라이브러리
* JDK = JRE+개발에 필요한 도구

### 3. JAVA EE

분산 환경(네트워크, 인터넷)에서 서버용 애플리케이션을 개발하기 위한 도구 및 라이브러리 API를 정의한다.

서버용 애플리케이션 : Servlet/JSP를 이용한 웹 어플리케이션, EJB(Enterprise Java Bean), XML Web services...

### 4. 용어
* 객체(Object) : 모든 것, 클래스로부터 나온 구현물
* 클래스(Class) : 객체를 만들기 위한 틀
* 속성(Attribute) : 객체의 특성
* 생성자(Constructor) : 객체가 만들어질 때 수행되는 일(기능)
* 메소드(Method) : 객체가 하는 일(기능)

<pre><code>
	class Hello{ //클래스
		String name = "Tom";	//멤버변수 (속성)
		int age= 30;
		
		Hello(){	//생성자
		}
        
		void introduce(){	//메소드
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
		}
		public static void main(String args[]){
			Hello h = Hello();	//객체생성
			h.introduce();		//메소드실행
		}
	}
	</code></pre>
	
### 5. 주석 (Comment)
    * 한 라인 //
	 * 여러 라인 /* */
	 * 문서화(나중에..) /** */
------------------------------------------------- 

## Chapter 2

### 1.변수

#### 변수의 정의

변수란, 하나의 값을 저장할 수 있는 메모리 공간이다.
다양한 타입의 값을 저장할 수 없고 한가지만 가능

1. 변수의 이름(name)
2. 변수의 형(type)

#### 식별자 (identifier)

 변수의 이름으로 사용할 수 있는 문자와 숫자의 조합

- 일반적으로 여움자와 숫자와 밑줄(_), $ 등을 사용

- 길이에는 제한이 없다

- 미리 java가 예약한 토큰인 '키워드'를 사용할 수 없음

  ex) return, class .. 

- 숫자로 시작할 수 없다

- 알파벳 대문자와 소문자는 다른 문자로 구별됨

#### 형(type)

- boolean : true/ false
- char : 2바이트 문자(\u0000~ \uffff)
- byte : 1바이트 정수(-128~127)
- short : 2바이트 정수(-32768~32767)
- int : 4바이트 정수(-2147483648~2147483647)
- long : 8바이트 정수(-9223372036854775808~9223372036854775807)
- float : 4바이트 단정도 부동 소수
- double : 8바이트 단정도 부동 소수

#### 변수의 선언
<pre><code>
형명 식별자;
</code></pre>
<pre><code>
int age;
String name;
String name, city;
</code></pre>
같은 타입의 변수는 콤마(,)를 이용해서 한꺼번에 선언 가능

-----------------------------------------------------

...

------------------------------------------------------

## Chapter 11

### 정규식 표현
* [] : 한 개의 문자
* [abc] : a,b,c 중 하나의 문자
* [^abc] : a,b,c 이외의 하나의 문자
* [a-zA-Z] : a~z, A~Z  중 하나의 문자 

* \d : 한 개의 숫자, [0-9]와 동일
* \s : 공백
* \w : 한 개의 알파벳 또는 한 개의 숫자, [a-zA-Z_0-9]와 동일
* ? : 없음 또는 한 개
* \* : 없음 또는 한 개 이상
* \+ : 한 개 이상
* {n} : 정확히 n개
* {n,} : 최소한 n개
* {n,m} : n개에서부터 m개까지
* () : 그룹핑

#### 전화번호 정규식

<pre><code>
(02|010)-\d{4}-\d{4}
</code></pre>

#### 이메일 정규식
<pre><code>
\w+@\w+\.\w+(\.\w+)?
</code></pre>
