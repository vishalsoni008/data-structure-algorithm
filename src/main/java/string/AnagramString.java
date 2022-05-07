package string;

import java.util.Arrays;

public class AnagramString {
    static boolean checkAnagram(char arr[], char[] arr2){

        if(arr.length != arr2.length){
            return false;
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        for (int i = 0;i<arr.length;i++){
            if (arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] str = {'v','i','s','h','a','l'};
        char[] str2 = {'i','v','h','s','a','l'};

        if (checkAnagram(str,str2)){
            System.out.println("these are anagram ");
        }
        else {
            System.out.println("not anagram ");
        }
    }
}
