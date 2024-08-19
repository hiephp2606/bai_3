import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        default input
        String username = "techmaster";
        String password = "hoclacoviec";
        int balance = 1000000;
        Scanner sc = new Scanner(System.in);
        boolean turn = true;



//        system
        while (turn == true) {
            //        insert input
            System.out.printf("Hãy nhập username: ");
            String ipuser = sc.nextLine();
            System.out.printf("Hãy nhập password: ");
            String ippassword = sc.nextLine();
            if (ipuser.equals(username) && ippassword.equals(password)) {
                system(sc, ipuser, ippassword, username, password, balance );
                turn = false;
            }
            else {
                System.out.println("Username hoặc Password sai, yêu cầu đăng nhập lại!");
            }
        }
    }


//      system
    public static boolean system(Scanner sc, String ipuser, String ippassword, String username, String password, int balance) {
        boolean turn = true;
        while (turn == true) {
            System.out.println("-Mời bạn chọn: \n  1. Xem thông tin tài khoản\n  2. Rút tiền");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                System.out.println("user name: " + username);
                System.out.println("password: " + password);
                }
            else if (choice == 2) {
                System.out.println("Số dư trong tài khoản: " + balance);
            }
            else {
                    System.out.println("Không có lựa chọn này xin lựa chọn lại");
                    turn = true;
            }
            System.out.println("Bạn có muốn tiếp tục không? (Y/N)");
            String answer = sc.nextLine();
            if (answer.equals("Y")) {}
            else if (answer.equals("N")) {
                turn = false;
            }
            else {
                System.out.println("Vui lòng chỉ chọn Y hoặc N");
            }
        }
    return turn;
    }
}
