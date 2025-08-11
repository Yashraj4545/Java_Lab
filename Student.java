public class Student{
	int roll_no;
	String name;
	int phone_no;
	//int prn_no;
	int marks;


	public Student(){
	int roll_no = 13;
	name = "Yashraj";
	phone_no = 99;
	//prn_no = 0124UITM1013;
	marks = 20;
	System.out.println("roll no: "+roll_no+" name: "+name+" phone_no: "+phone_no+" marks: "+marks);
	}
	
	public Student(int roll_no){
	roll_no=roll_no;
	System.out.println("roll no: "+roll_no);
	}
	public Student(int roll_no,String name){
	roll_no=roll_no;
	name=name;
	System.out.println("roll no: "+roll_no+" name : "+name);
	}
	public Student(int roll_no,String name,int phone_no){
	roll_no=roll_no;
	name=name;
	phone_no=phone_no;
	System.out.println("roll no: "+roll_no+" name : "+name+" phone_no: "+phone_no);
	}
	public static void main(String args[]){
	Student s1 = new Student();
	Student s2 = new Student(14);
	Student s3 = new Student(22,"Gaurav");
	Student s4 = new Student(7,"Krishnraj",98);
	}
}