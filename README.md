# begin

기초 자바

# JAVA Beginning

## Chapter 1

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
	 
	<pre><code>
	class Hello{
		~~
	}
	</code></pre>
* 속성(Attribute) : 객체의 특성
* 생성자(Constructor) : 객체가 만들어질 때 수행되는 일(기능)
* 메소드(Method) : 객체가 하는 일(기능)

------------------------------------------------- 

## Chapter 2
