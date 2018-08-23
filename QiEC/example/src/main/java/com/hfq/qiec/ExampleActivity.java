package com.hfq.qiec;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.hfq.latte_core.app.Latte;

import activities.ProxyActivity;
import delegates.LatteDelegate;

/**
 * Created by HanFQ on 2018/8/21.
 */
public class ExampleActivity extends ProxyActivity {


    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
