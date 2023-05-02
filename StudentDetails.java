class StudentDetails {
    // Non_Static Variable -> Initialise with its default value.
    // Non_Static Variable -> Only accessible with in the class By using object
    // refarance.
    int id;
    String name;
    int age;

    // Non_Static Method -> Only accessible after creating an object
    public int getId() {
        return id;
    }

    // Non_Static Method -> Only accessible after creating an object
    public void printName() {
        System.out.println("Student Name is: " + name);
    }

    // Non_Static Method -> Only accessible after creating an object
    public int getAge() {
        return age;
    }

    // Non_Static Initialiser or block -> Non-call Abel member.
    // Non_Static Initialiser or block -> Execute once for every object creation in
    // top to bottom order.
    {
        System.out.println(
                "The more that you read, the more things you will know. The more that you learn, the more places you'll go. - Dr. Seuss ");
    }

    public static void main(String[] args) {

        // Local_Variable -> Not initially with its default values.
        // Local_Variable -> Created any block except class block.
        // Local_Variable -> Accessible with in the blog. Like -> main{accessible}
        // Except Main block. {not Accessible}.
        String className;
        int RollNumber;
        char section;

        // Object Creation
        StudentDetails student1 = new StudentDetails();

        // Call Local_Variable directly and re-assign a value.
        className = "10th Standard";
        RollNumber = 1;
        section = 'A';

        // Print Local_Variable
        System.out.println("Class Standard: " + className);
        System.out.println("Roll Rumber: " + RollNumber);
        System.out.println("Section: " + section);
        System.out.println();

        // Call Non-static variable by using object reference and re-assigning value.
        student1.id = 10;
        student1.name = "Arko";
        student1.age = 18;

        // Print Non Staic_Variable
        System.out.println("Class Standard ID: " + student1.getId());
        student1.printName();
        System.out.println("Age: " + student1.getAge());
        System.out.println("----------------------------------");

        // Object Creation
        StudentDetails student2 = new StudentDetails();

        // Call Local_Variable directly and re-assign a value.
        RollNumber = 3;
        section = 'B';

        // Print Local_Variable
        System.out.println("Class standard: " + className);
        System.out.println("Roll Number: " + RollNumber);
        System.out.println("Section: " + section);
        System.out.println();

        // Call Non-static variable by using object reference and re-assigning value.
        student2.id = 10;
        student2.name = "Puja";
        student2.age = 18;

        // Print Non Staic_Variable
        System.out.println("Class Standard ID: " + student2.getId());
        student2.printName();
        System.out.println("Age: " + student2.getAge());
        System.out.println("----------------------------------");

        // Object Creation
        StudentDetails student3 = new StudentDetails();

        // Call Local_Variable directly and re-assign a value.
        className = "11th Standard";
        RollNumber = 1;
        section = 'C';

        // Print Local_Variable
        System.out.println("Class standard: " + className);
        System.out.println("Roll number: " + RollNumber);
        System.out.println("Section: " + section);
        System.out.println();

        // Call Non-static variable by using object reference and re-assigning value.
        student3.id = 11;
        student3.name = "Raja";
        student3.age = 19;

        // Print Non Staic_Variable
        System.out.println("Class Standard ID: " + student3.getId());
        student3.printName();
        System.out.println("Age: " + student3.getAge());
        System.out.println("----------------------------------");

    }

}