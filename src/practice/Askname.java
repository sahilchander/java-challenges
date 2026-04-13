package practice;

import java.util.Scanner;

class Askname {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Whats You Name: ");
        String name = input.nextLine();
        System.out.print("Welcome " + name + " To KGCoding");
    }
}
