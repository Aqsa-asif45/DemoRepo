public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(3, "Head First Java", "Kathy Sierra"));

        Member alice = new Member("Alice");
        Member bob = new Member("Bob");
        library.addMember(alice);
        library.addMember(bob);

        library.printCatalog();

        System.out.println("\nAlice borrows #1: " + library.borrowBook(alice, 1));
        System.out.println("Bob borrows #1:   " + library.borrowBook(bob, 1));
        System.out.println("Bob borrows #2:   " + library.borrowBook(bob, 2));

        System.out.println();
        library.printCatalog();
        library.printMembers();

        System.out.println("\nAlice returns #1: " + library.returnBook(alice, 1));
        System.out.println();
        library.printCatalog();
    }
}
