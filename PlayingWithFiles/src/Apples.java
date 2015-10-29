import java.util.*;


public class Apples {
    public static void main(String[] args){

        final Formatter x;  //outputs Strings into a file , formatter variables , printing to the file

        try{
            x = new Formatter("fred.txt"); //if you dont have this file he creates it for you
            System.out.println("you created a file");
        }
        catch(Exception e){
            System.out.println("you got an error");
        }


    }

}
