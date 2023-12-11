package datatypesExamples;

public class Example3 {
		public static void datatype1(){
			// boolean datatype
			boolean a = 30<22;
			System.out.println(a);
		}
		
		public static void datatype2() {
			//byte datatype
			byte b = 122;
			System.out.println(b);
		}
		
		public static void datatype3() {
			//short datatype
			short c = 19444;
			System.out.println(c);
		}
		
		public static void dataype4() {
			// integer datatype
			int d = 335657845;
			System.out.println(d);
			
		}
		
		public void datatype5() {
			//long datatype
			long e = 4424335346787l;
			System.out.println(e);
		}
		
		public void datatype6() {
			//float datatype
			float f = 5234.566f;
			System.out.println(f);
		}
		
		public void datatype7() {
			//double datatype
			double g = 54877.8748;
			System.out.println(g);
		}
		
		public void datatype8() {
			// char datatype
			char h = 'b';
			System.out.println(h);
		}
		
		public void datatype9() {
			//String datatype
			String i = " i am from pune ";
			System.out.println(i);
			
		}
		
	
		public static void main(String args[]) {
			Example3.datatype1();
			Example3.datatype2();
			Example3.datatype3();  // static method 
			Example3.dataype4();
			
			
			Example3 y = new Example3();
			y.datatype5();
			y.datatype6();
			y.datatype7();    // non static method 
			y.datatype8();
			y.datatype9();
			
		}
}