package com.nativemodulesstructure;

import android.util.Log;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import com.facebook.react.bridge.Callback;

public class RNModule extends ReactContextBaseJavaModule {
    RNModule(ReactApplicationContext context) {
        super(context);
    }
    public String getName() {
        return "RNModule";
    }
    @ReactMethod
    public void nativeFunction(String name,  Callback succes, Callback error) {
        System.out.println(name);
        succes.invoke("De value in the native module is "+name);

    }
}