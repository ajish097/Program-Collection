import java.util.*;

public class Mutithreading {
	public static void main(String[] args) {
		rand a1 = new rand();
		a1.start();
		Square a2 = new Square();
		a2.start();
		Cube a3 = new Cube();
		a3.start();
		
	}

}

class rand extends Thread {
	static int num;
	int result;
	public static int generate() {
		Random a = new Random();
		num = a.nextInt(100);
		return(num);
	}
	
	public void run() {
		while(true) {
			try {
				result = generate();
				System.out.print(result+ " ");
				Thread.sleep(1000);
				
			}
			catch (Exception e) {
				System.out.print(e);
			}
		}
	}
}

class Square extends Thread {
	int square(int a) {
		return a*a;
	}
	
	void display(int a) {
		System.out.print(a+ " ");
	}
	
	public void run() {
		while(true) {
			try {
				display(square(rand.num));
				Thread.sleep(1000);
				
			}
			catch (Exception e) {
				System.out.print(e);
			}
		}
	}
}

class Cube extends Thread {
	int cube(int a) {
		return a*a*a;
	}
	
	void display(int a) {
		System.out.print(a + "\n");
	}
	
	public void run() {
		while(true) {
			try {
				display(cube(rand.num));
				Thread.sleep(1000);
				
			}
			catch (Exception e) {
				System.out.print(e);
			}
		}
	}
}
