import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account("techmaster", "hoclacoviec", 1000000);

        firstLap(acc,sc);
    }

//    vong lap 1
    public static void firstLap (Account acc, Scanner sc) {
        boolean turn = true;
        while (turn == true) {
            System.out.printf("Hãy nhập username: ");
            String ipuser = sc.nextLine();
            System.out.printf("Hãy nhập password: ");
            String ippassword = sc.nextLine();
            if ( ipuser.equals(acc.username) && ippassword.equals(acc.password)){
                secondLap(sc, ipuser, ippassword, acc);
                turn = false;
            }
            else{
                System.out.println("Username hoặc Password sai, yêu cầu đăng nhập lại!");
            }
        }
    }

//     vong lap 2
    public static boolean secondLap(Scanner sc, String ipuser, String ippassword, Account acc) {
        boolean turn = true;
        while (turn == true) {
            System.out.println("-Mời bạn chọn: \n  1. Xem thông tin tài khoản\n  2. Rút tiền");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                System.out.println("user name: " + acc.username);
                System.out.println("password: " + acc.password);
                turn = false;
                thirdlap(sc, ipuser, ippassword, acc);
                }
            else if (choice == 2) {
                System.out.println("Số dư trong tài khoản: " + acc.balance);
                turn = false;
                thirdlap(sc, ipuser, ippassword, acc);
            }
            else {
                    System.out.println("Không có lựa chọn này xin lựa chọn lại");
            }

        }
    return turn;
    }

//    vong lap 3
    public static void thirdlap (Scanner sc, String ipuser, String ippassword, Account acc) {
        boolean turn = true;
        while (turn == true) {
            System.out.println("Bạn có muốn tiếp tục không? (Y/N)");
            String answer = sc.nextLine();
            if (answer.equals("Y")) {
                turn = false;
                secondLap(sc, ipuser, ippassword, acc);
            }
            else if (answer.equals("N")) {
                turn = false;
            }
            else {
                System.out.println("Vui lòng chỉ chọn Y hoặc N");
            }
        }
    }
}
