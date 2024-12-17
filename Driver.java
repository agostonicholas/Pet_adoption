import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
        while (!userInput.equalsIgnoreCase("q")) {
            
            displayMenu();
            userInput = scanner.nextLine();
            
            switch (userInput) {
                case "1":
                    intakeNewDog(scanner);
                    break;
                case "2":
                    intakeNewMonkey(scanner);
                    break;
                case "3":
                    reserveAnimal(scanner);
                    break;
                case "4":
                    printAnimals("dog");
                    break;
                case "5":
                    printAnimals("monkey");
                    break;
                case "6":
                    printAnimals("not reserved");
                    break;
                case "q":
                    System.out.print("Quitting the application");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    public static void initializeMonkeyList() {

    }


    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return;
            }
        }

        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();

        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is the dog reserved? (true/false)");
        boolean reserved = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println("What is the service country?");
        String inServiceCountry = scanner.nextLine();
        
        Dog newDog = new Dog(name, breed, gender, weight, age, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        
        newDog.setName(name);
        newDog.setBreed(breed);
        newDog.setGender(gender);
        newDog.setAge(age);
        newDog.setWeight(weight);
        newDog.setAcquisitionDate(acquisitionDate);
        newDog.setAcquisitionLocation(acquisitionCountry);
        newDog.setTrainingStatus(trainingStatus);
        newDog.setReserved(reserved);
        newDog.setInServiceCountry(inServiceCountry);

        dogList.add(newDog);
    }


        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the dog's name?");
            String name = scanner.nextLine();
            for(Monkey monkey : monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
            }
            
            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();

            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
            
            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
            
            System.out.println("What is the monkey's acquisition date?");
            String acquisitionDate = scanner.nextLine();
            
            System.out.println("What is the monkey's acquisition country?");
            String acquisitionCountry = scanner.nextLine();
            
            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();
            
            System.out.println("Is the monkey reserved? (true/false)");
            boolean reserved = Boolean.parseBoolean(scanner.nextLine());
            
            System.out.println("What is the service country?");
            String inServiceCountry = scanner.nextLine();

            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();

            System.out.println("What is the monkey's tail length?");
            String tailLength = scanner.nextLine();

            System.out.println("What is the monkey's height?");
            String height = scanner.nextLine();

            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.nextLine();

            Monkey newMonkey = new Monkey(name, gender, species, tailLength, height, bodyLength, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
            
            newMonkey.setName(name);
            newMonkey.setGender(gender);
            newMonkey.setAge(age);
            newMonkey.setWeight(weight);
            newMonkey.setAcquisitionDate(acquisitionDate);
            newMonkey.setAcquisitionLocation(acquisitionCountry);
            newMonkey.setTrainingStatus(trainingStatus);
            newMonkey.setReserved(reserved);
            newMonkey.setInServiceCountry(inServiceCountry);
            newMonkey.setHeight(height);
            newMonkey.setBodyLength(bodyLength);
            newMonkey.setSpecies(species);
            newMonkey.setTailLength(tailLength);
            
            monkeyList.add(newMonkey);
        }
            
            

        
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("Enter animal type (dog or monkey):");
            String animalType = scanner.nextLine().toLowerCase();

            System.out.println("Enter the country where the animal is in service:");
            String inServiceCountry = scanner.nextLine();

            boolean animalReserved = false;
                    
                    // dogs
            if (animalType.equals("dog")) {
                for (Dog dog : dogList) {
                    if (dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && !dog.getReserved()) {
                        dog.setReserved(true); // reserve the dog
                        System.out.println(dog.getName() + " has been reserved.");
                        animalReserved = true;
                        break;
                    }
                }
                    
                    // monkey
            } else if (animalType.equals("monkey")) {
                for (Monkey monkey : monkeyList) {
                    if (monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && !monkey.getReserved()) {
                        monkey.setReserved(true); // reserve the monkey
                        System.out.println(monkey.getName() + " has been reserved.");
                        animalReserved = true;
                        break;
                    }
                }

            } else {
                System.out.println("Invalid animal type. Please enter 'dog' or 'monkey'.");
                return;
            }

            if (!animalReserved) {
                System.out.println("No available " + animalType + " found in " + inServiceCountry + " that is not already reserved.");
            }

        }

        
        public static void printAnimals(String listType) {
                    
                    // reservation check
            if (listType.equalsIgnoreCase("not reserved")) {
                System.out.println("\nAvailable Animals (fully trained and not reserved):\n");

                
                    // dogs
                for (Dog dog : dogList) {
                    if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                        System.out.println("Dog Name: " + dog.getName());
                        System.out.println("Status: " + dog.getTrainingStatus());
                        System.out.println("Acquisition Country: " + dog.getAcquisitionLocation());
                        System.out.println("Reserved: " + dog.getReserved() + "\n");
                    }
                }
                    // monkies
                for (Monkey monkey : monkeyList) {
                    if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                        System.out.println("Monkey Name: " + monkey.getName());
                        System.out.println("Status: " + monkey.getTrainingStatus());
                        System.out.println("Acquisition Country: " + monkey.getAcquisitionLocation());
                        System.out.println("Reserved: " + monkey.getReserved() + "\n");
                    }
                }
                    // not yet implemented
            } else {
                if (listType.equalsIgnoreCase("dog")) {
                    System.out.println("This option needs to be implemented");
                } else if (listType.equalsIgnoreCase("monkey")) {
                    System.out.println("This option needs to be implemented");
                }
            }


        }
}

