package Turma15;

public class Ex1RepeticaoJava {
	public static void main(String[] args) {
		int x, num;
		
		for(x = 1000; x <= 1999; x++) {
			if(x % 11 == 5) {
				System.out.println(x);
			}
		}
	}

}
