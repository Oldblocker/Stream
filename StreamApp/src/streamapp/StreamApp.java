/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamapp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Luke
 */
public class StreamApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stream<Integer> str = Stream.iterate(0, x -> x + 1);
        List<Integer> lst = str.filter(x -> x > 100 && x < 1000 && x%5 == 0)
                            .limit(10)
                            .map(x -> x * 3)
                            .collect(Collectors.toList());
                            
                            
        
        lst.forEach(System.out::println);
        
        
    }
    
}
