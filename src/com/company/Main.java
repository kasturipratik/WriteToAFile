package com.company;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //user input
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        //get the file from the location to write on it or create a file automatically
        File file = new File("store.txt");

        //this is the class to write to the file
        PrintWriter printWriter;

    //try and catch for file not found exception
try{

    //storing to the file previously called
     printWriter= new PrintWriter("store.txt");

   //printing to the files

        printWriter.println(input);

    //closing the file
     printWriter.close();

}catch(FileNotFoundException e1){
    e1.printStackTrace();
}


    }
}


