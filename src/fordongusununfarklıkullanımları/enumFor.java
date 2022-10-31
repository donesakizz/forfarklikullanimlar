package fordongusununfarklıkullanımları;

public class enumFor
{
	enum Gun {Pazartesi,Salı,Çarşamba};
	enum Vakit { sabah,öglen,akşam};
	enum meyve { elma,armut,portakal,mandalina};
	
	

	public static void main(String[] args)
	{
		System.out.println("Her öğün aşağıdakilerden birini veya ikisini tercih edin :\n");
		for(Gun gun :Gun.values())
		{
			for(Vakit vakit : Vakit.values())
			{
				for(meyve meyve : meyve.values())
				{
					System.out.print(gun +"günü" + vakit + "bir dilim " + meyve +"    ");
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
