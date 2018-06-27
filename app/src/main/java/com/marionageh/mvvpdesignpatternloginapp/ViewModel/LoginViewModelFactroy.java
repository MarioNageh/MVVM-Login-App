package com.marionageh.mvvpdesignpatternloginapp.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.marionageh.mvvpdesignpatternloginapp.interfaces.LoginResultCallBack;

public class LoginViewModelFactroy extends ViewModelProvider.NewInstanceFactory {
    private LoginResultCallBack loginResultCallBack;

    public LoginViewModelFactroy(LoginResultCallBack loginResultCallBack) {
        this.loginResultCallBack = loginResultCallBack;

    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T)new LoginViewModel(loginResultCallBack);
    }
}
