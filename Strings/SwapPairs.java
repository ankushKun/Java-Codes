import java.util.*;
public class SwapPairs{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String inp = sc.nextLine();
    System.out.println(swap(inp));
  }

  public static String swap(String s){
    int len = s.length();
    boolean lastLeft = false;
    if(s.length()%3==0){
      len-=2;
      lastLeft=true;
    }else{
      len-=1;
    }
    String swapped="";
    for(int i=0;i<len;i+=2){
      swapped+=s.charAt(i+1)+s.charAt(i);
    }
    if(lastLeft){
      swapped+=s.charAt(s.length()-1);
    }
    return swapped;

  }
}
