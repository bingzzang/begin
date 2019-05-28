package book.java.chap9;

public class Chatting {

	void startChat(String chatId) {
//		String nickname = null;
		String nickname = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+nickname +"]"+inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	class Chat{
		void start() {
			
		}
		void sendMessage(String message) {
			
		}
	}
}
