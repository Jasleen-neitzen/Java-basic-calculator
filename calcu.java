import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {

        try (var cal = new Scanner(System.in)) {
            System.out.println("Enter your first number:");
            
            double a = cal.nextDouble();
            
            
            System.out.println("Enter your operator (+, -, *, /):");
            
            char operator = cal.next().charAt(0);
            
            
            System.out.println("Enter your second number:");
            
            double b = cal.nextDouble();
            
            
            double result = 0;
            
            
            switch (operator) {
                
                case '+' -> result = a + b;
                
                case '-' -> result = a - b;
                case '*' -> result = a * b;
                case '/' -> {
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error: Division by zero!");
                        cal.close();
                        return;
                    }
                }
                
                default -> {
                    System.out.println("Invalid operator!");
                    cal.close();
                    return;
                }
            }
            
            
            System.out.println("Result: " + result);
        }
        
    }
}




            

                        




            

        

       



    }
}