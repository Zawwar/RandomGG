/**
 * Created by Angus Clinch
 * Jakarta Intercultural School
 * Farm Game
 *

 */

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument.Iterator;
import java.io.*;

public class StudentGroupsMain {
    public static void main(String[] args) throws FileNotFoundException {
        Group[] groups= new Group[0];
        int allPeople = 0;
        int numberGroup = 0;
        int groupSize = 3;
        Person[] people;

        String f, l;
        int c, g;

                //ArrayList<Student> stuList = new ArrayList<Student>();



        Person[] students = new Person[groupSize];


                File inFile = new File ( "src/Dummy data.txt" );
                int pos = 0;
                Scanner sc = new Scanner(inFile);

                while (sc.hasNextLine())
                {


                    String line = sc.nextLine();

                    c = line.indexOf(',');


                    String  Name = line.substring(0, c);
                    System.out.println(Name);



                   line = line.substring(c+1);
                    Boolean MF = Boolean.parseBoolean(line.substring(0, c));
                    System.out.println(MF);

                    Boolean NJ = Boolean.parseBoolean(line.substring(0, c));
                    System.out.println(NJ);
                    line = line.substring(c+1);
                    String dep = line.substring(0,c);
                    System.out.print(dep);
                    line = line.substring(c+1);
                    String div = line.substring(0, c);



                    //l = lastname, f = firstname, c = student number



                  students[1] = new Person(Name, MF,NJ,dep, div);
                    pos+=1;






                    /** System.out.println("How many people?");

                     System.out.println("How many groups?");



                     for (int i = allPeople; i > 0; i++) {
                     int rem = i - (int)((double)allPeople / (double)groupSize);
                     }**/


                }
}}
