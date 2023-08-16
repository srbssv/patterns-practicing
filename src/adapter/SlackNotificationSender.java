package adapter;

public class SlackNotificationSender implements NotificationSender {
    private String targetSlackChannel;

    public SlackNotificationSender(String targetSlackChannel) {
        this.targetSlackChannel = targetSlackChannel;
    }

    @Override
    public void send(String title, String message) {
        System.out.println(String.format("Sending slack with title %s to %s: %s", title, targetSlackChannel, message));
    }
}
