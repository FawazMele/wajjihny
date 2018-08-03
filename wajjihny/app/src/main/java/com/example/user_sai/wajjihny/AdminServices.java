package com.example.user_sai.wajjihny;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AdminServices extends AppCompatActivity {

    Button buttonService1 ;
    Button buttonService2;
    Button buttonService3;
    Button buttonService4;
//    Button buttonService5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_services);
        buttonService1 = (Button) findViewById(R.id.buttonService1);
        buttonService2 = (Button) findViewById(R.id.buttonService2);
        buttonService3 = (Button) findViewById(R.id.buttonService3);
        buttonService4 = (Button) findViewById(R.id.buttonService4);

//        buttonService5 = (Button) findViewById(R.id.buttonService5);

        buttonService1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder mBuilder =
                        new NotificationCompat.Builder(AdminServices.this)
                                .setSmallIcon(R.drawable.logo)
                                .setContentTitle("تنبيه !!")
                                .setContentText("تنبيه !! يرجى التوجه إلى الباصات ");
                        NotificationManager mNotificationManager =
                        (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                        mNotificationManager.notify(001, mBuilder.build());
                Toast.makeText(AdminServices.this , " تم إرسال التنبيه ", Toast.LENGTH_LONG).show();

                Intent i = new Intent(AdminServices.this , UserNotifications.class);
                i.putExtra("variable","v1");
                startActivity(i);
            }
        });


        buttonService2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder mBuilder =
                        new NotificationCompat.Builder(AdminServices.this)
                                .setSmallIcon(R.drawable.logo)
                                .setContentTitle("تنبيه !!")
                                .setContentText(" يرجى النزول من غرف الفندق فوراً");
                NotificationManager mNotificationManager =
                        (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                mNotificationManager.notify(001, mBuilder.build());
                Toast.makeText(AdminServices.this , " تم إرسال التنبيه ", Toast.LENGTH_LONG).show();

            }
        });

        buttonService3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder mBuilder =
                        new NotificationCompat.Builder(AdminServices.this)
                                .setSmallIcon(R.drawable.logo)
                                .setContentTitle("تنبيه !!")
                                .setContentText(" يرجى النزول من غرف الفندق فوراً");
                NotificationManager mNotificationManager =
                        (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                mNotificationManager.notify(001, mBuilder.build());
                Toast.makeText(AdminServices.this , " تم إرسال التنبيه ", Toast.LENGTH_LONG).show();

            }
        });

        buttonService4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder mBuilder =
                        new NotificationCompat.Builder(AdminServices.this)
                                .setSmallIcon(R.drawable.logo)
                                .setContentTitle("تنبيه !!")
                                .setContentText(" يرجى النزول من غرف الفندق فوراً");
                NotificationManager mNotificationManager =
                        (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                mNotificationManager.notify(001, mBuilder.build());
                Toast.makeText(AdminServices.this , " تم إرسال التنبيه ", Toast.LENGTH_LONG).show();

            }
        });
    }
    }

