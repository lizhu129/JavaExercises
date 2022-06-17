package Literature;

import java.util.*;

public class main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Book> books = new ArrayList<>();
        int count = 0;

        // Ask user input until the user gives an empty String
        while (true) {
            System.out.println("Input the name of the book, empty stops");
            String name = scanner.nextLine().trim();
            if (name.equals("")) {
                break;
            }
            System.out.println("Input the age recommendation");
            int age = Integer.valueOf(scanner.nextLine().trim());
            // Add each book to the ArrayList
            books.add(new Book(name, age));
            count++;
        }

        // Sort books based on their age recommendation
        Comparator <Book> comparator = Comparator.comparing(Book :: getAge).thenComparing(Book :: getName);
        Collections.sort(books, comparator);

        // Print all the books
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println(count);
    }
}
