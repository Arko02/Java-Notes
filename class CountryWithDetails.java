import java.util.Scanner;

class CountryWithDetails {

    // Global in nature because created inside the class{} block.
    // We can access global variables in other classes by using ClassName.
    // Static variable -> Initialized with default value.
    static String Country;
    static String Capital;
    static String State;
    static String PM;
    static String CM;
    static String name = "BHARAT MATA KI JAY";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c;

        while (true) {
            System.out.println("Enter 1 for West Bengal");
            System.out.println("Enter 2 for Karnataka");
            System.out.println("Enter 3 for Tamilnadu");
            System.out.println("Enter 0 to Exit:");
            c = scanner.nextInt();

            if (c == 0) {
                System.out.println("Exiting...");
                break;
            }

            switch (c) {
                case 1:
                    WestBengal(); // Method call.
                    break;
                case 2:
                    Karnataka(); // Method call.
                    break;
                case 3:
                    Tamilnadu(); // Method call.
                    break;
                default:
                    System.err.println("Invalid choice");
                    break;
            }
        }
    }

    // Static block - this will run once, before the main method is called.
    static {
        System.out.println("SAVE THE WORLD 🤝 ");
    }

    public static void WestBengal() // Static_Method
    {

        // Local in nature because it is created inside any {} except Class{}.
        // We can access local variables within the {} where it is created.
        // Non-static variable -> Initialized with default value.
        String name = "West Bengal - where tradition meets progress!";

        System.out.println("Welcome To West Bengal");

        // If static and Local Variable names are same then the static variable can be
        // access by using its class name.
        System.out.println(CountryWithDetails.name);

        // If static and Local Variable names are same then the Local variable can be
        // access Directly.
        System.out.println("My Name is: " + name);

        // Without creating an object, we can access Static_Vembers by using ClassName.
        CountryWithDetails.Country = "INDIA";
        CountryWithDetails.Capital = "DELHI";
        CountryWithDetails.State = "WB";
        CountryWithDetails.PM = "MODI";
        CountryWithDetails.CM = "Mamata";
        // If static and Local Variable names are same then the static variable can be
        // access by using its class name.

        System.out.println("Country is: " + Country);
        System.err.println("Capital is: " + Capital);
        System.err.println("State is: " + State);
        System.err.println("PM is: " + PM);
        System.err.println("CM is: " + CM);

    }

    public static void Karnataka() // Static_Method
    {
        // Local in nature because it is created inside any {} except Class{}.
        // We can access local variables within the {} where it is created.
        // Non-static variable -> Initialized with default value.
        String name = "Karnataka - Unleash your adventurous spirit";

        // If static and Local Variable names are same then the static variable can be
        // access by using its class name.
        System.out.println(CountryWithDetails.name);

        // If static and Local Variable names are same then the Local variable can be
        // access Directly.
        System.out.println("My Name is: " + name);

        System.out.println("Welcome To Karnataka");

        // Without creating an object, we can access Static_Vembers by using ClassName.
        CountryWithDetails.Country = "INDIA";
        CountryWithDetails.Capital = "DELHI";
        CountryWithDetails.State = "Karnataka";
        CountryWithDetails.PM = "MODI";
        CountryWithDetails.CM = "Basavaraj Bommai";

        System.out.println("Country is: " + Country);
        System.err.println("Capital is: " + Capital);
        System.err.println("State is: " + State);
        System.err.println("PM is: " + PM);
        System.err.println("CM is: " + CM);
    }

    public static void Tamilnadu() // Static_Method
    {
        // If static and Local Variable names are same then the static variable can be
        // access by using its class name.
        System.out.println(CountryWithDetails.name);

        // If static and Local Variable names are same then the Local variable can be
        // access Directly.
        System.out.println("My Name is: " + name);

        // Local in nature because it is created inside any {} except Class{}.
        // We can access local variables within the {} where it is created.
        // Non-static variable -> Initialized with default value.
        String name = "Enriching diversity, empowering unity - Tamil Nadu, the land of Dravidian pride.";

        System.out.println("Welcome To Tamilnadu");

        // Without creating an object, we can access Static_Vembers by using ClassName.
        CountryWithDetails.Country = "INDIA";
        CountryWithDetails.Capital = "DELHI";
        CountryWithDetails.State = "Tamilnadu";
        CountryWithDetails.PM = "MODI";
        CountryWithDetails.CM = "M. K. Stalin";

        System.out.println("Country is: " + Country);
        System.err.println("Capital is: " + Capital);
        System.err.println("State is: " + State);
        System.err.println("PM is: " + PM);
        System.err.println("CM is: " + CM);

    }
}