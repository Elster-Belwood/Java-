package Student;

public class student {
    private String name;
    private String number;
    private int age;

    public student(){}

    public void setName(String name){
        this.name = name;
    }
    public void setNumber(String number){
        boolean isnumber = number.length() == 6;
        if(isnumber){
            if(isAllDigits(number)){
                this.number = number;
            }
            else{
                System.out.println("The size of student number is false");
            }
        }
        else{
            System.out.println("The length of student number is false");
        }
    }
    private boolean isAllDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public void setAge(int age){
        if(age<=20 && age>=14){
        this.age = age;
        }else {
            System.out.println("The age of student is false");
        }
    }
    public String getName(){
        return this.name;
    }
    public String getNumber(){
        return this.number;
    }
    public int getAge(){
        return this.age;
    }

}
