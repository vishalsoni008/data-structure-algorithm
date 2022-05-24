package string;

public class Vowels {
    public static void main(String[] args) {
        String str = "My Vishal";
        str = str.toLowerCase();

        char[] strChar = str.toCharArray();

        for (int i=0;i<strChar.length;i++){
            if (strChar[i] == 'a' || strChar[i] == 'e' ||strChar[i] == 'i' ||strChar[i] == 'o' ||strChar[i] == 'u'){
                System.out.println("that is a vowel "+strChar[i]);
            }
        }
    }
}
