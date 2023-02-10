
public class Leap {

	public static void main(String[] args) {
		int a =2020;
		if(a%4==0 && a%100!=0) {
			System.out.println(a+"This year is leap Year");
		}
		else {
			System.out.println(a+"This is not leap Year");
		}
	}

}
