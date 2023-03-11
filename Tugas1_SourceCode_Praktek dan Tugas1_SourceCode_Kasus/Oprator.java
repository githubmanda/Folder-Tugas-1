//NIM		:13020210008
//NAMA	:RIKA RAMANDA
//HARI/TGL	:SENIN,06 MARET 2023

/* Contoh pengoperasian variabel bertype dasar */
public class Oprator {
	public static void main(String[] args) {
		boolean Bool1, Bool2, TF ; 
		int i,j, hsl ;
		float x,y,res; 

	System.out.println("operasi Logika");
		Bool1 = true; Bool2 = false;
		TF = Bool1 && Bool2 ; 
		System.out.println("TF = " + TF);	
		TF = Bool1 || Bool2 ; 
		System.out.println("TF = " + TF);
		TF = ! Bool1 ; 
		System.out.println("TF = " + TF);
		TF = Bool1 ^Bool2; 
		System.out.println("TF = " + TF);

 	System.out.println("operasi Numerik");
 		i = 5; j = 2 ;
		hsl = i+j; 
		System.out.println("hsl =" + hsl);
		hsl = i - j; 
		System.out.println("hsl =" + hsl);
		hsl = i / j; 
		System.out.println("hsl =" + hsl);
		hsl = i * j; 
		System.out.println("hsl = " + hsl);
		hsl = i /j ; /* pembagian bulat */
		System.out.println("hsl = " + hsl);
		hsl = i%j ; /* sisa modulo */
		System.out.println("hsl = " + hsl);

	
		x = 5 ; y = 5 ;
		res = x + y;
		System.out.println("res = " + res); 
		res = x - y; 
		System.out.println("res = " + res); 
		res = x / y; 
		System.out.println("res = " + res); 
		res = x * y;
		System.out.println("res = " + res); 

	System.out.println("operasi relasional numerik atau permandingan");
 		TF=(i==j); 
		System.out.println("TF="+TF);
 		TF=(i!=j);
		System.out.println("TF="+TF);
		TF=(i < j); 
		System.out.println("TF="+TF);
		TF=(i > j); 
		System.out.println("TF="+TF);
		TF=(i <= j);
		System.out.println("TF="+TF); 
		TF=(i >= j);
		System.out.println("TF="+TF);

	
		TF=(x != y);
		System.out.println("TF="+TF);
		TF=(x < y); 
		System.out.println("TF="+TF);
		TF=(x > y); 
		System.out.println("TF="+TF);
		TF=(x <= y); 
		System.out.println("TF="+TF);
		TF=(x >= y);
		System.out.println("TF="+TF);
}
}