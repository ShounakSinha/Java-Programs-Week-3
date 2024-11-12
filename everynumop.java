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

