package com.pb.lavrik.hw8;

import java.util.Scanner;

import static com.pb.lavrik.hw8.Auth.signIn;

public class OnlineShop {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException{

        String Ologin = "", Opassword = "", OconfirmPassword;
        boolean ok = true;

        Scanner in = new Scanner(System.in);


        while (ok = true) {
            try {
                System.out.printf("Введите Login, длинна должна быть от 5 до 20 символов. Login должен содержать только латинские буквы и цифры. - ");

                Ologin = in.nextLine();
                ok = Auth.signUpLogin(Ologin);
                break;
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Ура");

        ok = true;
        while (ok = true) {
            try {
                System.out.print("Введите password, длинна должна быть от 5 символов и более, только латинские буквы и цифры и знак подчеркивания. - ");
                Opassword = in.nextLine();
                ok = Auth.signUpPassword(Opassword);
                break;
            } catch (WrongPasswordException e) {
                System.out.println("password  не соответвует тербованиям - " + e.getAmount());
            }

        }
        System.out.println("Ура-Ура");

        ok = false;

        while (ok == false) {

            System.out.printf("Введите password повторно - ");
            OconfirmPassword = in.nextLine();

            if ((Opassword.equals(OconfirmPassword)) == true) {
                ok = true;
            } else {
                System.out.println("Повторный password не соовпадает с первоначальным. Нужно повторить ввод");
            }


        }

        System.out.println("Ура-Ура-Ура");
        Auth user = new Auth(Ologin, Opassword);

        System.out.println("Логин - " + user.getLogin() + " и Пароль - " + user.getPassword());

        System.out.println("Вы успешно зарегистрировались на сайте");
        System.out.println();



        while (ok = true) {
            try {

                System.out.println("Вход на сайт");
                System.out.printf("Введите логин - ");
                Ologin = in.nextLine();
                System.out.printf("Введите пароль - ");
                Opassword = in.nextLine();
                ok=signIn(Ologin,Opassword,user.login,user.password);


                break;
            } catch (WrongLoginException e) {
                System.out.println("Данные регистрации не соответвуют тербованиям - " + e.getMessage());
            }

        }

    }


}
