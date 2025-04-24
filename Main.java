import java.util.*;

class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> balances = new ArrayList<>();

        while (true) {
            System.out.println("\n1 -> Add Customer");
            System.out.println("2 -> Change Customer Name");
            System.out.println("3 -> Check Account Balance");
            System.out.println("4 -> Update Account Balance");
            System.out.println("5 -> Summary of All Accounts");
            System.out.println("6 -> Quit");

            System.out.print("\nEnter your option to proceed ahead: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                sc.nextLine(); // consume invalid input
                continue;
            }

            int option = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (option) {
                case 1:
                    System.out.println("Add Customer Menu");
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Opening Balance: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid balance. Please enter a numeric value.");
                        sc.nextLine();
                        break;
                    }
                    int balance = sc.nextInt();
                    sc.nextLine();
                    names.add(name);
                    balances.add(balance);
                    System.out.println("Customer added successfully with Account Number: " + (names.size() - 1));
                    break;

                case 2:
                    System.out.println("Change Customer Name Menu");
                    System.out.print("Enter your Account Number: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a numeric account number.");
                        sc.nextLine();
                        break;
                    }
                    int index2 = sc.nextInt();
                    sc.nextLine();
                    if (index2 >= 0 && index2 < names.size()) {
                        System.out.print("Enter New Customer Name: ");
                        String newName = sc.nextLine();
                        names.set(index2, newName);
                        System.out.println("Customer name updated successfully.");
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;

                case 3:
                    System.out.println("Check Account Balance Menu");
                    System.out.print("Enter your Account Number: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a numeric account number.");
                        sc.nextLine();
                        break;
                    }
                    int index3 = sc.nextInt();
                    if (index3 >= 0 && index3 < balances.size()) {
                        System.out.println("Account Holder: " + names.get(index3));
                        System.out.println("Current Balance: " + balances.get(index3));
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;

                case 4:
                    System.out.println("Update Account Balance Menu");
                    System.out.print("Enter your Account Number: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a numeric account number.");
                        sc.nextLine();
                        break;
                    }
                    int index4 = sc.nextInt();
                    if (index4 >= 0 && index4 < balances.size()) {
                        System.out.print("Enter New Balance: ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid balance. Please enter a numeric value.");
                            sc.nextLine();
                            break;
                        }
                        int newBalance = sc.nextInt();
                        balances.set(index4, newBalance);
                        System.out.println("Balance updated successfully.");
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;

                case 5:
                    System.out.println("Summary of All Accounts");
                    for (int i = 0; i < names.size(); i++) {
                        System.out.println("Account Number: " + i + ", Name: " + names.get(i) + ", Balance: " + balances.get(i));
                    }
                    break;

                case 6:
                    System.out.println("Exiting... Thank you for using the bank system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 6.");
                    break;
            }
        }
    }
}
