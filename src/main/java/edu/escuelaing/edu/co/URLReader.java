package edu.escuelaing.edu.co;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
//ejercicio realizado en clase
public class URLReader {

    public static void main(String[] args) throws Exception {
        
        //URL google = new URL("http://www.google.com/");
        URL google = new URL(args[0]);
         try (BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))) {
             String filename = "resultado";
             PrintWriter outputFile = new PrintWriter("C:\\Users\\Acer\\Desktop\\escuela\\inter\\networkClient\\"+filename+".html");
             String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                 System.out.println(inputLine);
                 outputFile.println(inputLine);
            }
             reader.close();
             outputFile.close();

             } catch (IOException x) {
            System.err.println(x);
             }





    }
}
