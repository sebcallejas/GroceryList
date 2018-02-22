/*
* Sebastian Callejas
* Period 2
* Project: UsingArrayList
 */
package usingarraylist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author 18051
 */
public class UsingArrayList {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> groceryList = new ArrayList<String>();

    public static void main(String[] args) {
        // And so it begins....
        greeting();
    }

    public static void greeting() {
        System.out.println("Hey, its time for some grocery shopping!");
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("What would you like to do?");
        System.out.println("A) Add an item to the list");
        System.out.println("B) Remove an item on the list");
        System.out.println("C) Replace an item on the list");
        System.out.println("D) Display the list and the total number of items"
                + "on the list");
        System.out.println("E) Quit");
        char choice = scan.next().toLowerCase().charAt(0);

        switch (choice) {
            case 'a':
                add();
                break;
            case 'b':
                remove();
                break;
            case 'c':
                replace();
                break;
            case 'd':
                display();
                break;
            case 'e':
                quit();
                break;
        }

    }

    public static void add() {
        scan.nextLine();
        String answer;
        do {
            //scan.nextLine();
            System.out.println("What would you like to add to the list?");
            groceryList.add(scan.nextLine());
            System.out.println("Would you like to add another item to the list? (y/n)");
            answer = scan.nextLine().toLowerCase();
        } while (answer.equals("y"));
        mainMenu();
    }

    public static void remove() {
        String answer;
        do {
            System.out.println("What would you like to remove?");
            String remoObj = scan.next();
            if (groceryList.contains(remoObj)) {
                int index = groceryList.indexOf(remoObj);
                groceryList.remove(index);
            } else {
                System.out.println("Sorry that item is not in you cart.");
            }
            System.out.println("Would you like to remove another item? (y/n)");
            answer = scan.next();
        } while (answer.equals("y"));

        mainMenu();
    }

    public static void replace() {
       String answer;
        do {
            System.out.println("What would you like to place?");
            String replace = scan.nextLine();
            if (groceryList.contains(replace)) {
                System.out.println("What would you like to replace this with?");
                String replaceWith = scan.nextLine();
                
                
            }
        } while (answer.equals("y"));
        
    }

    public static void display() {

    }

    public static void quit() {
        System.exit(0);
    }
}
