package kardesler;


public class KardeslerKiymaliPide extends Yemek {
	public KardeslerKiymaliPide() {
		isim = "Kardeşler Kıymalı Pide";
		baharatlar.add("Tuz");
		baharatlar.add("Soğan");
		baharatlar.add("Karabiber");
		baharatlar.add("Pulbiber");
		baharatlar.add("İsot");
	}
 
	void cut() {
		System.out.println("Pizzanız dilimlendi");
	}
}