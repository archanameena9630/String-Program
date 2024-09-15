package string;

class string{
 public static void main(String[] args) {
   String str="this is a string";
   int l=str.length();
   for(int i=l-1;i>=0;i--){
    System.out.print(str.charAt(i)); 
   }
   System.out.println();
   System.out.println(l);
}
}

