package day_11_pr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMethod {
    Scanner scnr = new Scanner(System.in);

    /**
     * Sebagai scan dari string input user
     * @param str merupakan inputan user
     * @return
     */
    public String input(String str) {
        System.out.print("input " + str + ": ");
        return scnr.next();
    }



}