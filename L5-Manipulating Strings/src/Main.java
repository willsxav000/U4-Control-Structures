import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = read.nextLine();
        int count = 0;

        for(int i =0; i < word.length(); i++){
            if(word.contains("code")){
                count++;
                word = word.substring(word.indexOf("code")+ 3);
            }
        }
    }
}