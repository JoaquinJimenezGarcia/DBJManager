package me.jojigarcia.model;

import java.util.regex.Pattern;

/**
 * Created by joaquinjimenezgarcia on 29/5/17.
 */
public class Email {
    String uri;

    public Email(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public boolean validate(){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        if (pattern.matcher(uri).matches()){
            return true;
        } else {
            return false;
        }
    }
}
