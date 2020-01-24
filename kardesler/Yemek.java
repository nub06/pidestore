package kardesler;

import java.util.ArrayList;

public  abstract class Yemek {
	
    String isim;	
	
	ArrayList<String> baharatlar = new ArrayList<String>();

	void hazirla() {
		System.out.println("Hazirlaniyor...");
		System.out.println("" + isim);
		System.out.println("Ekleniyor: ");
		for (String baharat : baharatlar) {
			System.out.println("-" + baharat);
		}
	}
 
	void pisir() {
		System.out.println("Odun ate�inde 15 dakika sonra pi�ecek");
	}
	
	
	public String getIs�m() {
		return isim;
	}
}
	