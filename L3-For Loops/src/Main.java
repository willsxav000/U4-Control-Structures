public class Main{
    public static void main(String[] args) {
        String word = "Programming";

        for(int i = 0; i < word.length(); i+=2){
            System.out.print(word.charAt(i));
        }

        System.out.println();
    }
}
