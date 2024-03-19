import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Employee's program...");
        String functions = "1. Developer's functions.\n"
                        + "2. Manager's functions\n"
                        + "For exit to press q";
        System.out.println("...Functions...");
        System.out.println(functions);

        while (true) {
            System.out.print("Choose function: ");
            String func = scanner.nextLine();


            if (func.equals("q")) {
                System.out.println("Exiting....");
                break;
            } else if (func.equals("1")) {

                Developer developer = new Developer("Qurban", "Heydarov", 777, "Java, Python, JavaScript");
                String developer_function = "1. Format it\n" +
                                            "2. Show infos\n" +
                                            "3. Exiting for press q";
                System.out.println(developer_function);
                while (true) {
                    System.out.print("Choose Developer Function: ");
                    String a_function = scanner.nextLine();
                    if (a_function.equals("q")){
                        System.out.println("Exiting developer functions....");
                        break;
                    } else if (a_function.equals("1")) {
                        System.out.print("Operating System : ");
                        String system = scanner.nextLine();
                        developer.formatting(system);
                    } else if (a_function.equals("2")) {
                        developer.showInfo();

                    }else {
                        System.out.println("Wrong developer function");
                    }
                }
                
            } else if (func.equals("2")) {
                Manager manager = new Manager("Azer", "Azerov", 123, 10);
                System.out.println("...Manager Functions...");
                String manager_function = "1. give a raise\n" +
                        "2. Show infos\n" +
                        "3. Exiting for press q";
                System.out.println(manager_function);
                while (true) {
                    System.out.print("Choose Function: ");
                    String a_function = scanner.nextLine();
                    if (a_function.equals("q")){
                        System.out.println("Exiting manager functions....");
                        break;
                    } else if (a_function.equals("1")) {
                        System.out.print("How much? : ");
                        int got_raise = scanner.nextInt();
                        scanner.nextLine();
                        manager.get_a_raise(got_raise);
                    } else if (a_function.equals("2")) {
                        manager.showInfo();

                    }else {
                        System.out.println("Wrong manager function");
                    }
                }
                
            }else {
                System.out.println("Wrong function....");
            }
        }




    }

}