public class TypeConversion {
    public static void main(String[] args) {
        double salary = 58326.55487;

        System.out.println("Salary with decimals :$"+salary);
        int roundedSalary = (int)salary;
        System.err.println("Salary without decimals: $"+roundedSalary);
        
    }
    
}
