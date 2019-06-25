package com.mycompany.app;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );

        // NULL POINTER ERROR
        abc abc = null;
//        abc.setId(3);
//        abc.setName("abc");
        abc.getId();


        // SECURITY BUG - Unsanitized User Input
        //Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Reading data using readLine
        String name = reader.readLine();
        // Printing the read line
        System.out.println(name);

        PrintWriter writer = new PrintWriter("testFile.txt", "UTF-8");
        writer.println(name);
//        writer.close();

    }
}
