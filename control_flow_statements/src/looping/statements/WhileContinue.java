package looping.statements;

public class WhileContinue {
	
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {
        if((number % 2)  == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        
        while(number <= finishNumber) {
        	
            if(! isEvenNumber(number)  ) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            evenNumbersFound++;
            if(evenNumbersFound >=3) {
                break;
            }
            
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);


    }




}
