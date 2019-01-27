package com.example.simon.appslauncher;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AppsLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return AppsLauncherFragment.newInstance();
    }
}
