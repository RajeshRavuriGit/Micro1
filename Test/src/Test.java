import java.util.LinkedHashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String s="aabbcc";
	   int cnt=0;
	   for(int i=0;i<s.length();i++) {
		   for(int j=0;j<s.length();j++) {
			   if(s.charAt(i)==s.charAt(j)) {
			   cnt++;
			   }
		   }
		   System.out.println(s.charAt(i)+"--"+cnt);
		   String d=String.valueOf(s.charAt(i)).trim();
		   s=s.replaceAll(d, "");
		   cnt=0;
	   }
	  
	}	
}