public class Skype implements Messenger {
    @Override
    public void sendMessage(User receiver, String messageContent) {
        System.out.printf(
                "User %s with number %s was send message [%s] via Skype%n",
                receiver.getUsername(),
                receiver.getPhoneNumber(),
                messageContent
        );
    }
}
