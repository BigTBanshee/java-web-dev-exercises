package exercises.lsn1datatypes;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        //sentence.toLowerCase();


        Scanner input = new Scanner(System.in);
        System.out.println("Enter term to search:");

        String word = input.nextLine().toLowerCase();
        Integer index = sentence.indexOf(word);
        Integer length = word.length();

        //System.out.println(sentence);
        //System.out.println(name);
        //System.out.println(sentence.toLowerCase().contains(name));

        String modifiedSentence = sentence.replace(word, "");


        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        System.out.println(modifiedSentence);
    }
}