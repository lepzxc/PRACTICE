import java.util.Scanner;

public class restaurant {
	public static void main(String[] args) {
	    
		core();

	}
	
	public static void core() {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("1. Food" +
	    "\n2. Drinks" +
	    "\n3. Dessert" + 
	    "\n0. Exit");
	    
	    System.out.print("Choose: ");
	    int choose = sc.nextInt();
	    
	    if (choose == 1) {
	        choice1();
	    }
	    else if (choose == 2) {
	        choice2();
	    }
	    else if (choose == 3) {
	        choice3();
	    }
	    else if (choose == 0) {
	        System.out.println("THANKYOU!");
	    }
	    else {
	        System.out.println("INVALID INPUT!");
	    }
	}
	
	public static void choice1() {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("------------*****------------" +
	    "\nFOODS: " +
	    "\n1. Adobo = 15$" +
	    "\n2. Sinigang = 15$" +
	    "\n3. Dinuguan = 15$" +
	    "\n0. Back");
	    
	    System.out.print("Choose: ");
	    int choice1 = sc.nextInt();
	    
	    if (choice1 == 0) {
	        core();
	    }

        else if (choice1 == 1) {
            int price = 15;
            System.out.println("Total is: "+ price + "$");
        }

        else if (choice1 == 2) {
            int price = 15;
            System.out.println("Total is: "+ price + "$");
        }

        else if (choice1 == 3) {
            int price = 10;
            System.out.println("Total is: "+ price + "$");
        }

        System.out.print("You want to order more? [Y] / [N] ");
        char again = sc.next().charAt(0);

        if (again == 'Y' || again == 'y') {
            core();
        }
        else if (again == 'N' || again == 'n') {
            System.out.println("THANKYOU!");
        }
        else {
            System.out.println("INVALID!");
        }
	}
	
	public static void choice2() {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("------------*****------------" +
	    "\n1. Coke" +
	    "\n2. Sprite" +
	    "\n3. Nestea" +
	    "\n4. Royal" +
	    "\n0. Back");
	    
	    System.out.print("Choose: ");
	    int choose = sc.nextInt();
	    
	    if (choose == 0) {
	        core();
	    }
	}
	
	public static void choice3() {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("------------*****------------" +
	    "\n1. Cake" +
	    "\n2. Ice Cream" +
	    "\n3. Cookies" +
	    "\n0. Back");
	    
	    System.out.print("Choose: ");
	    int choose = sc.nextInt();
	    
	    if (choose == 0) {
	        core();
	    }
	}

    public static void choice1_1() {
        Scanner sc = new Scanner(System.in);

        System.out.println();
    }
}
