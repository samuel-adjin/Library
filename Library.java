public class Library {

    public int bookCount = 0;
    private String address;
    private Book[] books = new Book[4];


    public Library(String address) {

        this.address = address;
    }


    public void printAddress() {
        System.out.println(this.address);
    }

    public void borrowBook(String bookTitle) {



        for(int i=0; i<bookCount; i++)

            if(books[i].getTitle().equals(bookTitle))
                if(books[i].isBorrowed()) {
                    System.out.println("Sorry, this book is already borrowed.");

                    return;
                }
                else {
                    System.out.println("You successfully borrowed " + bookTitle);
                    books[i].borrowed();
                    books[i].borrowed = true;


                    return;
                }

        System.out.println("Sorry, this book is not in our catalog.");

    }



    public void addBook(Book bookTitle) {
        books[bookCount] = bookTitle;
        bookCount++;

    }

    public void printAvailableBooks() {
        if (bookCount == 0){
            System.out.println("No book in catalogue");
        }
        for (int i = 0; i<bookCount; i++){
            if (!books[i].isBorrowed()){
                System.out.println(books[i].getTitle());
            }
        }}

    public void returnBook(String returnedBook) {
        for(int i=0; i<bookCount; i++)
            if(books[i].getTitle().equals(returnedBook))
                if(books[i].isBorrowed()) {
                    System.out.println("You successfully returned " + returnedBook);
                    books[i].returned();
                    return;
                }

    }


}
