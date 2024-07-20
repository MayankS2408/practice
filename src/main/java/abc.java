
public class abc {

	
	public void getamount(int a) throws Paymentexception {
		if(a>1000) {
			throw new Paymentexception("This amount is big");
		}else {
			System.out.println("Order is placed");
		}
	}

	
	public static void main(String[] args) throws Paymentexception {
		
		abc a= new abc();
		a.getamount(99);
	}
}
