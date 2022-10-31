package fordongusununfarklıkullanımları;

public class diziFor 
{
	static int [] dizi ;
	static int sayac = 0;
	

	public static void main(String[] args) 
	{
		int [] diz = {2,4,6,8};
		DiziyeAta(diz);
		String secilenRakam = "6"; // Secilen rakam:6
		String sonuc =KendinKontrolEt(secilenRakam); // secilen rakam dizinin elemani mi?
		System.out.println("Seçilen rakam :" +secilenRakam + "    Sonuç" + sonuc);

	}
	public static void DiziyeAta( int [] d)
	{
		dizi =d ;
	}
	
	public static String KendinKontrolEt( String st)
	{
		int GelenRakam = Integer.parseInt(st); //Stringi tam sayıya cevir
		String sonuc = "yanlış.Dizinin elemani degil! " ;
		for(int i :dizi) // Dizinin elemanlarini tarama
		{
			if(GelenRakam ==i) //Gelen rakam dizinin elemaniysa 
			{
				sonuc = "dogru. Dizinin elemanı!";
				sayac ++;
				break;
				
			}
		}
		return sonuc;
	}

}
