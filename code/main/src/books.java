
public class books{
    public static void main(String[] args) {
        //无参构造
        book Anna_Karenina = new book();
        book War_And_Peace = new book();
        //带参构造
        book Resurrection = new book("Resurrection","000003","Leo_Tolstoy");
        //封装
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
    //打印
    public static void print(book A) {
        System.out.println("\n"+A.getBook_number());
        System.out.println(A.getName());
        System.out.println(A.getAuthor());

    }
}

class book {
    private String name;
    private String book_number;
    private String author;
    //无参构造
    public book(){}
    //带参构造
    public book(String name,String book_number,String author){
        this.name = name;
        //判断book_number是否为六位字符串&全数字结构
        boolean isbook_number = book_number.length() == 6;
        if(isbook_number){
            if(isAllDigits(book_number)){
                this.book_number = book_number;
            }
            else{
                System.out.println("The size of book number is false");
            }
        }
        else{
            System.out.println("The length of book number is false");
        }
        this.author = author;
    }
    //判断字符串是否全为数字的函数
    public boolean isAllDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    //封装
    public void setName(String name){
        this.name = name;
    }
    public void setBook_number(String book_number){
        boolean isbook_number = book_number.length() == 6;
        if(isbook_number){
            if(isAllDigits(book_number)){
                this.book_number = book_number;
            }
            else{
                System.out.println("The size of book number is false");
            }
        }
        else{
            System.out.println("The length of book number is false");
        }
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

