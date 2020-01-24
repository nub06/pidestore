package kardesler;



public class KardeslerDortMevsimPide extends Yemek {
	
	public KardeslerDortMevsimPide() {
		isim = "Kardeþler Dört Mevsim Pide";
		baharatlar.add("Tuz");
		baharatlar.add("Limon");
		baharatlar.add("Karabiber");
		baharatlar.add("Pulbiber");
		
		
	}
 
	void cut() {
		System.out.println("Pideniz dilimlendi");
	}
}