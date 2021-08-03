
import java.util.Date;



public class Item {
    
    private String Author,Type,Language,Title,ItemID,Publisher;
    private int NCopies,NCopiesB,NCopiesA,ISBN;
    private Date PublishedDate;

    public Item(String Author, String Type, String Language, String Title, String ItemID, String Publisher, int NCopies, int NCopiesB, int NCopiesA, int ISBN) {
        this.Author = Author;
        this.Type = Type;
        this.Language = Language;
        this.Title = Title;
        this.ItemID = ItemID;
        this.Publisher = Publisher;
        this.NCopies = NCopies;
        this.NCopiesB = NCopiesB;
        this.NCopiesA = NCopiesA;
        this.ISBN = ISBN;
       
    }

    public Item() {
    }

  

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }

 

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getNCopies() {
        return NCopies;
    }

    public void setNCopies(int NCopies) {
        this.NCopies = NCopies;
    }

    public int getNCopiesB() {
        return NCopiesB;
    }

    public void setNCopiesB(int NCopiesB) {
        this.NCopiesB = NCopiesB;
    }

    public int getNCopiesA() {
        return NCopiesA;
    }

    public void setNCopiesA(int NCopiesA) {
        this.NCopiesA = NCopiesA;
    }

    public Date getPublishedDate() {
        return PublishedDate;
    }

    public void setPublishedDate(Date PublishedDate) {
        this.PublishedDate = PublishedDate;
    }
    
    public void FindItem(String Title,String ItemID){
        System.out.println();
    }
}
