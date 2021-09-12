public class FizzBuzz {
    public void count() {
        for(int i = 0; i <= 100; i++){
            String result = fizzbuzz(i);
            System.out.printf("Number: %d Result %s",i,result);
        }
    }
    public String fizzBuzz(int number) {
        if(number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";

        }
        else if (number % 3 == 0){
            return "Fizz";
        }
            
        else if (number % 5 == 0){
            return "Buzz";
        }
            
        else 
            return Interger.toString(number);
        
    }
   
}

