package com.example.user_sai.wajjihny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginAsUser extends AppCompatActivity {

    EditText nameEdit;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_as_user);

        saveButton = (Button) findViewById(R.id.buttonSave);
        nameEdit = (EditText) findViewById(R.id.editText);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (nameEdit.getText().toString().isEmpty())
                {
                    Toast.makeText(LoginAsUser.this , "الرجاء ادخال رقم الحملة" , Toast.LENGTH_LONG).show();
                }
                if (!nameEdit.getText().toString().isEmpty()){
                Toast.makeText(LoginAsUser.this , " تم تسجيلك في الحملة رقم  "
                        + nameEdit.getText().toString() , Toast.LENGTH_LONG).show();
                startActivity(new Intent(LoginAsUser.this , UserNotifications.class));
            }
            }
        });
    }
}
