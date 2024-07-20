package Dropdown;

public class string {

	public static void main(String[] args) {

        String m="MAYANK";

        int count=0;
		 for(int i=0;i<m.length();i++) {
			 char c=m.charAt(i);
			 
			if(c=='a'||c=='e'|| c=='i'|| c=='o'||c=='u') {
				System.out.println(c);
			count++;
			}
		 }
		 
		 System.out.println(count);

	}

}
