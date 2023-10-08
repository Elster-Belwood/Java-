package Student;

public class score extends student{
    private int math_score;
    private int chinese_score;
    private int english_score;

    public score (){}

    public int getMath_score() {
        return math_score;
    }
    public void setMath_score(int math_score) {
        if(math_score <= 100 && math_score >= 0){
            this.math_score = math_score;
        }else{
            System.out.println("Error");
        }
    }
    public int getChinese_score() {
        return chinese_score;
    }
    public void setChinese_score(int chinese_score) {
        if(chinese_score <= 100 && chinese_score >= 0){
            this.chinese_score = chinese_score;
        }else{
            System.out.println("Error");
        }
    }
    public int getEnglish_score() {
        return english_score;
    }
    public void setEnglish_score(int english_score) {
        if(english_score <= 100 && english_score >= 0){
            this.english_score = english_score;
        }else{
            System.out.println("Error");
        }
    }
}
