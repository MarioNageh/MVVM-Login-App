package com.marionageh.mvvpdesignpatternloginapp.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.marionageh.mvvpdesignpatternloginapp.Model.User;
import com.marionageh.mvvpdesignpatternloginapp.interfaces.LoginResultCallBack;

public class LoginViewModel extends ViewModel {
    private User user;
    private LoginResultCallBack loginResultCallBack;

    public LoginViewModel(LoginResultCallBack loginResultCallBack) {
        this.loginResultCallBack = loginResultCallBack;
        this.user = new User();
    }

    public TextWatcher getEmailTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setEmail(s.toString());
            }
        };
    }

    public TextWatcher getPasswordTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setPassword(s.toString());
            }
        };
    }

    public void OnClicked(View view) {
        if (user.isValidtion() == 0) {
            loginResultCallBack.OnFailed("You Must Enter Your Email");

        }else if(user.isValidtion()==1){
            loginResultCallBack.OnFailed("You Must Enter a Validate Email");

        }else if(user.isValidtion()==2){
            loginResultCallBack.OnFailed("Your Password Must be over 6 char");

        }else {
            loginResultCallBack.OnSuccess("Succes Login");

        }




    }

}
