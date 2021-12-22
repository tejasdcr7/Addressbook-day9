package com.bridgelabz.addbook;
import java.util.Scanner;


public class AddressBook {

    public static void main(String[] args) {
       AddressBook a = new AddressBook();
        a.showMenu();
        a.userSelection();
        a.editContact();

    }
    public int showMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to the Address Book \n 1.Add Contact\n 2.Edit Contact\n 3.Delete Contact\n");

        int option = sc.nextInt();
        return option;

    }
    void userSelection(int option){
        switch (option){

            case 1:addContact();
            break;
            case 2:editContact();
                break;
            case 3:
                break;
        }

    }

      void addContact(){
          Scanner sc = new Scanner(System.in);
          ContactDetails contact = new ContactDetails();
          System.out.println( "Enter First Name" );
          contact.First_Name = sc.next();
          System.out.println( "Enter Last Name" );
          contact.Last_Name = sc.next();
          System.out.println("Enter Address");
          contact.Address = sc.next();
          System.out.println("Enter City Name");
          contact.City = sc.next();
          System.out.println("Enter State");
          contact.State = sc.next();
          System.out.println("Enter Phone Number ");
          contact.Phone_Number = sc.next();
          System.out.println("Enter Email Id");
          contact.Email = sc.next();
        }

        void editContact(){
            Scanner sc = new Scanner(System.in);
            ContactDetails contact = new ContactDetails();
            System.out.println( "Edit First Name" );
            contact.First_Name = sc.next();
            System.out.println( "Edit Last Name" );
            contact.Last_Name = sc.next();
            System.out.println("Edit Address");
            contact.Address = sc.next();
            System.out.println("Edit City Name");
            contact.City = sc.next();
            System.out.println("Edit State");
            contact.State = sc.next();
            System.out.println("Edit Phone Number ");
            contact.Phone_Number = sc.next();
            System.out.println("Edit Email Id");
            contact.Email = sc.next();


        }


    }










