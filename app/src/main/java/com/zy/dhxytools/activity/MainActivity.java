package com.zy.dhxytools.activity;

import android.view.View;
import android.widget.Button;

import com.zy.dhxytools.R;
import com.zy.dhxytools.base.BaseActivity;
import com.zy.dhxytools.present.MainPresent;
import com.zy.dhxytools.view.MainView;

public class MainActivity extends BaseActivity implements MainView {
    private Button mBtnGsjfdh;
    private MainPresent mPresent;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mPresent = new MainPresent();
        mPresent.attach(this);


        mBtnGsjfdh = (Button) findViewById(R.id.btn_gsjfdh);
        //郭氏积分兑换
        mBtnGsjfdh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresent.startGuoShiJiFenJSQ(getApplicationContext());
            }
        });
    }


}
