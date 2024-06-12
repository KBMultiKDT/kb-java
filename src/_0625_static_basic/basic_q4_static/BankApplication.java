package _0625_static_basic.basic_q4_static;

import java.util.Scanner;

public class BankApplication {
        private static Account[] accounts = new Account[100];
        private static int count = 0;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                printMenu();
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        createAccount(scanner);
                        break;
                    case 2:
                        printAllAccounts();
                        break;
                    case 3:
                        searchAccounts(scanner);
                        break;
                    case 4:
                        deleteAccount(scanner);
                        break;
                    case 5:
                        System.out.println("프로그램을 종료합니다.");
                        running = false;
                        break;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            }
            scanner.close();
        }

        private static void createAccount(Scanner scanner) {
            System.out.println("새 계좌 정보를 입력하세요. (형식: 계좌번호 소유자 잔액)");
            String accountNumber = scanner.next();
            String ownerName = scanner.next();
            int balance = scanner.nextInt();
            accounts[count++] = new Account(accountNumber, ownerName, balance);
            System.out.println("계좌가 생성되었습니다.");
        }

        private static void printAllAccounts() {
            System.out.println("\n저장된 모든 계좌 정보를 출력합니다.");
            for (int i = 0; i < count; i++) {
                accounts[i].printAccountInfo();
            }
        }

        private static void searchAccounts(Scanner scanner) {
            System.out.println("검색할 계좌번호를 입력하세요:");
            String accountNumber = scanner.next();
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (accounts[i].getAccountNumber().equals(accountNumber)) {
                    accounts[i].printAccountInfo();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("계좌를 찾을 수 없습니다.");
            }
        }

        private static void deleteAccount(Scanner scanner) {
            System.out.println("삭제할 계좌번호를 입력하세요:");
            String accountNumber = scanner.next();
            for (int i = 0; i < count; i++) {
                if (accounts[i].getAccountNumber().equals(accountNumber)) {
                    System.arraycopy(accounts, i + 1, accounts, i, count - i - 1);
                    count--;
                    System.out.println("계좌가 삭제되었습니다.");
                    return;
                }
            }
            System.out.println("계좌를 찾을 수 없습니다.");
        }

    public static void printMenu() {
        System.out.println("\n은행 계좌 관리 애플리케이션");
        System.out.println("1. 계좌 생성");
        System.out.println("2. 계좌 목록 보기");
        System.out.println("3. 계좌 정보 검색");
        System.out.println("4. 계좌 삭제");
        System.out.println("5. 프로그램 종료");
        System.out.print("메뉴를 선택하세요: ");
    }

}

