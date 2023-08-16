package adapter;

public class EmailNotificationSender implements NotificationSender {
    private String targetEmailAddress;

    public EmailNotificationSender(String targetEmailAddress) {
        this.targetEmailAddress = targetEmailAddress;
    }

    @Override
    public void send(String title, String message) {
        System.out.println(String.format("Sending email with title %s to %s: %s", title, targetEmailAddress, message));
    }
}

