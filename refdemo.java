class Reference {
	private int number;
	private String text;

	Reference(String text,int number) {
		this.text=text;
		this.number=number;
	}

	public String getText() {
		return text;
	}
	public int getNumber() {
	
		return number;
	}

}
public class refdemo{
	public static void main(String [] args){
		Reference ref1,ref2;
		final Reference ref3;
		ref1=new Reference("This is the first reference variable",1);
		int number=ref1.getNumber();
		System.out.println("Number="+number);
		ref2=new Reference("This is the second reference variable",2);
		//Reference.printText(ref2);
		ref3=new Reference("This is the third reference variable",3);
		ref3=new Reference("This is also the third reference variable",4);
	}
	public static void printText(Reference reference){
		String text=reference.getText();
		System.out.println(text);
	}

}

