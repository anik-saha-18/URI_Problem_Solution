
package AnikSAha;

import java.util.ArrayList;
public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> number =new ArrayList<Integer>();
        System.out.print("The size "+number.size());
        number.add(19);
        number.add(20);
        number.add(2,34);
        System.out.println(number);
    }
    
}
