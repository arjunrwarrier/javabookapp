import java.sql.*;
import java.util.Scanner;
public class bookapp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bookDayCharge;
        String bookName, bookAuthor, bookLanguage, bookCategory;

        while(true){
            System.out.println("Book Management App");
            System.out.println("1. Add a book");
            System.out.println("2. View all books");
            System.out.println("3. Search a book");
            System.out.println("4. Update a book");
            System.out.println("5. Delete a book");
            System.out.println("6. Search a book starting with a specific letter");
            System.out.println("7. Display total books in each category");
            System.out.println("8. View books in a specific category");
            System.out.println("9. Display the total amount in return date ");
            System.out.println("10. Exit");

            System.out.println("Enter the choice: ");
            int choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Add Books");

                    System.out.println("Enter the Book Name: ");
                    bookName = input.next();
                    System.out.println("Enter the Author Name: ");
                    bookAuthor = input.next();
                    System.out.println("Enter the Book Language: ");
                    bookLanguage = input.next();
                    System.out.println("Enter the Books Category: ");
                    bookCategory = input.next();
                    System.out.println("Enter the Books charge per day: ");
                    bookDayCharge = input.nextInt();


                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb", "root","");
                        String sql = "INSERT INTO `books`(`bookname`, `author`, `language`, `category`, `charge/day`) VALUES (?,?,?,?,?)";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setString(1,bookName);
                        stmt.setString(2,bookAuthor);
                        stmt.setString(3,bookLanguage);
                        stmt.setString(4,bookCategory);
                        stmt.setInt(5,bookDayCharge);
                        stmt.executeUpdate();


                    }
                    catch (Exception e){
                        System.out.println(e);
                    }

                    break;

                case 2:
                    System.out.println("View all Book");

                    break;


                case 3:
                    System.out.println("Search a book");

                    break;
                case 4:
                    System.out.println("Update a book");

                    break;
                case 5:
                    System.out.println("Delete a book");

                    break;


                case 6:
                    System.out.println("Search a book starting with a specific letter");
                    break;

                case 7:
                    System.out.println("Display total books in each category");
                    break;
                case 8:
                    System.out.println("View books in a specific category");
                    break;
                case 9:
                    System.out.println("Display the total amount in return date");
                    break;
                case 10:
                    System.out.println("Exited Menu..");
                    System.exit(0);






            }

        }



    }
}