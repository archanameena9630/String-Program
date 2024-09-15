package string;

public class count_vowel {
    public static void main(String[] args) {
        String str=" hello java ";
        int count =0;
        int l=str.length();
        for(int i=0;i<=l-1;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||
            str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
            count ++;
        }
    }
    System.out.println(count);
    }
    }

