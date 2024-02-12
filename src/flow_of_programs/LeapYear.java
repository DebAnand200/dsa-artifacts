package flow_of_programs;

public class LeapYear {
    //Input a year and find whether it is a leap year or not.

    public static void main(String[] args){
        int year = 2048;
        System.out.println(year + " is a Leap Year ? " + isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        //Optimized
        if((year % 400 == 0) || (year % 4==0) && (year%100!=0)){
            return true;
        }else{
            return false;
        }
        //Nested if Else
//            if(year % 4 == 0){
//                if (year%100 == 0) {
//                    if (year%400 == 0){
//                        return true;
//                    }else{
//                        return false;
//                    }
//                }else{
//                    return true;
//                }
//            }else{
//                return false;
//            }

    }

}
