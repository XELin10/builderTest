package com.buildertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.computer.build.Builder;
import com.computer.build.MacBuilder;
import com.computer.build.XiaomiBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Builder builder = new MacBuilder();
        builder.buildDisplay("戴尔显示器").buildBoard("因特尔主板");
        System.out.println(builder.create().toString());

        builder = new XiaomiBuilder();
        builder.buildBoard("小米主板").buildDisplay("小米显示器");
        System.out.println(builder.create().toString());

    }
}