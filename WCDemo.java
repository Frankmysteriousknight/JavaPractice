class test
{
	public static void main(String args[])
	{
		/**
		 *The Primitive Datatype is a faster way to access the variable and set the value to the identifier
		 */
		int i=5; //Primitive Datatype
		/**
		 *Where as the Way we used below is an object in which we are assinging the value to the object of that, since the integer is a class in java which is a sub class of class Number and it has some basic rules to store a value to its object, The way in which we are giving the value is the wrapper class method, The object here is a reference variable.
		 * we have different wrapper classes for all the datatype.
		 */
		Integer io=new Integer(21); //Wrapper Class
		System.out.println(i);
		System.out.println(io);
		Integer iv=new Integer(i); //Boxing-Wrapping
		/**
		 * This method is known as Boxing as we are trying to store the value of a primitive data type to the object.
		 */
		int j=iv.intValue(); //Return the value of iv and keeps in j
		/**
		 * This statement above is known as unboxing or unwrapping.
		 */
		Integer value=i;//Instead of new Integer(),it will directly assign the value to the value variable, This is known as autoboxing.
		int k=value;//autonboxing or auto-unwrapping.
		//Collection API's and other framework demand us to work on the wrapper classes and not on the normal primitive datatype.
		System.out.println(k+" "+j+" "+value);
		
	
	}

}
