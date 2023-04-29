package oop.tasit;

public class TasitTest {
 
    //private String marka;//Tasit
    // private int model;//Tasit
	
	//private int maxHiz;//Otomobil
   // private int yolcuSayisi;//Otomobil
	
	//private int yolcuKapasitesi;// Otobus

	
	public static void main(String[] args) {
	 
		Otomobil myOtomobil=new Otomobil();
		myOtomobil.setMarka("Ford");
		myOtomobil.setModel(2012);
		 myOtomobil.setMaxHiz(200);
		 myOtomobil.setYolcuSayisi(5 );
		
		Otobus myOtobus=new Otobus();
		
		myOtobus.setMarka("Mercedes");
		myOtobus.setModel(2010);
		myOtobus.setYolcuKapasitesi(55);
		
		myOtomobil.otomobilBilgiYaz();
		myOtomobil.tasitBilgiYazdir();
		
		myOtobus.otobusBilgiYaz();
		myOtobus.tasitBilgiYazdir();
		
		
		
		
		
	}

}
