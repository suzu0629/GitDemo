package JavaBrush;
import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		int[] arr2 = {1,2,3,4,5,6,7,8,9};
//		
//		for (int i= 0; i < arr2.length;i++ ) {
//			if (arr2[i] % 2 == 0) {
//				System.out.println(arr2[i]);
//				break;
//			}else {
//				System.out.println(arr2[i] + " is not mul of 2");
//			}
//		}
		
		
		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("0");
		a.add("b");
		a.add("c");
		a.add("e");
		System.out.println(a.get(1));
		
		for(int i =0;i<a.size();i++) {
			System.out.println(a.get(1));	
		}	
		System.out.println("******");
		for (String val :a) {
			System.out.println(val);
		}
		
		System.out.println(a.contains("0"));
	}

}
