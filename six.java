abstract class Writer{
	public  abstract static void write();
}
class Author extends Writer{
	public void write(){
		System.out.println("Writing Book");
	}

}
class Programmer extends Writer{
	public static void write()
	{
		System.out.println("Writing Code");
	}

}
class demo{
	public static void main(String [] args){
		Writer w=new Author();
		w.write();
	}

}
