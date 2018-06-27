package com.marionageh.mvvpdesignpatternloginapp;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActivityChooserView;

import com.marionageh.mvvpdesignpatternloginapp.ViewModel.LoginViewModel;
import com.marionageh.mvvpdesignpatternloginapp.ViewModel.LoginViewModelFactroy;
import com.marionageh.mvvpdesignpatternloginapp.databinding.ActivityMainBinding;
import com.marionageh.mvvpdesignpatternloginapp.interfaces.LoginResultCallBack;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements LoginResultCallBack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setModel(ViewModelProviders.of(this,
                new LoginViewModelFactroy(this)).
                get(LoginViewModel.class));

    }

    @Override
    public void OnSuccess(String Message) {
        Toasty.success(this, Message).show();
    }

    @Override
    public void OnFailed(String Message) {
        Toasty.error(this, Message).show();
    }
}
