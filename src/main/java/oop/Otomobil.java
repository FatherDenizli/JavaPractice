package oop;

public class Otomobil extends Tasit {

	private int maxHiz;
	private int yolcuSayisi;
	
	
	public int getMaxHiz() {
		return maxHiz;
	}
	public void setMaxHiz(int maxHiz) {
		this.maxHiz = maxHiz;
	}
	public int getYolcuSayisi() {
		return yolcuSayisi;
	}
	public void setYolcuSayisi(int yolcuSayisi) {
		this.yolcuSayisi = yolcuSayisi;
	}
	
	public void otomobilBilgiYaz() {
		System.out.println("------------------------------Otomobil-----------------------");
		System.out.println("Otomobilin max hizi : " +maxHiz);
		System.out.println("Yolcu Sayisi : " +yolcuSayisi);
		
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
		System.out.println("Otomobilin Markasi : "+ marka); 
		System.out.println("Otomobilin Modeli : "+model);
		//super.tasitBilgiYazdir();
	}
	
	
	
	
	
	
	
	
	
	
}
