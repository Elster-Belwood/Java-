
public class books{
    public static void main(String[] args) {
        book Anna_Karenina = new book();
        Anna_Karenina.name = "Anna_Karenina";
        Anna_Karenina.book_number = "000001";
        Anna_Karenina.type = "Novel";
        Anna_Karenina.author = "Leo_Tolstoy";
        Anna_Karenina.borrowers = "Elster_Belwood";
        Anna_Karenina.words_number = 607000;
        print(Anna_Karenina);
    }
    public static void print(book Anna_Karenina) {
        System.out.println(Anna_Karenina.name);
        System.out.println(Anna_Karenina.book_number);
        System.out.println(Anna_Karenina.type);
        System.out.println(Anna_Karenina.author);
        System.out.println(Anna_Karenina.borrowers);
        System.out.println(Anna_Karenina.words_number);
    }
}

class book {
    public String name;
    public String book_number;
    public String type;
    public String author;
    public String borrowers;
    public int words_number;
}