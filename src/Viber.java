public class Viber implements Messenger {
    @Override
    public void sendMessage(User receiver, String messageContent) {
        System.out.printf(
                "User %s with number %s was send message [%s] via Viber%n",
                receiver.getUsername(),
                receiver.getPhoneNumber(),
                messageContent
        );
    }
}
