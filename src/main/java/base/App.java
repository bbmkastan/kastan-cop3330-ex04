package base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Bao Kastan
 */

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        String noun = myApp.getNoun();
        String verb = myApp.getVerb();
        String adjective = myApp.getAdjective();
        String adverb = myApp.getAdverb();

        String outputString = myApp.createOutputString(noun, verb, adjective, adverb);
        myApp.printOutputString(outputString);
    }

    public void printOutputString(String outputString) {
        System.out.println(outputString);
    }

    public String createOutputString(String noun, String verb, String adjective, String adverb) {
        return "Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!";
    }

    public String getAdverb() {
        promptUser("Enter an adverb: ");
        return getString();
    }

    public String getAdjective() {
        promptUser("Enter an adjective: ");
        return getString();
    }

    public String getVerb() {
        promptUser("Enter a verb: ");
        return getString();
    }

    public String getNoun() {
        promptUser("Enter a noun: ");
        return getString();
    }

    public void promptUser(String s) {
        System.out.println(s);
    }

    public String getString() {
        return in.nextLine();
    }
}
