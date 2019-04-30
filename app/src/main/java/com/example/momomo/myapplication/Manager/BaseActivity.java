package com.example.momomo.myapplication.Manager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.annimon.stream.function.ThrowableIntSupplier;
import com.example.momomo.myapplication.R;
import com.jph.takephoto.app.TakePhotoActivity;

public class BaseActivity extends TakePhotoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        ActivityCollector.addActivity(this);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
