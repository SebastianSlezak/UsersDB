//TODO dodac baze danych 

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean exit = true;

        Party party = new Party();

        while(exit){
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyswietl uzytkownikow");
            System.out.println("2. Dodaj uzytkownika");
            System.out.println("3. Wyszukaj uzytkownika za pomoca numeru telefonu");
            System.out.println("4. Wyswietl liste dan");
            System.out.println("5. Wyjscie");

            int userChoice = scanner.nextInt();

            switch(userChoice){
                case 1 -> party.displayUsers();
                case 2 -> party.addGuests();
                case 3 -> party.displayGuestByPhoneNumber();
                case 4 -> party.displayMeals();
                case 5 -> exit = false;
            }
        }
    }
}
