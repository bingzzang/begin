package book.javajs.chap08;

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}

class SpaceException extends Exception{
	public SpaceException(String msg) {
		super(msg);
	}
}

public class NewExceptionTest {

	static boolean enoughSpace() {
		//설치하는데 필요한 공간이 있는지 확인하는 코드
		return false;
	}
	
	static boolean enoughMemory() {
		//설치하는데 필요한 메모리공간이 있는지 확인하는 코드
		return true;
	}
	
	static void deleteTempFiles() {
		// 임시파일들을 삭제하는 코드
	}
	
	static void copyFiles() {
		//파일들 복사하는 코드
	}
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())	//충분한 설치 공간이 없으면
			throw new SpaceException("설치공간이 부족합니다.");
		if(!enoughMemory()) //충분한 메모리가 없으면
			throw new MemoryException("메모리가 부족합니다.");
	}
	
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException se) {
			se.printStackTrace();
			System.out.println(se.getMessage());
			System.out.println("공간을 확보한 후에 다시 설치");
		} catch (MemoryException me) {
			me.printStackTrace();
			System.out.println(me.getMessage());
			System.gc(); 			//garbage collection을 수행하여 메모리를 늘려준다.
			System.out.println("다시 설치 시도");
		}finally {
			deleteTempFiles();
		}
	}
}
