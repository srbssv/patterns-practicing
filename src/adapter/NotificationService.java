package adapter;

import java.util.List;

public class NotificationService {
    private List<NotificationSender> senderList;

    public NotificationService(List<NotificationSender> senderList) {
        this.senderList = senderList;
    }
    public void sendNotification(String title, String message){
        for(NotificationSender sender: senderList){
            sender.send(title, message);
        }
    }
}
