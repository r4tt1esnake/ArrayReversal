import java.util.Scanner;

class ArrayReversal {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter desired element to be placed at index " + i + ": ");
			arr[i] = sc.nextInt();
		}

		int[] arr1 = method1(arr);

		System.out.println("Inverted array using method 1:");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("Element at " + i + ": " + arr1[i]);
		}

		arr1 = method2(arr);

		System.out.println("Inverted array using method 2:");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("Element at " + i + ": " + arr1[i]);
		}

	}

	public static int[] method1(int[] arr) {

		int[] temp = new int[arr.length];
		int count = 0;

		for(int i = arr.length - 1; i > 0; i--) {
			temp[count] = arr[i];
			count++;
		} 

		return temp;

	}

	public static int[] method2(int[] arr) {

		int temp;
		int count = 1;

		for(int i = 0; i < (arr.length / 2); i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - count];
			arr[arr.length - count] = temp;
			count++;
		}

		return arr;

	}

}