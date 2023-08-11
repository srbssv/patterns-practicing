import observer.NewsChannel;
import observer.NewsReader;

import java.util.List;

public class App {
    public static final List<String> readerNames = List.of("John", "Damon", "Judy", "Jenny", "Mary");

    public static void main(String[] args) throws Exception {
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
}
