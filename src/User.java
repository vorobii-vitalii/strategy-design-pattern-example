import java.util.Collection;

public class User {
    private final String username;
    private final String phoneNumber;
    private final Collection<String> attachedMessengers;

    public User(String username, String phoneNumber, Collection<String> attachedMessengers) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.attachedMessengers = attachedMessengers;
    }

    public boolean isMessengerAvailable(String messenger) {
        return attachedMessengers.contains(messenger);
    }

    public String getUsername() {
        return username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
