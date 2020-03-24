public class Course{
		private static String Coursename;
		private String Cousrecode;
		private String Programname;
		private String Semester;	
	Course(String p, String S,String Co, String C)
		{
		Coursename=Co;
		Cousrecode=C;
		Programname=p;
		Semester=S;
		}
		public String getCourseName()
		{
		return Coursename;
		}	
		public void setCcode(String z)
		{
		Cousrecode=z;
		}
		public String getCcode(){
				return Cousrecode;
			}
		
		public String toString(){
				return "\nCourse Name:\t" + Coursename + "\nCourse Code:\t" + Cousrecode+ "\nProgram Name:\t" + Programname
				+ "\nSemester: \t" + Semester;
			}
		}