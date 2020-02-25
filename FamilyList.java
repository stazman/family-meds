//want to make a changeable list of family members with all CRUD


import java.util.Scanner;

// import jdk.jshell.spi.ExecutionControl;

// import java.util.*;

public class FamilyList {

  private String name;

  static Scanner userInput = new Scanner(System.in);


  public FamilyList() {


    if(userInput.hasNextLine()){

      this.setName(userInput.nextLine());
     
    }

    System.out.print("Enter the family member's name: \n");


  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public static void main(String[] args){

      // FamilyList susan = new FamilyList();

      // susan.setName("Susan");

      // System.out.println(susan.getName());
  }

}

