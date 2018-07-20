/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algostuff;

/**
 *
 * @author joel.eze
 */
public class ReverseList {
    public static void main(String[] args) {
        int myList[] = {1, 2, 3};
        System.out.println("print list "+reverseList(myList));
        
    }
    public static int reverseList(int[] myList){
        int lists = 0;
        for(int i = 0; i < myList.length; i++){
            lists = myList[i];
        }
        return lists;
    }
}
