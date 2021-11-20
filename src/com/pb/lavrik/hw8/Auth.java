package com.pb.lavrik.hw8;

import java.util.Objects;
import java.util.regex.Pattern;

public class Auth {

    String login, password;


    public static boolean signUpLogin(String text) throws WrongLoginException {

        if (text.equals("")) {
            throw new WrongLoginException("Login  не соответвует тербованиям");
        }
        if (Pattern.matches("[\\dA-Z,a-z]+", text) && text.length() < 21 && text.length() > 4) {
            return true;
        } else {
            throw new WrongLoginException("Login  не соответвует тербованиям");
        }
    }

    public static boolean signUpPassword(String text) throws WrongPasswordException {
        if (text.equals("")) {
            throw new WrongPasswordException(false);
        }
        if (Pattern.matches("[\u005f\\dA-Z,a-z]+", text) && text.length() > 4) {
            return true;
        } else {

            throw new WrongPasswordException(false);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auth auth = (Auth) o;
        return Objects.equals(password, auth.password);
    }


    public static boolean signIn(String textL, String textP, String text1L, String text1P) throws WrongLoginException {
        if (textL.equals(text1L) && textP.equals(text1P)) {

            return true;
        } else {
            throw new WrongLoginException("Вы ввели не верные данные регистрации");
        }
    }



    public Auth(String login, String password) {
        this.login = login;
        this.password = password;

    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
