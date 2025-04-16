public class Book extends LibraryMedia{
    private String author;
    private int numberOfPages;

    public Book (String title, String author, int numberOfPages, int publicationYear ){
        super(title, publicationYear);
        this.author = author;
        this.numberOfPages = numberOfPages;

    }


    public void displayInformation(){
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberOfPages);

    }











}
