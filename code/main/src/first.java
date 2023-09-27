public class first {
    public static void main(String[] args) {
        int mouth = (int)(Math.random()*13)+1;
        System.out.println(mouth+" mouth");
        if (mouth<7){
            System.out.println("first half of a year");
        }else if (mouth<13){
            System.out.println("second half of a year");
        }else {
            System.out.println("Error, the mouth doesn't in the year");
        }
        switch (mouth){
            case 1: case 2: case 3:
                System.out.println("1st quarter");
                break;
            case 4: case 5: case 6:
                System.out.println("2nd quarter");
                break;
            case 7: case 8: case 9:
                System.out.println("3rd quarter");
                break;
            case 10: case 11: case 12:
                System.out.println("4th quarter");
                break;
            default:
                System.out.println("Error, the mouth doesn't in any quarter");
                break;
        }
        int day =0;
        switch (mouth){
            case 1,3,5,7,8,10,12:
                while (day<31){
                    day++;
                    System.out.println("today is: "+day);
                }
                System.out.println("This mouth have "+day+" day");
                break;
            case 4,6,9,11:
                while (day<30){
                    day++;
                    System.out.println("today is: "+day);
                }
                System.out.println("This mouth have "+day+" day");
                break;
            case 2:
                while (day<28){
                    day++;
                    System.out.println("today is: "+day);
                }
                System.out.println("This mouth have "+day+" day");
                break;
            default:
                System.out.println("Error, this mouth doean't have day");
                break;
        }
    }
}
