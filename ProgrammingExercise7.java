/** Program: Programming Exercise 7
 * Summary: Loops 100,000 times over sequential integers, informs you 
 *          if there are palindromic and prime integers during this loop. 
 * Author: Katon Bingham
 * Date: 02/18/18
 *
 * All following work is my own. 
 * -Katon
 **/
package programmingexercise7;


public class ProgrammingExercise7 {

    public static boolean isPrime(int x){
        // is x a multiple of 2?
        if (x%2==0)
            return false;
        // with 2 checked for, check for 'odd' primes
        // increment by 2 to check odd # only
        for (int i=3; i * i <= x; i += 2){ 
            if(x % i == 0)
                return false;
        }
        return true;    
    }
   
   public static boolean isPalindromic(int x){
       // variables Palindrome and Reverse 
       int pal = x;
       int reverse = 0;
       
       while (pal != 0){                    // only testing positive numbers
           int remainder = pal % 10;        
           reverse = reverse * 10 + remainder;
           pal = pal / 10;
       }
       
       return x == reverse;
   }
   
   public static void main(String[] args) {
        
        //loop 100,000 integers
        for (int i = 1; i <= 100000; i++){ // i starts at 1 to avoid off-by-1
            
            if (isPalindromic(i) == true)
                if (isPrime(i) == true)
                    System.out.print(i + " ");
        }
    
    }
    
}
