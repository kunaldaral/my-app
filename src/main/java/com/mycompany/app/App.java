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
        abc abc = new abc();
//        abc.setId(3);
//
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        abc.setId(Integer.parseInt(reader.readLine()));
        if(abc.getId() == 3){
            abc = null;
        }else{
            abc.setId(4);
        }
        try{
            System.out.println(abc.getId());
        }catch (Exception e){
            System.out.println("Null error");
        }



        // SECURITY BUG - Unsanitized User Input - Also resource not released
        //Enter data using BufferReader

        // Reading data using readLine
        String name = reader.readLine();
        // Printing the read line
        System.out.println(name);

        PrintWriter writer = new PrintWriter("testFile.txt", "UTF-8");
        writer.println(name);
//        writer.close();


        // ORGANIZATION OF CODE - same code repeated twice for different inputs
        // Product should suggest to create a function

        String A = "OldSite:GeeksforGeeks.org";
        String B = "NewSite:GeeksQuiz.com";

        int m = A.length();
        int n = B.length();

        char X[] = A.toCharArray();
        char Y[] = B.toCharArray();


        int LCStuff[][] = new int[m + 1][n + 1];
        int result = 0;  // To store length of the longest common substring

        // Following steps build LCSuff[m+1][n+1] in bottom up fashion
        for (int i = 0; i <= m; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                if (i == 0 || j == 0)
                    LCStuff[i][j] = 0;
                else if (X[i - 1] == Y[j - 1])
                {
                    LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
                    result = Integer.max(result, LCStuff[i][j]);
                }
                else
                    LCStuff[i][j] = 0;
            }
        }
        System.out.println( result );


        String C = "OldSite:GeeksforGeeks.org";
        String D = "NewSite:GeeksQuiz.com";

        int k = C.length();
        int l = D.length();

        char P[] = C.toCharArray();
        char Q[] = D.toCharArray();


        int LCStuff1[][] = new int[k + 1][l + 1];
        int result1 = 0;  // To store length of the longest common substring

        // Following steps build LCSuff[k+1][l+1] in bottom up fashion
        for (int i = 0; i <= k; i++)
        {
            for (int j = 0; j <= l; j++)
            {
                if (i == 0 || j == 0)
                    LCStuff1[i][j] = 0;
                else if (P[i - 1] == Q[j - 1])
                {
                    LCStuff1[i][j] = LCStuff1[i - 1][j - 1] + 1;
                    result1 = Integer.max(result1, LCStuff1[i][j]);
                }
                else
                    LCStuff1[i][j] = 0;
            }
        }
        System.out.println( result1 );





    }
}
