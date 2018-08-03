package com.example.user_sai.wajjihny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class UserNotifications extends AppCompatActivity {

    ImageView imageNotification ;
    TextView textNotification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_notifications);
        imageNotification = (ImageView) findViewById(R.id.image_notification);
        textNotification = (TextView) findViewById(R.id.text_notification);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            imageNotification.setImageResource(R.drawable.bus);
            textNotification.setText("تنبيه !!  يرجى التوجه إلى الباصات");
        }


    }
}
