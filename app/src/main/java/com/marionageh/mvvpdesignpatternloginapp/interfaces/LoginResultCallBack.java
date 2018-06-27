package com.marionageh.mvvpdesignpatternloginapp.interfaces;

public interface LoginResultCallBack {
    void OnSuccess(String Message);
    void OnFailed(String Message);
}
