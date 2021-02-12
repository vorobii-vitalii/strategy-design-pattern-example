import java.util.Map;

public class MessengerFactoryImpl implements MessengerFactory {

    private final Map<String, Messenger> messengerMap =
            Map.of( "skype",    new Skype(),
                    "viber",    new Viber(),
                    "telegram", new Telegram());

    @Override
    public Messenger recognizeAvailableMessengerByUser(User user) {
        for (String messenger : messengerMap.keySet()) {
            if (user.isMessengerAvailable(messenger)) {
                return messengerMap.get(messenger);
            }
        }
        throw new RuntimeException("Neither of messengers is available by user");
    }

}
