
import java.util.*;

public class LengthOfWord {

    public static void main(String args[]){

        String words_to_beEntered="";
         int indexx;
        Scanner dd=new Scanner(System.in);
        System.out.println("..Please Enter a word /phrases:");
        words_to_beEntered=dd.nextLine();
        System.out.println("..Please Insert character Index Number you want to check out:");
        indexx=dd.nextInt();
        if(indexx>words_to_beEntered.length()){
            System.out.println("The index is larger than a index: ");
        }else{
        System.out.println("The length of the entered word is: "+words_to_beEntered.length());
        System.out.println("The length of 0 to "+indexx+" is"+ words_to_beEntered.substring(0,indexx));

    }}
}
