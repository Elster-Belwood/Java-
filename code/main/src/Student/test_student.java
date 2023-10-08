package Student;

public class test_student {
    public static void main(String[] args) {
        score s1 = new score();
        s1.setName("Wang_Ming");
        s1.setNumber("000001");
        s1.setAge(19);
        s1.setMath_score(89);
        s1.setChinese_score(93);
        s1.setEnglish_score(82);
        print(s1);
    }
    public static void print(score A){
        System.out.println(A.getName());
        System.out.println(A.getNumber());
        System.out.println(A.getAge());
        System.out.println("\n"+A.getMath_score());
        System.out.println(A.getChinese_score());
        System.out.println(A.getEnglish_score());
    }
}
