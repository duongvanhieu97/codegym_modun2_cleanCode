package Demo1;
//clean code để không dùng chung 2 công việc vào 1 phương thức
public class MonthInYear {
    public static int getDaysOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 11:
            case 9:
                return 30;
            case 2:
                boolean flag = false;
//                Dùng Refactor chọn Extract Method dùng để đưa điều kiện ra khỏi function
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            flag = true;
                        }
                    }
                    flag = true;
                }
                if (flag) {
                    return 29;
                } else {
                    return 28;
                }
            default:throw new RuntimeException("Invalid month");

        }
    }
}
