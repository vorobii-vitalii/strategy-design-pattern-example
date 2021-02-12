import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<User> getExampleUsers() {
        final List<User> users = new ArrayList<>();

        users.add(new User("John", "+380994530817", List.of("telegram", "viber")));
        users.add(new User("Max", "+380994530812", List.of("telegram", "skype")));
        users.add(new User("William", "+380994230812", List.of( "skype")));
        users.add(new User("Jess", "+380921230812", List.of( )));

        return users;
    }

    public static void main(String[] args) {

        var contactList = new ContactList(getExampleUsers(), new MessengerFactoryImpl());

        contactList.sendMessageToAnyone("Hello there");
        contactList.sendMessageToAnyone("Another message");
    }

}
