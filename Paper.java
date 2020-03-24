public class Paper
	{
			private String PaperTitle;
			private String Paperid;
			private String ExamType;
			private String Invigilator;
			private String Location;
			private boolean isCollected;
			private int Numberostu;
			private String Date;
			private String Time;			
	Paper(String PaperTitle,String Paperid,String ExamType,String Invigilator,
		String Location,boolean isCollected,int Numberostu,String Date, String Time){
				this.PaperTitle=PaperTitle;
				this.Paperid=Paperid;
				this.ExamType=ExamType;
				this.Invigilator=Invigilator;
				this.Location=Location;
				this.isCollected=isCollected;
				this.Numberostu=Numberostu;
				this.Date=Date;
				this.Time=Time;
			}
			public String getPaperT(){
					return PaperTitle;
				}
			public String getPaperID(){
					return Paperid;
				}
			public String getEType(){
					return ExamType;
				}
			public String getInvi(){
					return Invigilator;
				}
			public String getLoc(){
					return Location;
				}
			public void setIsCollected(boolean x){
					isCollected=x;
				}
			public boolean getIsCollected(){
					return isCollected;
				}
			public int getNoS(){
					return Numberostu;
				}
			public String getDa(){
					return Date;
				}
			public String getTime(){
					return Time;
				}
			public String toString(){
					return "Paper Titel:\t"+ PaperTitle
					+ "\nPaper ID:\t"+ Paperid + "\nExam Type:\t" + ExamType + "\nInvigilator:\t" + Invigilator 
					+ "\nPaper Location:\t" +Location + "\nPaper Collected:\t" + isCollected+ "\nNumber of Students:\t" + Numberostu
					+ "\nDate of Paper:\t" + Date + "\nTime of Paper:\t" + Time;
					 
				}
				
		 	
	}
