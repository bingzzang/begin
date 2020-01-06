package begin.book;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.print("It's ");
		System.out.print("Java Programming!\n");
		
		String name = "Haley";
		System.out.println(name);
	}
}

/*
 * 1. java compile -> javac 파일명.java
 * 2. java 실행 -> java 파일명
 * 3. java 프로그램의 시작점 -> main 메소드 ( public static void main에서 main은 소문자여야 한다)
 * 4. class명 = 파일명 (첫 글자는 반드시 대문자)/ 명사형
 * 5. 하나의 명령문은 ; 로 끝나야 한다.(명령문이 종료된다는 것을 컴파일러에게 알려주는 역할)
 * 6. 식별자의 이름에 특수 문자는 사용할 수 없다('$','_'는 가능)
 * 7. 변수/메소드
 * 		- 첫 문자는 소문자
 * 		- 변수는 의미 있는 명사형, 메소드는 동사형
 * 		- 하나 이상의 단어일 경우 두 번째 단어부터 첫 문자는 대문자로 표현
 * 8. 상수
 * 		- 명사형
 * 		- 모든 문자를 대문자
 * 		- 하나 의상의 단어는 _를 이용
 * */
