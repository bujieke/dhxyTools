package com.zy.dhxytools.activity;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.zy.dhxytools.R;
import com.zy.dhxytools.base.BaseActivity;

public class GuoShiJiFenJSQ extends BaseActivity {


    private Button mBtnJs;
    private EditText mEditQmd;
    private EditText mEditJqylz;
    private EditText mEditPgjt;
    private EditText mEditDjwxjh;
    private EditText mEditGjwxjh;
    private EditText mEditGjjns;

    @Override
    protected int getLayout() {
        return R.layout.activity_guoshijifenjsq;
    }

    @Override
    protected void initView() {
        mBtnJs = (Button) findViewById(R.id.btn_js);
        mEditQmd = (EditText) findViewById(R.id.edit_qmd);
        mEditJqylz = (EditText) findViewById(R.id.edit_jqylz);
        mEditPgjt = (EditText) findViewById(R.id.edit_pgjt);
        mEditDjwxjh = (EditText) findViewById(R.id.edit_djwxjh);
        mEditGjwxjh = (EditText) findViewById(R.id.edit_gjwxjh);
        mEditGjjns = (EditText) findViewById(R.id.edit_gjjns);
        mBtnJs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
