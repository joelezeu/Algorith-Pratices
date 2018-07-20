/*
 * Implement LinkedList in Java;
 */
package algostuff;

import java.util.LinkedList;

/**
 *
 * @author joel.eze
 */
public class LinkedListJava {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Joel");
        list.addFirst("Big");
        list.addLast("Likes girls");
        System.out.println(list);
    }        
}
