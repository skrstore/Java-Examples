class DataTypes {
	public static void main(String[] args) {
		// # 1. Primitive data types

		// ## 1.1 Integers Data types
		byte a = 127;
		short b = 32767;
		int c = 2147483647;
		int cc = 12_121__453;
		long d = 1234567891121212L;

		// ## 1.2 Floating point Data types
		float e = 12120.3224f;
		double f = 121_123.4512__126d;

		// ## 1.3 Character Data Type
		char g = 61510, h = 'G';

		// ## 1.4 Boolean Data type
		boolean i = true;
		System.out.print(a + " " + b + " " + c + " " + cc);
		System.out.print(d + " " + e + " " + f + " " + g + " " + h + " " + i);

		// Casting
		byte byteValue = 20;
		int intValue = 888;
		long longValue = 23355;

		float floatValue = 8834.8f;
		// float floatValue2 = (float)99.3;
		double doubleValue = 32.4;

		System.out.println(Byte.MAX_VALUE);

		intValue = (int) longValue;

		System.out.println(intValue);

		doubleValue = intValue;
		System.out.println(doubleValue);

		intValue = (int) floatValue;
		System.out.println(intValue);

		// The following won't work as we expect it to!!
		// 128 is too big for a byte.
		byteValue = (byte) 12;
		System.out.println(byteValue);
	}
}
