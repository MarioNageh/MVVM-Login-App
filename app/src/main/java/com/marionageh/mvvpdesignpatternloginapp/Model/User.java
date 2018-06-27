package com.marionageh.mvvpdesignpatternloginapp.Model;

import android.databinding.BaseObservable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Patterns;

public class User extends BaseObservable {
    @Nullable
    String email,password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @Nullable
    public String getPassword() {
        return password;
    }

    public void setPassword(@Nullable String password) {
        this.password = password;
    }
    public int isValidtion(){
        if(TextUtils.isEmpty(getEmail())){
            return 0;
        }else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()){
            return 1;
        }else if(getPassword().length()<6){
            return 2;
        }else {
            return 3;
        }



    }
}
