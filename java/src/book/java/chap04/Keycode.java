package book.java.chap04;

class Keycode 
{
	public static void main(String[] args) throws Exception
	{
		boolean run = true;
		int speed = 0;
		int keycode = 0;

		while (run){
			if (keycode !=13 && keycode !=10){	//캐리지리턴(13), 라인피드(10)
				System.out.println("---------------------------");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("---------------------------");
				System.out.println("����");

			}

			keycode = System.in.read();	//키보드의 키 코드를 읽음

			if (keycode == 49){	//1를 읽었을 경우
				speed++;
				System.out.println("���� �ӵ�="+speed);
				
			}else if (keycode ==50){ //2를 읽었을 경우
				speed--;
				speed--;
				System.out.println("���� �ӵ�="+speed);
			}else if (keycode ==51){ //3를 읽었을 경우
				run=false;
			}
		}

		System.out.println("���α׷� ����");
	}
}
