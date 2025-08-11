public class Student01{
	int roll_no;
	String name;
	int marks;
	public Student01(int roll_no,String name,int marks){
	this.roll_no=roll_no;
	this.name = name;
	this.marks=marks;
	}
	public void Display(){
	System.out.print("Roll no: "+roll_no+" Name : "+name+" marks: "+marks);
	}
	public static void main(String args[]){
	Student01 s = new Student01(13,"Yashraj",20);
	s.Display();
	}

}