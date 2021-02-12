import java.util.List;

public class ContactList {
    private final List<User> contacts;
    private final MessengerFactory messengerFactory;

    public ContactList(List<User> contacts, MessengerFactory messengerFactory) {
        this.contacts = contacts;
        this.messengerFactory = messengerFactory;
    }

    public void sendMessageToAnyone(String message) {
        for (User contact : contacts) {
            try {
                var messenger =
                        messengerFactory.recognizeAvailableMessengerByUser(contact);

                messenger.sendMessage(contact, message);
            }
            catch (RuntimeException e) {
                System.out.format("Unable to send message to %s. Cause: %s %n",
                        contact.getUsername(),
                        e.getMessage()
                );
            }
        }
    }

}
