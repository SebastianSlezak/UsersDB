package com.company;

import java.util.*;

public class Party {
    private List<Guest> guest = new ArrayList<>();
    private HashMap<Integer,Guest> phoneToGuest = new HashMap<>();
    private HashSet<String> meals = new HashSet<>();

    Scanner scanner = new Scanner(System.in);

    public void addGuests(){
        System.out.println("Podaj imie:");
        String name = scanner.nextLine();

        System.out.println("Podaj posilek:");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu:");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Czy jest Weganinem? (Y/N):");
        String isVeganString = scanner.nextLine();

        boolean isVegan = false;

        //TODO dodac petle

            if (isVeganString.equals("Y")) {
                isVegan = true;
            } else if (isVeganString.equals("N")) {
                isVegan = false;
            } else {
                System.out.println("Podaj poprawna wartosc:");
                isVeganString = scanner.nextLine();
            }


        Guest guest = new Guest(name,meal,phoneNumber,isVegan);
        this.guest.add(guest);
        meals.add(meal);
        phoneToGuest.put(phoneNumber,guest);
    }

    public void displayUsers(){
        for(Guest guest : guest){
            guest.displayUsersInformation();
        }
    }

    public void displayMeals(){
        for(String meal : meals){
            System.out.println(meal);
        }
    }

    public void displayGuestByPhoneNumber(){
        System.out.println("Podaj numer telefonu: ");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());

        Guest guest = phoneToGuest.get(phoneNumber);

        guest.displayUsersInformation();
    }
}
