package com.example.user_sai.wajjihny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginAsAdmin extends AppCompatActivity {


    Button buttonConfirm ;
    EditText editEmpNum;
    EditText editCampNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_as_admin);


        buttonConfirm = (Button) findViewById(R.id.buttonSaveEmp);
        editEmpNum = (EditText)findViewById(R.id.editEmployeeNumber);
        editCampNum = (EditText) findViewById(R.id.editNumberCampEmployee);
        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        if (editEmpNum.getText().toString().isEmpty())
        {
            Toast.makeText(LoginAsAdmin.this , "الرجاء ادخال رقم الموظف" , Toast.LENGTH_LONG).show();
        }
        if (!editEmpNum.getText().toString().isEmpty() && !editCampNum.getText().toString().isEmpty()){
            Toast.makeText(LoginAsAdmin.this , " تم تسجيلك كمشرف على الحملة رقم  "
                    + editCampNum.getText().toString() , Toast.LENGTH_LONG).show();
            startActivity(new Intent(LoginAsAdmin.this , AdminServices.class));
        }
            }
        });

    }
}
