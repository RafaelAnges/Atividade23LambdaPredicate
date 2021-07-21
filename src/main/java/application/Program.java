/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import util.ProductPredicate;

/**
 *
 * @author rafae
 */
public class Program {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        
        List<Product> list = new ArrayList<>();
        
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        
        //EXPRESSÃO LAMBDA INLINE
         double min = 100.00;
        
        list.removeIf(p -> p.getPrice() >= min);
        for(Product p : list){
            System.out.println(p);
        }
        
        
        
        /*EXPRESSÃO LAMDA DECLARADA
        Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        list.removeIf(pred);
        for(Product p : list){
            System.out.println(p);
        }
        */
        
        /* REFERENCE METHOD COM MÉTODO NÃO ESTÁTICO
        list.removeIf(Product::nonStaticProductPredicate);
        for(Product p : list){
            System.out.println(p);
        }
        
        
        /* REFERENCE METHOD COM MÉTODO ESTÁTICO
        list.removeIf(Product::staticProductPredicate);
        for(Product p : list){
            System.out.println(p);
        }
        */
        
        /*   IMPLEMENTAÇÃO DA INTERFACE
        list.removeIf(new ProductPredicate());
        for(Product p : list){
            System.out.println(p);
        }
        */
      
    }
    
}
