package com.hfq.qiec;

import android.app.Application;

import com.hfq.latte_core.app.Latte;

/**
 * Created by HanFQ on 2018/8/21.
 */
public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("")
                .configure();
    }
}
