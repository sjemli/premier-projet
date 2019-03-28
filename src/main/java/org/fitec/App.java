package org.fitec;
import org.apache.commons.lang.RandomStringUtils;

import java.util.ResourceBundle;

/**10
 * Hello world!
 *
 */
public class App
{
    public int addition(int a, int b){
        return a + b;
    }


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String studentsNumber = ResourceBundle.getBundle("param").getString("students.number");
        System.out.println( "Student Number = " + studentsNumber );

        String random = RandomStringUtils.randomNumeric(10);
        System.out.println("Chaine = " + random);
    }


}
