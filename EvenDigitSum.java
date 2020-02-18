//Elena Voinu
public class EvenDigitSum {
    
    //method named getEvenDigitSum with one parameter of type int called number
    public static int getEvenDigitSum(int number){
        //initialize variables
        int sum = 0;
        int lastDigit = 0;
        
        //If the number is negative, the method should return -1 to indicate an invalid value.
        if(number < 0)
            return -1;
        
        //if number is greater than 0 then using a loop, find the even digits within the number
        //and sum them up
        while(number > 0){
            // find the last digit using modulo operator
            lastDigit = number % 10;
            // find the first digit
            number /=10;
            //if the number is even add it to sum
            if(lastDigit % 2 ==0)
                
                sum +=lastDigit;

        }

        return sum;
    }
    //main method to test the code
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(456));
    }
}

