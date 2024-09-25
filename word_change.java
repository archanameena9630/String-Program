package string;

public class assigment8 {
 public static void main(String[] args) {
    String str="The quick brown fox jumps over the lazy dog";
   String []repstr=str.split("\s+");
   for(int i=0;i<repstr.length;i++){
    if(repstr[i].equalsIgnoreCase("dog")){
        repstr[i]="fog";
    }
}
      String newstr=" ";
      for(int i=0;i<repstr.length;i++){
       newstr=newstr+repstr[i]+" ";
      }
      System.out.println("orijnal String: "+str);
      System.out.println("new String: "+newstr);
   
}
    
 }   

