import java.util.*;
class Student
{
	int regNum,sub1,sub2,sub3;
	String Name;
	Student(int rn,String nm,int s1,int s2,int s3)
	{
		this.regNum=rn;
		this.sub1=s1;
		this.sub2=s2;
		this.sub3=s3;
		this.Name=nm;
	}
	void show()
	{
		System.out.println("The Student with"+regNum+" Name:-"+Name+" Has Marks as follows in 3 subjects"+sub1+","+sub2+","+sub3);
	}
	void avgMarks()
	{
		double avg;
		avg=(double)((sub1+sub2+sub3)/3);
		System.out.println("Average is"+avg);
	}

}
class Demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int rnum=sc.nextInt();
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		String nm=sc.next();
		Student st=new Student(rnum,nm,s1,s2,s3);
		st.show();
		st.avgMarks();
		sc.close();
	}

}
