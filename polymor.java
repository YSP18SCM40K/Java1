//package javaapplication2;
import java.io.*;
import java.util.*;
  class Lexus {
  public void enginesound() {
    System.out.println("This engine makes too much sound!!");
  }
}

class Toyota extends Lexus {
  public void enginesound() {
    System.out.println("THis is an extended class");
  }
}

class Acura extends Lexus {
  public void enginesound() {
    System.out.println("This is an extended class also.");
  }
}

class polymor {
  public static void main(String[] args) {
    Lexus myLexus = new Lexus();  // Create a Lexus object
    Lexus myToyota = new Toyota();  // Create a Toyota object
    Lexus myAcura = new Acura();  // Create a Acura object
    myLexus.enginesound();
    myToyota.enginesound();
    myAcura.enginesound();
  }
}

