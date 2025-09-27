package basicmath;

public class ArmstrongNumber {
    boolean checkIfArmStrong(int number){
        int sum = 0;
        int originalNumber = number;
        while (number > 0 ){
            int temp = number %10;
            sum = sum + (temp * temp * temp);
            number = number / 10 ;
        }
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        System.out.println(new ArmstrongNumber().checkIfArmStrong(1553) );
    }
}
