# Person Management System in Java

This repository contains a Java project that manages information about people. The program includes classes for defining person attributes, handling user input, and performing operations such as displaying and manipulating person data.

## Features

- **Person Attributes**: Defines attributes such as name, age, and address for a person.
- **User Interaction**: Handles user input to create and manage person data.
- **Data Display**: Outputs the details of the people managed by the system.

### Code Snippets

#### Main Class
The main class initializes the program, handles user input, and invokes methods for managing person data.

```java
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TPersona> people = new ArrayList<>();

        System.out.print("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            TPersona person = new TPersona(name, age, address);
            people.add(person);
        }

        System.out.println("List of people:");
        for (TPersona person : people) {
            System.out.println(person);
        }
    }
}
```

#### Person Class

The `TPersona` class represents a person with attributes such as name, age, and address. It includes methods for displaying person details.

```java
public class TPersona {
    private String name;
    private int age;
    private String address;

    public TPersona(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}
```

### Usage

1.  Compile the Java files using a Java compiler (e.g., `javac`).
2.  Run the main class (`Principal`) to start the program.
3.  Follow the prompts to enter the details of each person.
4.  The program will display the list of people with their details.

### Classes and Methods

-   `Principal`: The main class that handles user input and program execution.
    -   `main(String[] args)`: The entry point of the program.
-   `TPersona`: A class representing a person with attributes and methods for displaying details.
    -   `TPersona(String name, int age, String address)`: Constructor that initializes the person's attributes.
    -   `toString()`: Method that returns the string representation of the person's details.