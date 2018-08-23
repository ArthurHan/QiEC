package com.hfq.qiec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import delegates.LatteDelegate;

/**
 * Created by HanFQ on 2018/8/23 0023.
 */
public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
