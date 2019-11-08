public class Main {

    public static void main(String[] args){

        boolean result= NumberOfDaysInMonth.isLeapYear(1600);
        System.out.println(result);

        int resultDays = NumberOfDaysInMonth.getDaysInMonth(1, 2020);
        System.out.println(resultDays);
    }
}
