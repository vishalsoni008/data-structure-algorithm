package array.strings;

public class Vowels {
    public static void main(String[] args) {
        String str = "My VISHAL";
        str = str.toLowerCase();

        char[] strArr = str.toCharArray();

        char[] vowels = new char[]{'a','e','i','o','u'};
        int vowelsCounter =0;

        for (int i = 0;i< strArr.length;i++){
            for (int j=0;j< vowels.length;j++){
                if (strArr[i] == vowels[j]){
                    System.out.println("vowels present "+strArr[i]);
                    vowelsCounter++;
                }
            }
        }
        System.out.println("total vowels is "+vowelsCounter);
    }
}
