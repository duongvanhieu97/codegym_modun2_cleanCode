package demo2;
//Nhằm đưa các nghiệp vụ vào trong order chứ không đưa ra main để xử lý
public class Order {
    private String status;

    public Order() {
    }

    public Order(String status) {
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status ;
    }
//    Magic String
//    Chuỗi này có thể tách hàm "paid" -> refactor -> Extra Method để tách chuỗi
//    public boolean isPaid() {
//        return "paid".equals(this.status);
//    }
}
