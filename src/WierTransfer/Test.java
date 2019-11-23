package WierTransfer;

public class Test {
	
	public static void main(String[] args) {	
	Sender s =new Sender();
	s.setName("ata");
	s.setPhoneNum(775198066);
	s.setIdNum(991204528);
	System.out.println(s.getName());
	
	Contry c=new Contry();
	c.setContryName("jordan");
	c.setId(66);
	
	City city1 =new City();
	city1.setName("Amman");
	city1.setId(12);
	city1.setContry(c);
	
	Address add=new Address();
	add.setCity(city1);
	
	Bank bank1=new Bank();
	bank1.setBankname("Bank Amman");
	bank1.setBankAcount("a1234");
	bank1.setBankCode(123);
	
	
	Resever resever1=new Resever();
	resever1.setBank(bank1);
	resever1.setName("ahmad");
	resever1.setIdNum(994657658);
	resever1.setPhoneNum(793456777);
	WireTransfer wireT =new WireTransfer();
	wireT.setPurpes("because styde");
	wireT.setOrginalIAmount(1000);
	//wireT.setFinalAmount(finalAmount);
	//wireT.setFeez(feez);
	wireT.setSender(s);
	
	System.out.println(wireT);
	
	Sender a1=new Sender();
	a1.setName("aaa");
	Sender a2=new Sender();
	a2.setName("aaa");
	System.out.println(a2.equals(a1));
			
	
	
	}
}
