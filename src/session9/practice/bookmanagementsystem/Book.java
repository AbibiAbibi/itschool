package session9.practice.bookmanagementsystem;

public class Book {

    private String title;
    //    private List<Author> author;
//    private String genre;
//    private String ISBN;
    //   private int numberPages;
    private float price;
//    private int selfLocation;
//    private int stock;
    //   private float discount;
//    private String bookPublisher;
//    private LocalDate publishedDate;

    public Book() {
    }

    public Book(String title, float price) {
        this.title = title;
        this.price = price;
    }

    void printBookInfo() {
        System.out.println("Book title: " + title);
        System.out.println("Book price: " + price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}