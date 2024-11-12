import java.util.Scanner;

// Interface NumberCheck for abstraction
interface NumberCheck {
    boolean check(int number);
    String getType(); // To identify the type of check (e.g., Armstrong, Fibonacci, etc.)
}

// Armstrong check implementation
class ArmstrongCheck implements NumberCheck {
    @Override
    public boolean check(int number) {
        int sum = 0, temp = number;
        int digits = String.valueOf(number).length();

        while (temp != 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        
        return sum == number;
    }
    
    @Override
    public String getType() {
        return "Armstrong";
    }
}

// Fibonacci check implementation
class FibonacciCheck implements NumberCheck {
    @Override
    public boolean check(int number) {
        int a = 0, b = 1, fib = 0;
        
        while (fib < number) {
            fib = a + b;
            a = b;
            b = fib;
        }
        
        return fib == number || number == 0;
    }
    
    @Override
    public String getType() {
        return "Fibonacci";
    }
}

// Palindrome check implementation
class PalindromeCheck implements NumberCheck {
    @Override
    public boolean check(int number) {
        int reverse = 0, temp = number;

        while (temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        
        return reverse == number;
    }
    
    @Override
    public String getType() {
        return "Palindrome";
    }
}

// Kaprekar check implementation
class KaprekarCheck implements NumberCheck {
    @Override
    public boolean check(int number) {
        int square = number * number;
        String strSquare = String.valueOf(square);
        int d = String.valueOf(number).length();
        
        int rightPart = Integer.parseInt(strSquare.substring(strSquare.length() - d));
        int leftPart = strSquare.length() == d ? 0 : Integer.parseInt(strSquare.substring(0, strSquare.length() - d));

        return leftPart + rightPart == number;
    }
    
    @Override
    public String getType() {
        return "Kaprekar";
    }
}

// Main class Everynumop with menu-driven code
public class Everynumop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of NumberCheck instances for polymorphic behavior
        NumberCheck[] checks = {
            new ArmstrongCheck(),
            new FibonacciCheck(),
            new PalindromeCheck(),
            new KaprekarCheck()
        };

        boolean exit = false;

        while (!exit) {
            System.out.println("\n---- Menu ----");
            for (int i = 0; i < checks.length; i++) {
                System.out.println((i + 1) + ". Check " + checks[i].getType() + " Number");
            }
            System.out.println((checks.length + 1) + ". Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= checks.length) {
                System.out.print("Enter a number to check for " + checks[choice - 1].getType() + ": ");
                int number = scanner.nextInt();
                
                // Polymorphic call to the appropriate check method
                if (checks[choice - 1].check(number)) {
                    System.out.println(number + " is a " + checks[choice - 1].getType() + " number.");
                } else {
                    System.out.println(number + " is not a " + checks[choice - 1].getType() + " number.");
                }
            } else if (choice == checks.length + 1) {
                exit = true;
                System.out.println("Exiting the program...");
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}

