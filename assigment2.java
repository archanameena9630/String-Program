package string;
class assigment2 {
    public static void main(String[] args) {
String s1="this is exercise 1";
String s2="this is exercise 2";
int count =0;
 if(s1.length()==s2.length()){
 for(int i=0;i<s1.length();i++){
    if (s1.charAt(i)==s2.charAt(i)){
        count ++;
    }
}
 }
     if(count ==s1.length()){
        System.out.println("true ");
    }
    else {
        System.out.println("  not is equal ");
    }
    }
}













        // String s1="This is Exercise1";
        // String s2="This is Exercise2";
        // int l=s1.compareTo(s2);
        // System.out.println(l);
        // if(l<0){
        //     System.out.println("\"" + s1 +"\" is less then \""+ s2 +"\"");
        // }
        // else if (l>0){
        //     System.out.println("\""+ s1+"\" is greter then \"" + s2 +"\"");
        // }
        // else{
        //      System.out.println("\""+s1 +"\" is equal \""+s2+"\"");
        // }
        
    
