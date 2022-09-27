package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String wuw;
        String readt = "";
        System.out.print("накликайте путь к файлу: ");
        String path = in.nextLine();

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        if ((wuw = br.readLine()) != null) {
            readt += wuw;
        }
        String s = "всего символов в тексте " + readt.length();
        String p = "всего символов в тексте без пробелов " + readt.replaceAll(" ", "").length();
        String w = "всего слов в тексте " + readt.split(" ").length;
        System.out.println(s + "\n" + p + "\n" + w + "\n");
        FileWriter fileWriter = new FileWriter("pup2.txt");
        fileWriter.write(s + "\n");
        fileWriter.write(p + "\n");
        fileWriter.write(w + "\n");
        fileWriter.flush();
    }
}
