package oop;

public class Tasit {

	public String marka;
	public int model;

	
	
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public void tasitBilgiYazdir() {
		
		System.out.println("Tasitin Markasi : "+marka);
		System.out.println("Tasitin Modeli : "+model);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
