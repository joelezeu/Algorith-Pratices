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
public class Equation {

    //n^2 + 5n + 18 = 7363094
    public static void main(String[] args) {
        double[] num = Numbers(1, 5, 18, 7363094);
        System.out.println("1st root " + num[0]);
        System.out.println("2nd root " + num[1]);
    }

    static double[] Numbers(int a, int b, int c, int d) {
        //Using Quadratic Equation or Almighty Formula
        // d id the discriminant
        double[] num = new double[2];
        if (d == 0) {
            double n = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double n2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

            num[0] = n;
            num[1] = n2;
        } else if (d < 0) {
            //Negative Number
            double newNum = c + d;
            double n = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * newNum)) / (2 * a);
            double n2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * newNum)) / (2 * a);
            num[0] = n;
            num[1] = n2;
        } else if (d > 0) {
            //Positive
            double newNum = c - d;
            double n = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * newNum)) / (2 * a);
            double n2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * newNum)) / (2 * a);
            num[0] = n;
            num[1] = n2;
        }

        return num;
    }

}
