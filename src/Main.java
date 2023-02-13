import java.util.Scanner;

public class Main {
	int menu;
	Scanner sc = new Scanner(System.in);
	String type;
	String brand;
	String name;
	String license;
	int wheel;
	int speed;
	int gas;
	String TypeCar;
	int entertainment;
	int helm;
	int price;
	public void add() {
		do {
				System.out.print("Input type [Car | Motorcycle] : ");
				type = sc.nextLine();
		} while (!(type.contentEquals("Car")|| type.contentEquals("Motorcycle")));
		if (type.contentEquals("Car")) {
			do {
				System.out.print("Input Brand [>= 5] : ");
				brand = sc.nextLine();
			} while (brand.length() < 5);
			do {
				System.out.print("Input Name [>= 5] : ");
				name = sc.nextLine();
			} while (name.length() < 5);
			do {
				System.out.print("Input License  : ");
				license = sc.nextLine();
			} while (license.length() < 10 || license.length() > 10);
			do {
				System.out.print("Input top speed [100 <= top speed <=250  : ");
				speed = sc.nextInt();
				sc.nextLine();
			} while (speed < 100 || speed > 250);
			do {
				System.out.print("Input gas capacity [30 <= gas cap <=60  : ");
				gas = sc.nextInt();
				sc.nextLine();
			} while (gas < 30 || gas > 60);
			do {
				System.out.print("Input whell [4 <= gas cap <=6  : ");
				wheel = sc.nextInt();
				sc.nextLine();
			} while (wheel < 4 || wheel > 6);
			do {
				System.out.print("Input type [SUV | Supercar | Minivan] : ");
				TypeCar = sc.nextLine();
		} while (!(TypeCar.contentEquals("SUV")|| TypeCar.contentEquals("Supercar") || TypeCar.contentEquals("Minivan")));
			do {
				System.out.print("Input entertainment  [>= 1 ] : ");
				entertainment = sc.nextInt();
				sc.nextLine();
			} while (entertainment > 1);
		}
		else {
			do {
				System.out.print("Enter Brand [>= 5] : ");
				brand = sc.nextLine();
			} while (brand.length() < 5);
			do {
				System.out.print("Enter Name [>= 5] : ");
				name = sc.nextLine();
			} while (name.length() < 5);
			do {
				System.out.print("Input License  : ");
				license = sc.nextLine();
			} while (license.length() < 10);
			do {
				System.out.print("Input top speed [100 <= top speed <=250  : ");
				speed = sc.nextInt();
				sc.nextLine();
			} while (speed < 100 || speed > 250);
			do {
				System.out.print("Input gas capacity [30 <= gas cap <=60  : ");
				gas = sc.nextInt();
				sc.nextLine();
			} while (gas < 30 || gas > 60);
			do {
				System.out.print("Input whell [4 <= gas cap <=6  : ");
				wheel = sc.nextInt();
				sc.nextLine();
			} while (wheel < 2 || wheel > 3);
			do {
				System.out.print("Input Helm  [>= 1 ] : ");
				helm = sc.nextInt();
				sc.nextLine();
			} while (helm > 1 || helm < 1);
		}
		System.out.println("ENTER to return");
		sc.nextLine();
		menu = 0;
	}
	public void view() {
		int no = 0;
		System.out.println("No" + "\t" + "Name");
		System.out.println(no + "\t" + name);
		System.out.print("pick a vehicle number to test drive[Enter 0 to EXIT] : ");
		sc.nextLine();
		System.out.print("Brand : ");
		System.out.println(brand);
		System.out.print("Name : ");
		System.out.println(name);
		System.out.print("License plate : ");
		System.out.println(license);
		System.out.print("Type : ");
		System.out.println(type);
		System.out.print("Gas Capacity : ");
		System.out.println(gas);
		System.out.print("Top Speed : ");
		System.out.println(speed);
		System.out.print("Wheels : ");
		System.out.println(wheel);
		System.out.print("entertainment System : ");
		System.out.println(entertainment);
		System.out.println("Input Price : ");
		price = sc.nextInt();
		sc.nextLine();
		menu = 0;
		
	}
	
	
	public void menu() {
		boolean isRun = true;
		do {
		System.out.println("        PT Meksiko        ");
		System.out.println("==========================");
		System.out.println("1.Input Data");
		System.out.println("2.View Data");
		System.out.println("3.Exit");
		System.out.println("==========================");
		System.out.print("Choice Menu : ");
		menu = sc.nextInt();
		sc.nextLine();
		do {
			switch (menu) {
			case 1:
				add();
				break;
			case 2:
				view();
				break;
			case 3:
				System.out.println("Bye Bye");
				isRun = false;
				break;
			default:
				break;
			}
		} while (!(menu < 1 || menu > 3));
	} while (isRun);
	}
	public Main() {
		// TODO Auto-generated constructor stub
		menu();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
