public class Telegram implements Messenger {
    @Override
    public void sendMessage(User receiver, String messageContent) {
        System.out.printf(
                "User %s with number %s was send message [%s] via Telegram%n",
                receiver.getUsername(),
                receiver.getPhoneNumber(),
                messageContent
        );
    }
}
