
public class books{
    public static void main(String[] args) {
        book Anna_Karenina = new book();
        book War_And_Peace = new book();
        book Resurrection = new book("Resurrection","000003","Leo_Tolstoy");
        Anna_Karenina.setName("Anna_Karenina");
        Anna_Karenina.setBook_number("000001");
        Anna_Karenina.setAuthor("Leo_Tolstoy");
        War_And_Peace.setName("War_And_Peace");
        War_And_Peace.setBook_number("000002");
        War_And_Peace.setAuthor("Leo_Tolstoy");
        print(Anna_Karenina);
        print(War_And_Peace);
        print(Resurrection);
    }
    public static void print(book A) {
        System.out.println("\t");
        System.out.println(A.getBook_number());
        System.out.println(A.getName());
        System.out.println(A.getAuthor());

    }
}

class book {
    public String name;
    public String book_number;
    public String author;

    public book(){
    }
    public book(String name,String book_number,String author){
        this.name = name;
        this.book_number = book_number;
        this.author = author;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBook_number(String number){
        this.book_number = number;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getName(){
        return this.name;
    }
    public String getBook_number(){
        return this.book_number;
    }
    public String getAuthor(){
        return this.author;
    }
}

