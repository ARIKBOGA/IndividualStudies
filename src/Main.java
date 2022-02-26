import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double premium = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        boolean usDriverlicence = scan.nextBoolean();

        if (usDriverlicence == false) {
            System.out.println("Invalid data!");
        } else {

            System.out.println("Enter your zip code");
            int zipCode = scan.nextInt();

            if (zipCode == 20910 || zipCode == 20740) {
                premium += 60;
            } else if (zipCode == 22101 || zipCode == 22103) {
                premium += 30;
            } else {
                System.out.println(premium += 50);
            }

            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            String vehicleOwnership = scan.next();
            if (vehicleOwnership.equals("owned")) {
                premium += 10;
            } else {
                premium += 20;
            }

            System.out.println("How is this vehicle primarily used?");
            String vehicleUsage = scan.next();


            if (vehicleUsage.equals("Business")) {
                premium += 50;
            } else if (vehicleUsage.equals("Pleasure")) {
                premium += 10;
            } else if (vehicleUsage.equals("Commute")) {
                premium += 20;
            }

            System.out.println("Days Driven To Work And/Or School");
            int daysDrivenToWorkOrSchool = scan.nextInt();
            premium += daysDrivenToWorkOrSchool * 5;


            System.out.println("Miles Driven To Work And/Or School");
            int milesToWorkOrSchool = scan.nextInt();
            premium += milesToWorkOrSchool * 1;


            System.out.println("How old are you?");
            int age = scan.nextInt();

            if (age < 16) {
                System.out.println("Invalid data!");
            } else if (age >= 16 && age < 18) {
                premium *= 20;
            } else if (age >= 18 && age <= 21) {
                premium *= 6;
            } else if (age > 21 && age < 25) {
                premium *= 2;
            }


            System.out.println(" How many years you've been driving?");
            int yearsDriving = scan.nextInt();
            if (yearsDriving > 0 && age - yearsDriving >= 16) {
                premium -= yearsDriving * 5;
            } else {
                System.out.println("Invalid data!");
            }

            System.out.println("Have you had any accidents in the last 5 years?");
            boolean accidents = scan.nextBoolean();
            System.out.println("How many?");
            int accidentsAmount = scan.nextInt();
            premium += (0.2) * premium * accidentsAmount;

            System.out.println("Have you had continuous insurance for the past 12 months?");
            boolean continuousInsurance = scan.nextBoolean();
            if (continuousInsurance == false) {
                premium *= 2;
            }

            System.out.println("What is the highest level of education you have completed?");

            String education = scan.next();
            if (education.equals("PhD") || education.equals("Bachelors") || education.equals("Masters")) {
                premium -= 0.05 * premium;
            } else if (education.equals("Doctors")) {
                premium -= 0.1 * premium;
            } else if (education.equals("Less than High School")) {
                premium += 0.05 * premium;
            }


            String referenceNumber = name.substring(0, 2).toUpperCase() + age + name.substring(name.length() - 1, name.length() - 2).toUpperCase() + zipCode + education.trim().toUpperCase();
            System.out.println(name + ",  here's your quote!");
            System.out.println("Start Your Policy Today For: $" + premium);
            System.out.println("Reference Number: " + referenceNumber);
        }
    }
}