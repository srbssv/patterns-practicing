import adapter.EmailNotificationSender;
import adapter.NotificationSender;
import adapter.NotificationService;
import adapter.SlackNotificationSender;
import observer.NewsChannel;
import observer.NewsReader;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void observer() {
        List<String> readerNames = List.of("John", "Damon", "Judy", "Jenny", "Mary");
        NewsChannel newsChannel = new NewsChannel();
        for (String readerName : readerNames) {
            NewsReader newsReader = new NewsReader(readerName);
            newsChannel.subscribeObserver(newsReader);
        }
        newsChannel.receiveNews("The plain crashed into the mountain.");
        newsChannel.unsubscribeObserver("Judy");
        System.out.println("--- Judy was unsubscribed ---");
        newsChannel.receiveNews("Happy Celebration!");
    }

    public static void adapter() {
        List<NotificationSender> senders = new ArrayList<>();
        senders.add(new EmailNotificationSender("developer@example.com"));
        senders.add(new SlackNotificationSender("Developers"));

        NotificationService notificationService = new NotificationService(senders);
        notificationService.sendNotification("Greeting message", "Hello, World!");

    }

    public static void main(String[] args) {
        System.out.println("--- Observer Pattern ---");
        observer();
        System.out.println("--- Adapter Pattern ---");
        adapter();
    }
}
