package ex45;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nyles Symonette
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] arg) throws IOException{

        // pass the path to the fil as parameter

        File file = new
                File("C:\\User\\Ankit\\Desktop\\example45.txt");
        Scanner sc = new Scanner(file);


        //create another scanner object tp prompt input from user

        Scanner s = new Scanner(System.in);

        //prompt the name of output file from user

        System.out.print("\nEnter the name of the Output File: ");
        String outputfile = s.next();

        // create a filewriter object to write into a file
        // male sure that path of file should be correct

        FileWriter writer = new
                FileWriter("C:\\Users\\Ankit\\Desktop\\"+outputfile);

        // try and finally block to handle excpetion

        try
        {
            // using while loop read file

            while(sc.hasNext())
            {

                //read whole line

                String user = sc.nextLine();

                // relpace utilize by use

                user = user.replaceAll("utilize", "use");

                // and write int outputfile

                writer.write(user);

                writer.write("\n");
            }
        }
        finally
        {
            sc.close();
        }

        // and close the writer file

        writer.close();

        System.out.println("\nSuccessfully Modified");

    }
}
