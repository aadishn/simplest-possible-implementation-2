package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List <Integer> of(int number) {
       List<Integer> primeFactors = new ArrayList<>();
       if(number % 2 == 0){
           primeFactors.add(2);
       }
       return primeFactors;
    }
}
