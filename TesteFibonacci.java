public class TesteFibonacci {
	public static void main(String[] args){
		int num=4;
		System.out.println("C�lculo de fibonacci para "+num);
		System.out.println(fibonacci(num));
	}
	
	public static int fibonacci(int num) {
		if (num==0) {
			return 0;
		}
		if (num==1) {
			return 1;
		}
		return fibonacci(num-1)+fibonacci(num-2);
	
	}


}