package ch.espas.enguete;

import android.app.IntentService;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;

import androidx.core.app.NotificationManagerCompat;

//aus https://stackoverflow.com/questions/34517520/how-to-give-notifications-on-android-on-specific-time
public class NotificationService extends IntentService {
    private static final int NOTIFICATION_ID = 3;

    public NotificationService() {
        super("NotificationService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //Notification
        Notification.Builder builder = new Notification.Builder(this);
        builder.setContentTitle("EnGuete!");
        builder.setContentText("Haben Sie Hunger? Wir hätten hier ein Rezept für Sie.");
        builder.setSmallIcon(R.drawable.ic_stat_name); //Bild einfügen
        Intent notifyIntent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 2, notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        //to be able to launch your activity from the notification
        builder.setContentIntent(pendingIntent);
        Notification notificationCompat = builder.build();
        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
        managerCompat.notify(NOTIFICATION_ID, notificationCompat);


        //Vibration, kopiert von: https://stackoverflow.com/questions/13950338/how-to-make-an-android-device-vibrate
        // Get instance of Vibrator from current Context
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        // Vibrate for 400 milliseconds
        v.vibrate(400);
    }
}
