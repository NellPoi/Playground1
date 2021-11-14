package com.nellpoi.playground1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubActivity_AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_about_me);
    }

    public void click_Personal_Settings(View view) {
        final Intent intent = new Intent();
        intent.setClass(SubActivity_AboutMe.this, SubActivity_AboutMe_PersonalSettings.class);
        startActivity(intent);
    }

    public void click_ChangePassword(View view) {
        Intent intent = new Intent();
        intent.setClass(SubActivity_AboutMe.this, SubActivity_AboutMe_ChangePassword.class);
        startActivity(intent);
    }

    public void click_MyOrder(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_baseline_lock_24);
        builder.setTitle("提示");
        builder.setMessage("该功能还未开放");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.out.println("");
            }
        });
        builder.show();
    }

    public void click_Feedback(View view) {
        Intent intent = new Intent();
        intent.setClass(SubActivity_AboutMe.this, SubActivity_AboutMe_Feedback.class);
        startActivity(intent);
    }


}

