package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Book[] books = {
                 new Book(1,"9780140449136","The Odyssey"),
                 new Book(2,"9780141439600","Pride and Prejudice"),
                 new Book(3,"9780061120084","To Kill a Mockingbird"),
                 new Book(4,"9780451524935","1984"),
                 new Book(5,"9780743273565","The Great Gatsby"),
                 new Book(6,"9780141439518","Jane Eyre"),
                 new Book(7,"9780141439556","Wuthering Heights"),
                 new Book(8,"9780316769488","The Catcher in the Rye"),
                 new Book(9,"9780140449266","The Iliad"),
                 new Book(10,"9780679783275","Crime and Punishment"),
                 new Book(11,"9780140449181","The Aeneid"),
                 new Book(12,"9780060850525","Brave New World"),
                 new Book(13,"9780140449273","Meditations"),
                 new Book(14,"9780060935467","Beloved"),
                 new Book(15,"9780553380163","Dune"),
                 new Book(16,"9780345339683","The Hobbit"),
                 new Book(17,"9780261103573","The Lord of the Rings"),
                 new Book(18,"9780385472579","Things Fall Apart"),
                 new Book(19,"9780062316097","Sapiens"),
                 new Book(20,"9780141439600","Great Expectations")
         };

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Hello I am an online library, please choose one by selecting the number" +
                    "\n(1) Show Available Books" +
                    "\n(2) Show Checked Out Books" +
                    "\n(3) Check In Book" +
                    "\n(4) Exit Menu");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    for(int i = 0; i < books.length; i++){
                        System.out.println("ID: " + books[i].getId() + " ISBN: " + books[i].getIsbn() + " Title: " + books[i].getTitle());
                }
                    System.out.println("Is there a book you wan to check out?" +
                            "\nYes/No");
                    String answer = scanner.nextLine().toLowerCase();
                    if(answer.equals("yes")){
                        System.out.println("Select ID to check out: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                    } else{
                    }



                    break;

                case 2:
                    break;

                case 3:
                    System.out.println("what book do you want to check in:");
                    break;

                case 4:
                    System.out.println("Thank you goodbye");
                    System.exit(0);
                    break;

            }
        }






    }
}