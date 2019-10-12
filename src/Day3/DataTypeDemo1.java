package Day3;

public class DataTypeDemo1 {

	public static void main(String[] args) {
		byte b1 = 127;// max range
		byte b2 = -128;// min range
		
		short s1= 32767;//max range
		short s2 = -32768;//min range
		
		int i1 = 2147483647;//Max range
		int i2 = -2147483647;//min range
		
		
		
		System.out.println("Max range is: "+Short.MAX_VALUE);
		System.out.println("Max range is:"+Short.MIN_VALUE);
		System.out.println("size in but:"+Short.SIZE);
		System.out.println("size in byte is:"+Short.BYTES);
		
		System.out.println("Max range is: "+Integer.MAX_VALUE);
		System.out.println("Max range is: "+Integer.MIN_VALUE);
		System.out.println("size in but:"+Integer.SIZE);
		System.out.println("size in byte is:"+Integer.BYTES);
	}

}
