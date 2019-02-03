import java.util.Date;
class CheckGC {
	public static void main(String [] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory : " + rt.totalMemory());
		System.out.println("Free Memory : " + rt.freeMemory());

		Date d=null;
		for(int i=0;i<10000;i++) {
			d = new Date();
			d = null;
		}
		System.out.println("After Used memory : " + rt.freeMemory());
		for(int i=0;i<3;i++) {
		rt.gc(); //System.gc
		System.out.println("After Free of Memory : " + rt.freeMemory());
		}
	}

}
