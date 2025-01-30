abstract class LibraryItem {
    public abstract String getBarcode();
    public abstract String getTitle();
    public abstract int getLoanPeriod();
    public abstract void checkout(String borrowerName);
}

class Book extends LibraryItem {
    private String barcode, title;
    public Book(String barcode, String title) {
        this.barcode = barcode;
        this.title = title;
    }
    @Override
    public String getBarcode() { 
        return barcode; 
    }
    @Override
    public String getTitle() { 
        return title; 
    }
    @Override
    public int getLoanPeriod() {
         return 21; 
    }
    @Override
    public void checkout(String borrowerName) {
        System.out.println(title + " checked out by " + borrowerName);
    }
}

class Audiobook extends LibraryItem {
    private String barcode, title;
    public Audiobook(String barcode, String title) {
        this.barcode = barcode;
        this.title = title;
    }
    @Override
    public String getBarcode() { 
        return barcode; 
    }
    @Override
    public String getTitle() { 
        return title; 
    }
    @Override
    public int getLoanPeriod() { 
        return 14; 
    }
    @Override
    public void checkout(String borrowerName) {
        System.out.println(title + " audiobook checked out by " + borrowerName);
    }
}

class DVD extends LibraryItem {
    private String barcode, title;
    public DVD(String barcode, String title) {
        this.barcode = barcode;
        this.title = title;
    }
    @Override
    public String getBarcode() { 
        return barcode; 
    }
    @Override
    public String getTitle() { 
        return title; 
    }
    @Override
    public int getLoanPeriod() { 
        return 7; 
    }
    @Override
    public void checkout(String borrowerName) {
        System.out.println(title + " DVD checked out by " + borrowerName);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B001234", "The Hitchhiker's Guide to the Galaxy"),
            new Audiobook("A009876", "Moby Dick"),
            new DVD("D005432", "The Shawshank Redemption")
        };
        
        for (LibraryItem item : items) {
            System.out.println("Barcode: " + item.getBarcode() + ", Title: " + item.getTitle() + ", Loan Period: " + item.getLoanPeriod() + " days");
            item.checkout("John Doe");
        }
    }
}
