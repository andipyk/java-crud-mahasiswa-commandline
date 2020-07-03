package day_11_pr;
import day_11_pr.menu.Menu;

import java.io.FileNotFoundException;

public class Main {
    static MyMethod my_method = new MyMethod();
    static Menu menu = new Menu();

    public static void main(String[] args) throws FileNotFoundException {

//        *********PRODUCTION MODE*************
//            boolean login_success = my_method.login();
//
//            if (login_success) {
//                System.out.println("Masuk Sistem");
//
//            }
//
//        System.out.println("Terimakasih");


        String pilihan_menu = menu.pilihan_menu();
        System.out.println(pilihan_menu);

    }
}
