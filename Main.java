public class Main
	{
		public static void main(String[] args){
			Paper ob1=new Paper ("Islamyat","CS113","Mid Term","Sir Saqib","KUST ", false,50,"june/16/2020","10:00");
			Paper ob2=new Paper ("Java","CS113","Mid Term","Sir Ali Zeb","KUST ", false,50,"March/18/2020","12:00");

			Course C=new Course("JAVA", "XYZ", "BS CS", "Fall 2019 2nd Semester");
			Course C1=new Course("English", "Eng202", "BS CS", "Fall 2019 2nd Semester");
			System.out.println(C);
			System.out.println(ob1);
			System.out.println("........................................");
			System.out.println(C1);
			System.out.println(ob2);
		}
	}