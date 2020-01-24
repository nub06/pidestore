package kardesler;



public class YemekTest {
	
public static void main(String[] args) {
	
	Context context=new Context();
	
	Ocakba�� piSalon = new PideOcakba��();
	Ocakba�� keSalon = new KebapOcakba��();

	Yemek yemek = keSalon.siparisYemek("adana");
	System.out.println("Ahmet sipari� verdi --> "   + yemek.getIs�m());
    context.setYontem(new KrediKarti());
    context.odemeYap();
    System.out.println("\n");    


	yemek = piSalon.siparisYemek("kasarli");
	System.out.println("Murat sipari� verdi --> " + yemek.getIs�m());
	 context.setYontem(new NakitOdeme());
    context.odemeYap();
    System.out.println("\n");
    
    
	yemek = keSalon.siparisYemek("urfa");
	System.out.println("Selim sipari� verdi --> " + yemek.getIs�m());
	 context.setYontem(new Sodexo());
    context.odemeYap();
    System.out.println("\n");
    
    
	yemek = piSalon.siparisYemek("kiymali");
	System.out.println("Ezgi sipari� verdi --> " + yemek.getIs�m());
	 context.setYontem(new KrediKarti());
    context.odemeYap();
    System.out.println("\n");

	yemek = keSalon.siparisYemek("beyti");
	System.out.println("Mustafa sipari� verdi --> " + yemek.getIs�m());
	 context.setYontem(new NakitOdeme());
    context.odemeYap();
    System.out.println("\n");

	yemek = piSalon.siparisYemek("ispanakli");
	System.out.println("Gizem sipari� verdi --> " + yemek.getIs�m());
	 context.setYontem(new KrediKarti());
    context.odemeYap();
    System.out.println("\n");

	yemek = piSalon.siparisYemek("dortmevsim");
	System.out.println("Melike sipari� verdi --> " + yemek.getIs�m());
	 context.setYontem(new KrediKarti());
    context.odemeYap();
    System.out.println("\n");
}
}