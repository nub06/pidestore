package kardesler;



public class YemekTest {
	
public static void main(String[] args) {
	
	Context context=new Context();
	
	Ocakbaþý piSalon = new PideOcakbaþý();
	Ocakbaþý keSalon = new KebapOcakbaþý();

	Yemek yemek = keSalon.siparisYemek("adana");
	System.out.println("Ahmet sipariþ verdi --> "   + yemek.getIsým());
    context.setYontem(new KrediKarti());
    context.odemeYap();
    System.out.println("\n");    


	yemek = piSalon.siparisYemek("kasarli");
	System.out.println("Murat sipariþ verdi --> " + yemek.getIsým());
	 context.setYontem(new NakitOdeme());
    context.odemeYap();
    System.out.println("\n");
    
    
	yemek = keSalon.siparisYemek("urfa");
	System.out.println("Selim sipariþ verdi --> " + yemek.getIsým());
	 context.setYontem(new Sodexo());
    context.odemeYap();
    System.out.println("\n");
    
    
	yemek = piSalon.siparisYemek("kiymali");
	System.out.println("Ezgi sipariþ verdi --> " + yemek.getIsým());
	 context.setYontem(new KrediKarti());
    context.odemeYap();
    System.out.println("\n");

	yemek = keSalon.siparisYemek("beyti");
	System.out.println("Mustafa sipariþ verdi --> " + yemek.getIsým());
	 context.setYontem(new NakitOdeme());
    context.odemeYap();
    System.out.println("\n");

	yemek = piSalon.siparisYemek("ispanakli");
	System.out.println("Gizem sipariþ verdi --> " + yemek.getIsým());
	 context.setYontem(new KrediKarti());
    context.odemeYap();
    System.out.println("\n");

	yemek = piSalon.siparisYemek("dortmevsim");
	System.out.println("Melike sipariþ verdi --> " + yemek.getIsým());
	 context.setYontem(new KrediKarti());
    context.odemeYap();
    System.out.println("\n");
}
}