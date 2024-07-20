package Dropdown;

public class lastwordlength {

	public static void main(String[] args) {

		String s = " My Name is Mank";
		s=s.trim();
		System.out.println(s);
		int count=0;
		for ( int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==' ') {
				break;
			} else {
				count++;
			}
		}
		System.out.println(count);

	}

}
