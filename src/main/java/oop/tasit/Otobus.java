package oop.tasit;

public class Otobus extends Tasit {

	private int yolcuKapasitesi;

	public int getYolcuKapasitesi() {
		return yolcuKapasitesi;
	}

	public void setYolcuKapasitesi(int yolcuKapasitesi) {
		this.yolcuKapasitesi = yolcuKapasitesi;
	}
	
	public void otobusBilgiYaz() {
		
		System.out.println("------------------------------Otobus-----------------------");
		System.out.println("Otobusun Yolcu Kapasitesi : "+yolcuKapasitesi);
	}

	@Override
	public void setModel(int model) {
		// TODO Auto-generated method stub
		super.setModel(model);
	}

	@Override
	public void setMarka(String marka) {
		// TODO Auto-generated method stub
		super.setMarka(marka);
	}

	@Override
	public void tasitBilgiYazdir() {
		System.out.println("Otobusun Markasi : "+marka);
		System.out.println("Otobusun Modeli : "+model);
		// TODO Auto-generated method stub
		//super.tasitBilgiYazdir();
	}

	 
 
	
	
	
	
}
