public class ServerMain {
    public static void main(String[] args) {
    ChatServer chatServer = new ChatServer();

    Thread threadChatServer = new Thread(chatServer);

        threadChatServer.start();

}
}