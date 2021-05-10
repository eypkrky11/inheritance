package inheritance;

public class Main {
	// inheritance miras
	public static void main(String[] args) {

		IndividualCustomer eyup = new IndividualCustomer();
		 eyup.customerNumber="12345 ";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910 ";
		
		
		SendikaCustomer abc =new SendikaCustomer();
		abc.customerNumber = "99999 ";

		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {eyup,hepsiBurada,abc};
		
		customerManager.addMultiple(customers);
		
		
		
		//customerManager.add(hepsiBurada);
		//customerManager.add(eyup);
		//customerManager.add(abc);
		
		
	}

}
