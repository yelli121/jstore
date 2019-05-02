package com.example.jstore_android_yelliyulfita;

import java.io.StringReader;
import java.lang.reflect.Method;
import java.util.Map;

public class RegisterRequest extends StringReader {
    private static final String regis_URL ="insert your new Customer API URL";
    private Map<String,String> params;
    public RegisterRequest(String name,String email,String password, Response.Listener<String> listener){
        super (Method.POST,Regis_URL,listener,null);
        params = new Hashmap<>();
        params.put("name",name);
        params.put("email",email);
        params.put("password",password);



    }
}
