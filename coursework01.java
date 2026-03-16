import java.util.Scanner;

class coursework01 {

    public static String student_ID[] = new String[0];

    public static String student_Name[] = new String[0];

    public static int student_PF_Marks[] = new int[0];

    public static int student_dBMS_Marks[] = new int[0];

    public static int total_Marks_For_07[] = new int[0];

    public static int total_Marks_For_08[] = new int[0];

    public static int ranks_For_07[] = new int[0];

    public static int ranks_For_08[] = new int[0];

    public static int max = Integer.MIN_VALUE;

    public static int check_Rank = 1;

    public static int max_01 = Integer.MIN_VALUE;

    public static int previous_Max = Integer.MIN_VALUE;

    public static int previous_Max_01 = Integer.MIN_VALUE;

    public static int rank = 1;

    public static int rank_01 = 1;

    public static double Average_For_08[] = new double[0];

    public static int student_PF_Marks_Rank_Array_For_09[] = new int[0];

    public static int previous_Max_02 = Integer.MIN_VALUE;

    public static int max_02 = Integer.MIN_VALUE;

    public static int rank_02 = 1;

    public static int check_Rank_01 = 1;

    public static int student_DBMS_Marks_Rank_Array_For_10[] = new int[0];

    public static int previous_Max_03 = Integer.MIN_VALUE;

    public static int max_03 = Integer.MIN_VALUE;

    public static int rank_03 = 1;

    public static int check_Rank_02 = 1;

    public static void main(String[] args) {

        clearConsole();

        print_Home_Page();

        ask_For_Option();

    }

    public static void print_Home_Page() {

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|                     WELCOME TO GDSE MARKS MANAGEMENT SYSTEM                     |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("[1] Add New Student                        [2]  Add New Student with Marks");
        System.out.println("[3] Add Marks                              [4]  Update Student Details");
        System.out.println("[5] Update Marks                           [6]  Delete Student");
        System.out.println("[7] Print Student Details                  [8]  Print Student Ranks");
        System.out.println("[9] Best in Programming Fundamentals       [10] Best in Database Management Systems");
        System.out.println();

    }

    public static void ask_For_Option() {

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter an option to continue > ");
        int feed_01 = input1.nextInt();

        check_The_Validation_Of_Option_Input(feed_01);

    }

    public static void check_The_Validation_Of_Option_Input(int feed_01) {

        if (feed_01 == 1) {

            clearConsole();
            view_The_Option(feed_01);

        } else if (feed_01 == 2) {

            clearConsole();
            view_The_Option(feed_01);

        } else if (feed_01 == 3) {

            clearConsole();
            view_The_Option(feed_01);

        } else if (feed_01 == 4) {

            clearConsole();
            view_The_Option(feed_01);

        } else if (feed_01 == 5) {

            clearConsole();
            view_The_Option(feed_01);

        } else if (feed_01 == 6) {

            clearConsole();
            view_The_Option(feed_01);

        } else if (feed_01 == 7) {

            clearConsole();
            view_The_Option(feed_01);

        } else if (feed_01 == 8) {

            clearConsole();
            view_The_Option(feed_01);

        } else if (feed_01 == 9) {

            clearConsole();
            view_The_Option(feed_01);

        } else if (feed_01 == 10) {

            clearConsole();
            view_The_Option(feed_01);

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            ask_For_Option();

        }

    }

    public static void view_The_Option(int feed_01) {

        switch (feed_01) {

            case 1:

                add_New_Student();
                break;

            case 2:

                add_New_Student_With_Marks();
                break;

            case 3:

                add_Marks();
                break;

            case 4:

                update_Student_Details();
                break;

            case 5:

                update_Marks();
                break;

            case 6:

                delete_Student();
                break;

            case 7:

                print_Student_Details();
                break;

            case 8:

                print_Student_Ranks();
                break;

            case 9:

                best_in_Programming_Fundamentals();
                break;

            case 10:

                best_In_Database_Management_Systems();
                break;

        }

    }

    public final static void clearConsole() {

        try {

            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {

                new ProcessBuilder("cmd", "/c",
                        "cls").inheritIO().start().waitFor();

            } else {

                System.out.print("\033[H\033[2J");
                System.out.flush();

            }

        } catch (final Exception e) {

            e.printStackTrace();

        }

    }

    public static void add_New_Student() {

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|                                 ADD NEW STUDENT                                 |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

        input_Student_ID();

    }

    public static void input_Student_ID() {

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter Student ID           : ");
        String input_Student_ID = input2.nextLine();

        boolean isDuplicate = check_Duplicate_ID(input_Student_ID);

        if (isDuplicate) {

            input_Student_ID();

        } else {

            save_New_Student_ID(input_Student_ID);

        }

    }

    public static boolean check_Duplicate_ID(String input_Student_ID) {

        boolean isDuplicate = false;

        for (int i = 0; i < student_ID.length; i++) {

            if (input_Student_ID.equals(student_ID[i])) {

                isDuplicate = true;
                System.out.println("The student ID already exists!");
                System.out.println();

            }

        }

        return isDuplicate;

    }

    public static void save_New_Student_ID(String input_Student_ID) {

        String temp[] = new String[student_ID.length + 1];

        for (int i = 0; i < student_ID.length; i++) {

            temp[i] = student_ID[i];

        }

        temp[temp.length - 1] = input_Student_ID;

        student_ID = temp;

        input_Student_Name();

    }

    public static void input_Student_Name() {

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter Student Name         : ");
        String input_Student_Name = input3.nextLine();

        System.out.println();

        save_New_Student_Name(input_Student_Name);

    }

    public static void save_New_Student_Name(String input_Student_Name) {

        String temp[] = new String[student_Name.length + 1];

        for (int i = 0; i < student_Name.length; i++) {

            temp[i] = student_Name[i];

        }

        temp[temp.length - 1] = input_Student_Name;

        student_Name = temp;

        System.out.println("Student has been added successfully!");
        System.out.println();

        increase_PF_Marks_Array();
        increase_DBMS_Marks_Array();

        return_To_Home_Page_Or_Continue();

    }

    public static void return_To_Home_Page_Or_Continue() {

        System.out.print("Do you want to add a new student (Y / N) > ");

        Scanner input4 = new Scanner(System.in);
        String feed_02 = input4.nextLine();

        System.out.println();

        process_HomePage(feed_02);

    }

    public static void process_HomePage(String feed_02) {

        if (feed_02.equals("Y")) {

            clearConsole();
            add_New_Student();

        }

        if (feed_02.equals("N")) {

            clearConsole();
            print_Home_Page();
            ask_For_Option();

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            return_To_Home_Page_Or_Continue();

        }

    }

    public static void increase_PF_Marks_Array() {

        int temp[] = new int[student_PF_Marks.length + 1];

        for (int i = 0; i < student_PF_Marks.length; i++) {

            temp[i] = student_PF_Marks[i];

        }

        temp[temp.length - 1] = -1;

        student_PF_Marks = temp;

    }

    public static void increase_DBMS_Marks_Array() {

        int temp[] = new int[student_dBMS_Marks.length + 1];

        for (int i = 0; i < student_dBMS_Marks.length; i++) {

            temp[i] = student_dBMS_Marks[i];

        }

        temp[temp.length - 1] = -1;

        student_dBMS_Marks = temp;

    }

    public static void add_New_Student_With_Marks() {

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|                            ADD NEW STUDENT WITH MARKS                           |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

        input_Student_ID_01();

    }

    public static void input_Student_ID_01() {

        Scanner input5 = new Scanner(System.in);
        System.out.print("Enter Student ID           : ");
        String input_Student_ID = input5.nextLine();

        boolean isDuplicate01 = check_Duplicate_ID_01(input_Student_ID);

        if (isDuplicate01) {

            input_Student_ID_01();

        } else {

            save_New_Student_ID_01(input_Student_ID);

        }

    }

    public static boolean check_Duplicate_ID_01(String input_Student_ID) {

        boolean isDuplicate = false;

        for (int i = 0; i < student_ID.length; i++) {

            if (input_Student_ID.equals(student_ID[i])) {

                isDuplicate = true;
                System.out.println("The student ID already exists!");
                System.out.println();

            }

        }

        return isDuplicate;

    }

    public static void save_New_Student_ID_01(String input_Student_ID) {

        String temp[] = new String[student_ID.length + 1];

        for (int i = 0; i < student_ID.length; i++) {

            temp[i] = student_ID[i];

        }

        temp[temp.length - 1] = input_Student_ID;

        student_ID = temp;

        input_Student_Name_01();

    }

    public static void input_Student_Name_01() {

        Scanner input6 = new Scanner(System.in);
        System.out.print("Enter Student Name         : ");
        String input_Student_Name = input6.nextLine();

        System.out.println();

        save_New_Student_Name_01(input_Student_Name);

    }

    public static void save_New_Student_Name_01(String input_Student_Name) {

        String temp[] = new String[student_Name.length + 1];

        for (int i = 0; i < student_Name.length; i++) {

            temp[i] = student_Name[i];

        }

        temp[temp.length - 1] = input_Student_Name;

        student_Name = temp;

        input_Programming_Fundamentals_Marks();

    }

    public static void input_Programming_Fundamentals_Marks() {

        Scanner input7 = new Scanner(System.in);
        System.out.print("Enter Programming Fundamentals Marks   : ");
        int pF_Marks = input7.nextInt();

        check_Validation_Of_Marks(pF_Marks);

    }

    public static void check_Validation_Of_Marks(int pF_Marks) {

        if (0 <= pF_Marks && pF_Marks <= 100) {

            save_PF_Marks(pF_Marks);

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            input_Programming_Fundamentals_Marks();

        }

    }

    public static void save_PF_Marks(int pF_Marks) {

        int temp[] = new int[student_PF_Marks.length + 1];

        for (int i = 0; i < student_PF_Marks.length; i++) {

            temp[i] = student_PF_Marks[i];

        }

        temp[temp.length - 1] = pF_Marks;

        student_PF_Marks = temp;

        input_Database_Management_System_Marks();

    }

    public static void input_Database_Management_System_Marks() {

        Scanner input8 = new Scanner(System.in);
        System.out.print("Enter Database Management System Marks : ");
        int dBMS_Marks = input8.nextInt();

        check_Validation_Of_Marks_01(dBMS_Marks);

    }

    public static void check_Validation_Of_Marks_01(int dBMS_Marks) {

        if (0 <= dBMS_Marks && dBMS_Marks <= 100) {

            save_DBMS_Marks(dBMS_Marks);

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            input_Database_Management_System_Marks();

        }

    }

    public static void save_DBMS_Marks(int dBMS_Marks) {

        int temp[] = new int[student_dBMS_Marks.length + 1];

        for (int i = 0; i < student_dBMS_Marks.length; i++) {

            temp[i] = student_dBMS_Marks[i];

        }

        temp[temp.length - 1] = dBMS_Marks;

        student_dBMS_Marks = temp;

        System.out.println();
        System.out.println("Student has been added successfully!");
        System.out.println();

        return_To_Home_Page_Or_Continue_01();

    }

    public static void return_To_Home_Page_Or_Continue_01() {

        System.out.print("Do you want to add a new student with marks (Y / N) > ");

        Scanner input9 = new Scanner(System.in);
        String feed_03 = input9.nextLine();

        process_HomePage_01(feed_03);

    }

    public static void process_HomePage_01(String feed_03) {

        if (feed_03.equals("Y")) {

            clearConsole();
            add_New_Student_With_Marks();

        }

        if (feed_03.equals("N")) {

            clearConsole();
            print_Home_Page();
            ask_For_Option();

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            return_To_Home_Page_Or_Continue_01();

        }

    }

    public static void add_Marks() {

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|                                    ADD MARKS                                    |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

        request_Student_ID();

    }

    public static void request_Student_ID() {

        Scanner input10 = new Scanner(System.in);
        System.out.print("Enter Student ID           : ");
        String request_Student_ID = input10.nextLine();

        boolean isDuplicate02 = check_Whether_Student_ID_Already_Exists(request_Student_ID);

        if (isDuplicate02) {

            search_Index_Of_ID(request_Student_ID);

        } else {

            System.out.println("Invalid Student ID!");
            System.out.println();

            return_To_Home_Page_Or_Continue_02();

        }

    }

    public static boolean check_Whether_Student_ID_Already_Exists(String request_Student_ID) {

        boolean is_ID_Already_Exists = false;

        for (int i = 0; i < student_ID.length; i++) {

            if (request_Student_ID.equals(student_ID[i])) {

                is_ID_Already_Exists = true;

            }

        }

        return is_ID_Already_Exists;

    }

    public static void return_To_Home_Page_Or_Continue_02() {

        System.out.print("Do you want to search again? (Y / N) > ");

        Scanner input11 = new Scanner(System.in);
        String feed_04 = input11.nextLine();

        process_HomePage_02(feed_04);

    }

    public static void process_HomePage_02(String feed_04) {

        if (feed_04.equals("Y")) {

            clearConsole();
            add_Marks();

        }

        if (feed_04.equals("N")) {

            clearConsole();
            print_Home_Page();
            ask_For_Option();

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            return_To_Home_Page_Or_Continue_02();

        }

    }

    public static void search_Index_Of_ID(String request_Student_ID) {

        int index = 0;

        for (int i = 0; i < student_ID.length; i++) {

            if (request_Student_ID.equals(student_ID[i])) {

                index = i;

            }

        }

        display_Name_Related_To_Id(index);

    }

    public static void display_Name_Related_To_Id(int index) {

        System.out.println("Student Name               : " + student_Name[index]);
        System.out.println();

        check_Whether_PF_Marks_Already_Entered_Or_Not(index);

    }

    public static void check_Whether_PF_Marks_Already_Entered_Or_Not(int index) {

        if (student_PF_Marks[index] == -1 && student_dBMS_Marks[index] == -1) {

            add_Marks_Using_Student_ID(index);

        } else {

            System.out.println("This student's marks have been already added.");
            System.out.println("If you want to update the marks, Please use [4] update marks option!");
            System.out.println();

            return_To_Home_Page_Or_Continue_03();

        }

    }

    public static void add_Marks_Using_Student_ID(int index) {

        input_Programming_Fundamentals_Marks_01(index);

    }

    public static void input_Programming_Fundamentals_Marks_01(int index) {

        Scanner input13 = new Scanner(System.in);
        System.out.print("Enter Programming Fundamentals Marks   : ");
        int pF_Marks = input13.nextInt();

        check_Validation_Of_Marks_01(pF_Marks, index);

    }

    public static void check_Validation_Of_Marks_01(int pF_Marks, int index) {

        if (0 <= pF_Marks && pF_Marks <= 100) {

            save_PF_Marks_01(pF_Marks, index);

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            input_Programming_Fundamentals_Marks_01(index);

        }

    }

    public static void save_PF_Marks_01(int pF_Marks, int index) {

        student_PF_Marks[index] = pF_Marks;

        input_Database_Management_System_Marks_01(index);

    }

    public static void input_Database_Management_System_Marks_01(int index) {

        Scanner input14 = new Scanner(System.in);
        System.out.print("Enter Database Management System Marks : ");
        int dBMS_Marks = input14.nextInt();

        check_Validation_Of_Marks_02(dBMS_Marks, index);

    }

    public static void check_Validation_Of_Marks_02(int dBMS_Marks, int index) {

        if (0 <= dBMS_Marks && dBMS_Marks <= 100) {

            save_DBMS_Marks_01(dBMS_Marks, index);

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            input_Database_Management_System_Marks_01(index);

        }

    }

    public static void save_DBMS_Marks_01(int dBMS_Marks, int index) {

        student_dBMS_Marks[index] = dBMS_Marks;

        System.out.println();
        System.out.println("Marks have been added!");
        System.out.println();

        return_To_Home_Page_Or_Continue_03();

    }

    public static void return_To_Home_Page_Or_Continue_03() {

        System.out.print("Do you want to add marks for another student? (Y / N) > ");

        Scanner input15 = new Scanner(System.in);
        String feed_05 = input15.nextLine();

        System.out.println();

        process_HomePage_03(feed_05);

    }

    public static void process_HomePage_03(String feed_03) {

        if (feed_03.equals("Y")) {

            clearConsole();
            add_Marks();

        }

        if (feed_03.equals("N")) {

            clearConsole();
            print_Home_Page();
            ask_For_Option();

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            return_To_Home_Page_Or_Continue_03();

        }

    }

    public static void update_Student_Details() {

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|                                UPDATE STUDENT DETAILS                           |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

        request_Student_ID_01();

    }

    public static void request_Student_ID_01() {

        Scanner input16 = new Scanner(System.in);
        System.out.print("Enter Student ID           : ");
        String request_Student_ID = input16.nextLine();

        boolean isDuplicate02 = check_Whether_Student_ID_Already_Exists_01(request_Student_ID);

        if (isDuplicate02) {

            search_Index_Of_ID_01(request_Student_ID);

        } else {

            System.out.println("Invalid Student ID!");
            System.out.println();

            return_To_Home_Page_Or_Continue_04();

        }

    }

    public static boolean check_Whether_Student_ID_Already_Exists_01(String request_Student_ID) {

        boolean is_ID_Already_Exists = false;

        for (int i = 0; i < student_ID.length; i++) {

            if (request_Student_ID.equals(student_ID[i])) {

                is_ID_Already_Exists = true;

            }

        }

        return is_ID_Already_Exists;

    }

    public static void search_Index_Of_ID_01(String request_Student_ID) {

        int index = 0;

        for (int i = 0; i < student_ID.length; i++) {

            if (request_Student_ID.equals(student_ID[i])) {

                index = i;

            }

        }

        display_Name_Related_To_Id_01(index);

    }

    public static void display_Name_Related_To_Id_01(int index) {

        System.out.println("Student Name               : " + student_Name[index]);
        System.out.println();

        input_New_Student_Name(index);

    }

    public static void input_New_Student_Name(int index) {

        Scanner input12 = new Scanner(System.in);
        System.out.print("Enter the new Student Name : ");
        String new_Student_Name = input12.nextLine();

        student_Name[index] = new_Student_Name;

        System.out.println();
        System.out.println("Student Details have been updated successfully!");
        System.out.println();

        return_To_Home_Page_Or_Continue_04();

    }

    public static void return_To_Home_Page_Or_Continue_04() {

        System.out.print("Do you want to update another student details? (Y / N) > ");

        Scanner input17 = new Scanner(System.in);
        String feed_06 = input17.nextLine();

        process_HomePage_04(feed_06);

    }

    public static void process_HomePage_04(String feed_06) {

        if (feed_06.equals("Y")) {

            clearConsole();
            update_Student_Details();

        }

        if (feed_06.equals("N")) {

            clearConsole();
            print_Home_Page();
            ask_For_Option();

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            return_To_Home_Page_Or_Continue_04();

        }

    }

    public static void update_Marks() {

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|                                   UPDATE MARKS                                  |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

        request_Student_ID_02();

    }

    public static void request_Student_ID_02() {

        Scanner input18 = new Scanner(System.in);
        System.out.print("Enter Student ID           : ");
        String request_Student_ID = input18.nextLine();

        boolean isDuplicate02 = check_Whether_Student_ID_Already_Exists_02(request_Student_ID);

        if (isDuplicate02) {

            search_Index_Of_ID_02(request_Student_ID);

        } else {

            System.out.println("Invalid Student ID!");
            System.out.println();

            return_To_Home_Page_Or_Continue_05();

        }

    }

    public static boolean check_Whether_Student_ID_Already_Exists_02(String request_Student_ID) {

        boolean is_ID_Already_Exists = false;

        for (int i = 0; i < student_ID.length; i++) {

            if (request_Student_ID.equals(student_ID[i])) {

                is_ID_Already_Exists = true;

            }
        }

        return is_ID_Already_Exists;

    }

    public static void search_Index_Of_ID_02(String request_Student_ID) {

        int index = 0;

        for (int i = 0; i < student_ID.length; i++) {

            if (request_Student_ID.equals(student_ID[i])) {

                index = i;

            }
        }

        display_Name_Related_To_Id_02(index);

    }

    public static void display_Name_Related_To_Id_02(int index) {

        System.out.println("Student Name               : " + student_Name[index]);
        System.out.println();

        display_Student_Current_Details(index);

    }

    public static void display_Student_Current_Details(int index) {

        if (student_PF_Marks[index] == -1 && student_dBMS_Marks[index] == -1) {

            System.out.println("This student marks yet to be added!");
            System.out.println();

            return_To_Home_Page_Or_Continue_05();

        }

        else {

            System.out.println("Programming Fundamentals Marks   : " + student_PF_Marks[index]);
            System.out.println("Database Management System Marks : " + student_dBMS_Marks[index]);
            System.out.println();

            enter_New_Marks_PF(index);

        }

    }

    public static void enter_New_Marks_PF(int index) {

        Scanner input20 = new Scanner(System.in);
        System.out.print("Enter new Programming Fundamentals Marks   : ");
        int new_PF_Marks = input20.nextInt();

        check_Whether_Marks_Are_Validated(new_PF_Marks, index);

    }

    public static void check_Whether_Marks_Are_Validated(int new_PF_Marks, int index) {

        if (0 <= new_PF_Marks && new_PF_Marks <= 100) {

            student_PF_Marks[index] = new_PF_Marks;

            enter_New_Marks_DBMS(index);

        }

        else {

            System.out.println("Please enter a valid input!");
            System.out.println();

            enter_New_Marks_PF(index);

        }

    }

    public static void enter_New_Marks_DBMS(int index) {

        Scanner input21 = new Scanner(System.in);
        System.out.print("Enter new Database Management System Marks : ");
        int new_DBMS_Marks = input21.nextInt();

        check_Whether_Marks_Are_Validated_01(new_DBMS_Marks, index);

    }

    public static void check_Whether_Marks_Are_Validated_01(int new_DBMS_Marks, int index) {

        if (0 <= new_DBMS_Marks && new_DBMS_Marks <= 100) {

            student_dBMS_Marks[index] = new_DBMS_Marks;
            System.out.println();
            System.out.println("Marks have been updated successfully!");
            System.out.println();

            return_To_Home_Page_Or_Continue_05();

        }

        else {

            System.out.println("Please enter a valid input!");
            System.out.println();

            enter_New_Marks_DBMS(index);

        }

    }

    public static void return_To_Home_Page_Or_Continue_05() {

        System.out.print("Do you want to update marks for another student? (Y / N) > ");

        Scanner input19 = new Scanner(System.in);
        String feed_07 = input19.nextLine();

        process_HomePage_05(feed_07);

    }

    public static void process_HomePage_05(String feed_07) {

        if (feed_07.equals("Y")) {

            clearConsole();
            update_Marks();

        }

        if (feed_07.equals("N")) {

            clearConsole();
            print_Home_Page();
            ask_For_Option();

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            return_To_Home_Page_Or_Continue_05();

        }

    }

    public static void delete_Student() {

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|                                  DELETE STUDENT                                 |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

        request_Student_ID_03();

    }

    public static void request_Student_ID_03() {

        Scanner input23 = new Scanner(System.in);
        System.out.print("Enter Student ID           : ");
        String request_Student_ID = input23.nextLine();

        boolean isDuplicate02 = check_Whether_Student_ID_Already_Exists_03(request_Student_ID);

        if (isDuplicate02) {

            search_Index_Of_ID_03(request_Student_ID);

        } else {

            System.out.println("Invalid Student ID!");
            System.out.println();

            return_To_Home_Page_Or_Continue_06();

        }

    }

    public static boolean check_Whether_Student_ID_Already_Exists_03(String request_Student_ID) {

        boolean is_ID_Already_Exists = false;

        for (int i = 0; i < student_ID.length; i++) {

            if (request_Student_ID.equals(student_ID[i])) {

                is_ID_Already_Exists = true;

            }

        }

        return is_ID_Already_Exists;

    }

    public static void return_To_Home_Page_Or_Continue_06() {

        System.out.print("Do you want to search again? (Y / N) > ");

        Scanner input24 = new Scanner(System.in);
        String feed_08 = input24.nextLine();

        process_HomePage_06(feed_08);

    }

    public static void process_HomePage_06(String feed_08) {

        if (feed_08.equals("Y")) {

            clearConsole();
            delete_Student();

        }

        if (feed_08.equals("N")) {

            clearConsole();
            print_Home_Page();
            ask_For_Option();

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            return_To_Home_Page_Or_Continue_06();

        }

    }

    public static void search_Index_Of_ID_03(String request_Student_ID) {

        int index = 0;

        for (int i = 0; i < student_ID.length; i++) {

            if (request_Student_ID.equals(student_ID[i])) {

                index = i;

            }

        }

        delete_Student_ID(index);

    }

    public static void delete_Student_ID(int index) {

        String temp[] = new String[student_ID.length - 1];

        for (int i = 0; i < index; i++) {

            temp[i] = student_ID[i];

        }

        for (int i = index; i < temp.length; i++) {

            temp[i] = student_ID[i + 1];

        }

        student_ID = temp;

        delete_Student_Name(index);

    }

    public static void delete_Student_Name(int index) {

        String temp[] = new String[student_Name.length - 1];

        for (int i = 0; i < index; i++) {

            temp[i] = student_Name[i];

        }

        for (int i = index; i < temp.length; i++) {

            temp[i] = student_Name[i + 1];

        }

        student_Name = temp;

        delete_PF_Marks(index);

    }

    public static void delete_PF_Marks(int index) {

        int temp[] = new int[student_PF_Marks.length - 1];

        for (int i = 0; i < index; i++) {

            temp[i] = student_PF_Marks[i];

        }

        for (int i = index; i < temp.length; i++) {

            temp[i] = student_PF_Marks[i + 1];

        }

        student_PF_Marks = temp;

        delete_DBMS_Marks(index);

    }

    public static void delete_DBMS_Marks(int index) {

        int temp[] = new int[student_dBMS_Marks.length - 1];

        for (int i = 0; i < index; i++) {

            temp[i] = student_dBMS_Marks[i];

        }

        for (int i = index; i < temp.length; i++) {

            temp[i] = student_dBMS_Marks[i + 1];

        }

        student_dBMS_Marks = temp;

        System.out.println();
        System.out.println("Student has been deleted successfully!");
        System.out.println();

        return_To_Home_Page_Or_Continue_07();

    }

    public static void return_To_Home_Page_Or_Continue_07() {

        System.out.print("Do you want to delete another student? (Y / N) > ");

        Scanner input25 = new Scanner(System.in);
        String feed_09 = input25.nextLine();

        process_HomePage_07(feed_09);

    }

    public static void process_HomePage_07(String feed_09) {

        if (feed_09.equals("Y")) {

            clearConsole();
            delete_Student();

        }

        if (feed_09.equals("N")) {

            clearConsole();
            print_Home_Page();
            ask_For_Option();

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            return_To_Home_Page_Or_Continue_07();

        }

    }

    public static void print_Student_Details() {

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|                                PRINT STUDENT DETAILS                            |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

        request_Student_ID_04();

    }

    public static void request_Student_ID_04() {

        Scanner input26 = new Scanner(System.in);
        System.out.print("Enter Student ID           : ");
        String request_Student_ID_01 = input26.nextLine();

        boolean isDuplicate02 = check_Whether_Student_ID_Already_Exists_04(request_Student_ID_01);

        if (isDuplicate02) {

            search_Index_Of_ID_04(request_Student_ID_01);

        } else {

            System.out.println("Invalid Student ID!");
            System.out.println();

            return_To_Home_Page_Or_Continue_08();

        }

    }

    public static boolean check_Whether_Student_ID_Already_Exists_04(String request_Student_ID) {

        boolean is_ID_Already_Exists = false;

        for (int i = 0; i < student_ID.length; i++) {

            if (request_Student_ID.equals(student_ID[i])) {

                is_ID_Already_Exists = true;

            }

        }

        return is_ID_Already_Exists;

    }

    public static void search_Index_Of_ID_04(String request_Student_ID) {

        int index_01 = 0;

        for (int i = 0; i < student_ID.length; i++) {

            if (request_Student_ID.equals(student_ID[i])) {

                index_01 = i;

            }

        }

        check_Whether_Marks_Are_Entered_Or_Not(index_01);

    }

    public static void check_Whether_Marks_Are_Entered_Or_Not(int index_01) {

        if (student_PF_Marks[index_01] == -1 && student_dBMS_Marks[index_01] == -1) {

            System.out.println("Student Name : " + student_Name[index_01]);
            System.out.println();

            System.out.println("Marks yet to be added!");
            System.out.println();

            return_To_Home_Page_Or_Continue_08();

        }

        else {

            print_Student_Details_As_Table(index_01);

        }

    }

    public static void return_To_Home_Page_Or_Continue_08() {

        System.out.print("Do you want to search again? (Y / N) > ");

        Scanner input22 = new Scanner(System.in);
        String feed_10 = input22.nextLine();

        System.out.println();

        process_HomePage_08(feed_10);

    }

    public static void process_HomePage_08(String feed_10) {

        if (feed_10.equals("Y")) {

            clearConsole();
            print_Student_Details();

        }

        if (feed_10.equals("N")) {

            clearConsole();
            print_Home_Page();
            ask_For_Option();

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            return_To_Home_Page_Or_Continue_08();

        }

    }

    public static void print_Student_Details_As_Table(int index_01) {

        clearConsole();

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|                                PRINT STUDENT DETAILS                            |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("Enter Student ID : " + student_ID[index_01]);
        System.out.println("Student Name     : " + student_Name[index_01]);
        System.out.println();

        System.out.println("+---------------------------------------------------------------------------------+");

        if (0 <= student_PF_Marks[index_01] && student_PF_Marks[index_01] < 10) {

            System.out
                    .println("| Programming Fundamentals Marks   |                                             "
                            + student_PF_Marks[index_01]
                            + "|");

        }

        if (10 <= student_PF_Marks[index_01] && student_PF_Marks[index_01] < 100) {

            System.out
                    .println("| Programming Fundamentals Marks   |                                            "
                            + student_PF_Marks[index_01]
                            + "|");

        }

        if (student_PF_Marks[index_01] == 100) {

            System.out
                    .println("| Programming Fundamentals Marks   |                                           "
                            + student_PF_Marks[index_01]
                            + "|");

        }

        if (0 <= student_dBMS_Marks[index_01] && student_dBMS_Marks[index_01] < 10) {

            System.out
                    .println("| Database Management System Marks |                                             "
                            + student_dBMS_Marks[index_01]
                            + "|");

        }

        if (10 <= student_dBMS_Marks[index_01] && student_dBMS_Marks[index_01] < 100) {

            System.out
                    .println("| Database Management System Marks |                                            "
                            + student_dBMS_Marks[index_01]
                            + "|");

        }

        if (student_dBMS_Marks[index_01] == 100) {

            System.out
                    .println("| Database Management System Marks |                                           "
                            + student_dBMS_Marks[index_01]
                            + "|");

        }

        int total = student_PF_Marks[index_01] + student_dBMS_Marks[index_01];

        double average = (double) total / 2;
        String avg = String.format("%.2f", average);

        if (0 <= total && total < 10) {

            System.out
                    .println("| Total Marks                      |                                             " + total
                            + "|");

        }

        if (10 <= total && total < 100) {

            System.out
                    .println("| Total Marks                      |                                            " + total
                            + "|");

        }

        if (100 <= total && total <= 200) {

            System.out
                    .println("| Total Marks                      |                                           " + total
                            + "|");

        }

        if (0 <= average && average < 10) {

            System.out
                    .println("| Average Marks                    |                                          " + avg
                            + "|");

        }

        if (10 <= average && average < 100) {

            System.out
                    .println("| Average Marks                    |                                         " + avg
                            + "|");

        }

        if (average == 100) {

            System.out
                    .println("| Average Marks                    |                                        " + avg
                            + "|");

        }

        find_Rank(index_01);

    }

    public static void find_Rank(int index_01) {

        int temp[] = new int[student_PF_Marks.length];

        for (int i = 0; i < student_PF_Marks.length; i++) {

            temp[i] = (student_PF_Marks[i] + student_dBMS_Marks[i]);

        }

        total_Marks_For_07 = temp;

        assign_Values_For_Find_Ranks_For_07_Array_01(index_01);

    }

    public static void assign_Values_For_Find_Ranks_For_07_Array_01(int index_01) {

        int temp1[] = new int[total_Marks_For_07.length];

        ranks_For_07 = temp1;

        int temp[] = new int[total_Marks_For_07.length];

        for (int i = 0; i < temp.length; i++) {

            temp[i] = total_Marks_For_07[i];

        }

        int sorted_Array_Of_Total[] = sort_Array_01(temp);

        for (int i = 0; i < total_Marks_For_07.length; i++) {

            for (int j = 0; j < total_Marks_For_07.length; j++) {

                if ((sorted_Array_Of_Total[sorted_Array_Of_Total.length - i - 1] == total_Marks_For_07[j])
                        && total_Marks_For_07[j] != previous_Max) {

                    max = total_Marks_For_07[j];
                    ranks_For_07[j] = rank;

                }
            }

            previous_Max = max;
            rank++;

        }

        rank = 1;
        max = Integer.MIN_VALUE;
        previous_Max = Integer.MIN_VALUE;

        print_Rank_Details(index_01);

    }

    public static int[] sort_Array_01(int temp[]) {

        for (int j = temp.length - 1; j >= 0; j--) {

            for (int i = 0; i < j; i++) {

                if (temp[i] > temp[i + 1]) {

                    int t1 = temp[i];
                    temp[i] = temp[i + 1];
                    temp[i + 1] = t1;

                }

            }

        }

        return temp;

    }

    public static void print_Rank_Details(int index_01) {

        int display_Rank = ranks_For_07[index_01];

        int last_Rank = Integer.MIN_VALUE;

        for (int i = 0; i < ranks_For_07.length; i++) {

            if (ranks_For_07[i] > 0 && ranks_For_07[i] > last_Rank) {

                last_Rank = ranks_For_07[i];

            }

        }

        if (0 < display_Rank && display_Rank < 10) {

            if (display_Rank == 1) {

                System.out.println("| Rank                             |                                     "
                        + display_Rank + " (First)" + "|");

            }

            if (display_Rank == 2) {

                System.out.println("| Rank                             |                                    "
                        + display_Rank + " (Second)" + "|");

            }

            if (display_Rank == 3) {

                System.out.println("| Rank                             |                                     "
                        + display_Rank + " (Third)" + "|");

            }

            if (3 < display_Rank && display_Rank < 10) {

                if (display_Rank == last_Rank) {

                    System.out.println("| Rank                             |                                      "
                            + display_Rank + " (Last)" + "|");

                }

                else {

                    System.out
                            .println("| Rank                             |                                             "
                                    + display_Rank + "|");

                }

            }

        }

        if (10 <= display_Rank && display_Rank < 100) {

            if (display_Rank == last_Rank) {

                System.out.println("| Rank                             |                                     "
                        + display_Rank + " (Last)" + "|");

            }

            else {

                System.out.println("| Rank                             |                                            "
                        + display_Rank + "|");

            }

        }

        if (100 <= display_Rank && display_Rank < 1000) {

            if (display_Rank == last_Rank) {

                System.out.println("| Rank                             |                                    "
                        + display_Rank + " (Last)" + "|");

            } else {

                System.out.println("| Rank                             |                                           "
                        + display_Rank + "|");

            }

        }

        if (1000 <= display_Rank && display_Rank < 10000) {

            if (display_Rank == last_Rank) {

                System.out.println("| Rank                             |                                   "
                        + display_Rank + " (Last)" + "|");

            }

            else {

                System.out.println("| Rank                             |                                          "
                        + display_Rank + "|");

            }

        }

        if (10000 <= display_Rank && display_Rank < 100000) {

            if (display_Rank == last_Rank) {

                System.out.println("| Rank                             |                                  "
                        + display_Rank + " (Last)" + "|");

            }

            else {

                System.out.println("| Rank                             |                                         "
                        + display_Rank + "|");

            }

        }

        if (100000 <= display_Rank && display_Rank < 1000000) {

            System.out.println(
                    "| Rank                             |                                        " + display_Rank
                            + "|");

        }

        System.out.println("+---------------------------------------------------------------------------------+");

        System.out.println();

        return_To_Home_Page_Or_Continue_09();

    }

    public static void return_To_Home_Page_Or_Continue_09() {

        System.out.print("Do you want to search again? (Y / N) > ");

        Scanner input27 = new Scanner(System.in);
        String feed_11 = input27.nextLine();

        System.out.println();

        process_HomePage_09(feed_11);

    }

    public static void process_HomePage_09(String feed_11) {

        if (feed_11.equals("Y")) {

            clearConsole();
            print_Student_Details();

        }

        if (feed_11.equals("N")) {

            clearConsole();
            print_Home_Page();
            ask_For_Option();

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            return_To_Home_Page_Or_Continue_09();

        }

    }

    public static void print_Student_Ranks() {

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|                                PRINT STUDENT RANKS                              |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

        check_Data_To_Print_Student_Ranks();

    }

    public static void check_Data_To_Print_Student_Ranks() {

        boolean iS_Mark_Added = true;

        for (int i = 0; i < student_PF_Marks.length; i++) {

            if (student_PF_Marks[i] >= 0) {

                iS_Mark_Added = false;

            }

        }

        if ((student_PF_Marks.length == 0 && student_dBMS_Marks.length == 0) || iS_Mark_Added == true) {

            System.out.println("The data has not been entered yet!");
            System.out.println("Please enter the data and try again!");

            return_To_Home_Page_Or_Continue_10();

        }

        else {

            process_Print_Student_Ranks();

        }

    }

    public static void process_Print_Student_Ranks() {

        int temp[] = new int[student_PF_Marks.length];

        for (int i = 0; i < student_PF_Marks.length; i++) {

            temp[i] = (student_PF_Marks[i] + student_dBMS_Marks[i]);

        }

        total_Marks_For_08 = temp;

        double temp1[] = new double[student_PF_Marks.length];

        for (int i = 0; i < student_PF_Marks.length; i++) {

            temp1[i] = (double) total_Marks_For_08[i] / 2;

        }

        Average_For_08 = temp1;

        validate_Marks_To_Print_Student_Ranks();

    }

    public static void validate_Marks_To_Print_Student_Ranks() {

        int temp1[] = new int[student_PF_Marks.length];

        ranks_For_08 = temp1;

        int temp[] = new int[student_PF_Marks.length];

        for (int i = 0; i < temp.length; i++) {

            temp[i] = total_Marks_For_08[i];

        }

        int sorted_Array_Of_Total_02[] = sort_Array_02(temp);

        for (int i = 0; i < student_PF_Marks.length; i++) {

            for (int j = 0; j < student_PF_Marks.length; j++) {

                if (sorted_Array_Of_Total_02[sorted_Array_Of_Total_02.length - i - 1] < 0
                        && (sorted_Array_Of_Total_02[sorted_Array_Of_Total_02.length - i
                                - 1] == total_Marks_For_08[j])) {

                    ranks_For_08[j] = 0;

                }

                if (sorted_Array_Of_Total_02[sorted_Array_Of_Total_02.length - i - 1] >= 0
                        && (sorted_Array_Of_Total_02[sorted_Array_Of_Total_02.length - i - 1] == total_Marks_For_08[j])
                        && total_Marks_For_08[j] != previous_Max_01) {

                    max_01 = total_Marks_For_08[j];
                    ranks_For_08[j] = rank_01;

                }

            }

            rank_01++;
            previous_Max_01 = max_01;

        }

        rank_01 = 1;
        max_01 = Integer.MIN_VALUE;
        previous_Max_01 = Integer.MIN_VALUE;

        filter_Rank_Details();

    }

    public static int[] sort_Array_02(int temp[]) {

        for (int j = temp.length - 1; j >= 0; j--) {

            for (int i = 0; i < j; i++) {

                if (temp[i] > temp[i + 1]) {

                    int t2 = temp[i];
                    temp[i] = temp[i + 1];
                    temp[i + 1] = t2;

                }

            }

        }

        return temp;

    }

    public static void filter_Rank_Details() {

        System.out.println(
                "+----------+--------------+-----------------------------+-------------+-----------+");
        System.out.println(
                "|Rank      |ID            |Name                         |Total Marks  |Avg. Marks |");
        System.out.println(
                "+----------+--------------+-----------------------------+-------------+-----------+");

        for (int j = 0; j < student_PF_Marks.length; j++) {

            for (int index_Rank = 0; index_Rank < student_PF_Marks.length; index_Rank++) {

                if (ranks_For_08[index_Rank] > 0 && ranks_For_08[index_Rank] == check_Rank) {

                    print_Student_Ranks_As_Table(index_Rank);

                }

            }

            check_Rank += 1;

        }

        System.out.println(
                "+----------+--------------+-----------------------------+-------------+-----------+");

        check_Rank = 1;

        return_To_Home_Page_Or_Continue_10();

    }

    public static void print_Student_Ranks_As_Table(int index_Rank) {

        if (1 <= ranks_For_08[index_Rank] && ranks_For_08[index_Rank] < 10) {

            System.out.print("|" + "         " + ranks_For_08[index_Rank] + "|");

        }

        if (10 <= ranks_For_08[index_Rank] && ranks_For_08[index_Rank] < 100) {

            System.out.print("|" + "        " + ranks_For_08[index_Rank] + "|");

        }

        if (100 <= ranks_For_08[index_Rank] && ranks_For_08[index_Rank] < 1000) {

            System.out.print("|" + "       " + ranks_For_08[index_Rank] + "|");

        }

        if (1000 <= ranks_For_08[index_Rank] && ranks_For_08[index_Rank] < 10000) {

            System.out.print("|" + "      " + ranks_For_08[index_Rank] + "|");

        }

        if (10000 <= ranks_For_08[index_Rank] && ranks_For_08[index_Rank] < 100000) {

            System.out.print("|" + "     " + ranks_For_08[index_Rank] + "|");

        }

        if (100000 <= ranks_For_08[index_Rank] && ranks_For_08[index_Rank] < 1000000) {

            System.out.print("|" + "    " + ranks_For_08[index_Rank] + "|");

        }

        if (1000000 <= ranks_For_08[index_Rank] && ranks_For_08[index_Rank] < 10000000) {

            System.out.print("|" + "   " + ranks_For_08[index_Rank] + "|");

        }

        if (10000000 <= ranks_For_08[index_Rank] && ranks_For_08[index_Rank] < 100000000) {

            System.out.print("|" + "  " + ranks_For_08[index_Rank] + "|");

        }

        if (100000000 <= ranks_For_08[index_Rank] && ranks_For_08[index_Rank] < 1000000000) {

            System.out.print("|" + " " + ranks_For_08[index_Rank] + "|");

        }

        String student_ID_Length_Check_Temp = student_ID[index_Rank];
        int student_ID_Length = student_ID_Length_Check_Temp.length();

        if (student_ID_Length == 1) {

            System.out.print("             " + student_ID[index_Rank] + "|");

        }

        if (student_ID_Length == 2) {

            System.out.print("            " + student_ID[index_Rank] + "|");

        }

        if (student_ID_Length == 3) {

            System.out.print("           " + student_ID[index_Rank] + "|");

        }

        if (student_ID_Length == 4) {

            System.out.print("          " + student_ID[index_Rank] + "|");

        }

        if (student_ID_Length == 5) {

            System.out.print("         " + student_ID[index_Rank] + "|");

        }

        if (student_ID_Length == 6) {

            System.out.print("        " + student_ID[index_Rank] + "|");

        }

        if (student_ID_Length == 7) {

            System.out.print("       " + student_ID[index_Rank] + "|");

        }

        if (student_ID_Length == 8) {

            System.out.print("      " + student_ID[index_Rank] + "|");

        }

        if (student_ID_Length == 9) {

            System.out.print("     " + student_ID[index_Rank] + "|");

        }

        if (student_ID_Length == 10) {

            System.out.print("    " + student_ID[index_Rank] + "|");

        }

        if (student_ID_Length == 11) {

            System.out.print("   " + student_ID[index_Rank] + "|");

        }

        if (student_ID_Length == 12) {

            System.out.print("  " + student_ID[index_Rank] + "|");

        }
        if (student_ID_Length == 13) {

            System.out.print(" " + student_ID[index_Rank] + "|");

        }

        if (student_ID_Length == 14) {

            System.out.print("" + student_ID[index_Rank] + "|");

        }

        String student_Name_Length_Check_Temp = student_Name[index_Rank];
        int student_Name_Length = student_Name_Length_Check_Temp.length();

        if (student_Name_Length == 1) {

            System.out.print("                            " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 2) {

            System.out.print("                           " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 3) {

            System.out.print("                          " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 4) {

            System.out.print("                         " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 5) {

            System.out.print("                        " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 6) {

            System.out.print("                       " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 7) {

            System.out.print("                      " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 8) {

            System.out.print("                     " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 9) {

            System.out.print("                    " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 10) {

            System.out.print("                   " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 11) {

            System.out.print("                  " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 12) {

            System.out.print("                 " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 13) {

            System.out.print("                " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 14) {

            System.out.print("               " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 15) {

            System.out.print("              " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 16) {

            System.out.print("             " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 17) {

            System.out.print("            " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 18) {

            System.out.print("           " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 19) {

            System.out.print("          " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 20) {

            System.out.print("         " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 21) {

            System.out.print("        " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 22) {

            System.out.print("       " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 23) {

            System.out.print("      " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 24) {

            System.out.print("     " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 25) {

            System.out.print("    " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 26) {

            System.out.print("   " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 27) {

            System.out.print("  " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 28) {

            System.out.print(" " + student_Name[index_Rank] + "|");

        }

        if (student_Name_Length == 29) {

            System.out.print("" + student_Name[index_Rank] + "|");

        }

        if (0 <= total_Marks_For_08[index_Rank] && total_Marks_For_08[index_Rank] < 10) {

            System.out.print("            " + total_Marks_For_08[index_Rank] + "|");

        }

        if (10 <= total_Marks_For_08[index_Rank] && total_Marks_For_08[index_Rank] < 100) {

            System.out.print("           " + total_Marks_For_08[index_Rank] + "|");

        }

        if (100 <= total_Marks_For_08[index_Rank] && total_Marks_For_08[index_Rank] <= 200) {

            System.out.print("          " + total_Marks_For_08[index_Rank] + "|");

        }

        double average_08 = Average_For_08[index_Rank];
        String avg_08 = String.format("%.2f", average_08);
        int average_08_length = avg_08.length();

        if (average_08_length == 4) {

            System.out.print("       " + avg_08 + "|");

        }

        if (average_08_length == 5) {

            System.out.print("      " + avg_08 + "|");

        }

        if (average_08_length == 6) {

            System.out.print("     " + avg_08 + "|");

        }

        System.out.println();

    }

    public static void return_To_Home_Page_Or_Continue_10() {

        System.out.println();
        System.out.print("Do you want to go back to main menu? (Y / N) > ");

        Scanner input28 = new Scanner(System.in);
        String feed_12 = input28.nextLine();

        System.out.println();

        process_HomePage_10(feed_12);

    }

    public static void process_HomePage_10(String feed_12) {

        if (feed_12.equals("Y")) {

            clearConsole();
            print_Home_Page();
            ask_For_Option();

        }

        if (feed_12.equals("N")) {

            clearConsole();
            print_Student_Ranks();

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            return_To_Home_Page_Or_Continue_10();

        }

    }

    public static void best_in_Programming_Fundamentals() {

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|                         BEST IN PROGRAMMING FUNDAMENTALS                        |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

        check_Data_To_Print_Best_In_Programming_Fundamentals();

    }

    public static void check_Data_To_Print_Best_In_Programming_Fundamentals() {

        boolean iS_Mark_Added = true;

        for (int i = 0; i < student_PF_Marks.length; i++) {

            if (student_PF_Marks[i] >= 0) {

                iS_Mark_Added = false;

            }

        }

        if ((student_PF_Marks.length == 0 && student_dBMS_Marks.length == 0) || iS_Mark_Added == true) {

            System.out.println("The data has not been entered yet!");
            System.out.println("Please enter the data and try again!");

            return_To_Home_Page_Or_Continue_11();

        }

        else {

            process_Print_Best_In_Programming_Fundamentals();

        }

    }

    public static void process_Print_Best_In_Programming_Fundamentals() {

        int temp[] = new int[student_PF_Marks.length];

        for (int i = 0; i < student_PF_Marks.length; i++) {

            temp[i] = (student_PF_Marks[i]);

        }

        int temp6[] = new int[student_PF_Marks.length];

        student_PF_Marks_Rank_Array_For_09 = temp6;

        int sorted_Array_Of_PF_Marks[] = sort_Array_03(temp);

        for (int i = 0; i < student_PF_Marks.length; i++) {

            for (int j = 0; j < student_PF_Marks.length; j++) {

                if (sorted_Array_Of_PF_Marks[sorted_Array_Of_PF_Marks.length - i - 1] < 0
                        && (sorted_Array_Of_PF_Marks[sorted_Array_Of_PF_Marks.length - i - 1] == student_PF_Marks[j])) {

                    student_PF_Marks_Rank_Array_For_09[j] = 0;

                }

                if (sorted_Array_Of_PF_Marks[sorted_Array_Of_PF_Marks.length - i - 1] >= 0
                        && (sorted_Array_Of_PF_Marks[sorted_Array_Of_PF_Marks.length - i - 1] == student_PF_Marks[j])
                        && sorted_Array_Of_PF_Marks[j] != previous_Max_02) {

                    max_02 = sorted_Array_Of_PF_Marks[j];
                    student_PF_Marks_Rank_Array_For_09[j] = rank_02;

                }

            }

            rank_02++;
            previous_Max_02 = max_02;

        }

        rank_02 = 1;
        max_02 = Integer.MIN_VALUE;
        previous_Max_02 = Integer.MIN_VALUE;

        filter_PF_Rank_Details();

    }

    public static int[] sort_Array_03(int temp[]) {

        for (int j = temp.length - 1; j >= 0; j--) {

            for (int i = 0; i < j; i++) {

                if (temp[i] > temp[i + 1]) {

                    int t3 = temp[i];
                    temp[i] = temp[i + 1];
                    temp[i + 1] = t3;

                }

            }

        }

        return temp;

    }

    public static void filter_PF_Rank_Details() {

        System.out.println(
                "+--------------+-----------------------------+------------------+-----------------+");
        System.out.println(
                "|ID            |Name                         |PF Marks          |DBMS Marks       |");
        System.out.println(
                "+--------------+-----------------------------+------------------+-----------------+");

        for (int j = 0; j < student_PF_Marks.length; j++) {

            for (int index_Rank_01 = 0; index_Rank_01 < student_PF_Marks.length; index_Rank_01++) {

                if (student_PF_Marks_Rank_Array_For_09[index_Rank_01] > 0
                        && student_PF_Marks_Rank_Array_For_09[index_Rank_01] == check_Rank_01) {

                    print_Student_Best_In_PF_Marks_As_Table(index_Rank_01);

                }

            }

            check_Rank_01 += 1;

        }

        System.out.println(
                "+--------------+-----------------------------+------------------+-----------------+");

        check_Rank_01 = 1;

        return_To_Home_Page_Or_Continue_11();

    }

    public static void print_Student_Best_In_PF_Marks_As_Table(int index_Rank_01) {

        String student_ID_Length_Check_Temp_01 = student_ID[index_Rank_01];
        int student_ID_Length_01 = student_ID_Length_Check_Temp_01.length();

        if (student_ID_Length_01 == 1) {

            System.out.print("|             " + student_ID[index_Rank_01] + "|");

        }

        if (student_ID_Length_01 == 2) {

            System.out.print("|            " + student_ID[index_Rank_01] + "|");

        }

        if (student_ID_Length_01 == 3) {

            System.out.print("|           " + student_ID[index_Rank_01] + "|");

        }

        if (student_ID_Length_01 == 4) {

            System.out.print("|          " + student_ID[index_Rank_01] + "|");

        }

        if (student_ID_Length_01 == 5) {

            System.out.print("|         " + student_ID[index_Rank_01] + "|");

        }

        if (student_ID_Length_01 == 6) {

            System.out.print("|        " + student_ID[index_Rank_01] + "|");

        }

        if (student_ID_Length_01 == 7) {

            System.out.print("|       " + student_ID[index_Rank_01] + "|");

        }

        if (student_ID_Length_01 == 8) {

            System.out.print("|      " + student_ID[index_Rank_01] + "|");

        }

        if (student_ID_Length_01 == 9) {

            System.out.print("|     " + student_ID[index_Rank_01] + "|");

        }

        if (student_ID_Length_01 == 10) {

            System.out.print("|    " + student_ID[index_Rank_01] + "|");

        }

        if (student_ID_Length_01 == 11) {

            System.out.print("|   " + student_ID[index_Rank_01] + "|");

        }

        if (student_ID_Length_01 == 12) {

            System.out.print("|  " + student_ID[index_Rank_01] + "|");

        }

        if (student_ID_Length_01 == 13) {

            System.out.print("| " + student_ID[index_Rank_01] + "|");

        }

        if (student_ID_Length_01 == 14) {

            System.out.print("|" + student_ID[index_Rank_01] + "|");

        }

        String student_Name_Length_Check_Temp_01 = student_Name[index_Rank_01];
        int student_Name_Length_01 = student_Name_Length_Check_Temp_01.length();

        if (student_Name_Length_01 == 1) {

            System.out.print("                            " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 2) {

            System.out.print("                           " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 3) {

            System.out.print("                          " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 4) {

            System.out.print("                         " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 5) {

            System.out.print("                        " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 6) {

            System.out.print("                       " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 7) {

            System.out.print("                      " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 8) {

            System.out.print("                     " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 9) {

            System.out.print("                    " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 10) {

            System.out.print("                   " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 11) {

            System.out.print("                  " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 12) {

            System.out.print("                 " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 13) {

            System.out.print("                " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 14) {

            System.out.print("               " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 15) {

            System.out.print("              " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 16) {

            System.out.print("             " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 17) {

            System.out.print("            " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 18) {

            System.out.print("           " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 19) {

            System.out.print("          " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 20) {

            System.out.print("         " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 21) {

            System.out.print("         " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 22) {

            System.out.print("        " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 23) {

            System.out.print("       " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 24) {

            System.out.print("      " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 25) {

            System.out.print("     " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 26) {

            System.out.print("    " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 27) {

            System.out.print("   " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 28) {

            System.out.print("  " + student_Name[index_Rank_01] + "|");

        }

        if (student_Name_Length_01 == 29) {

            System.out.print(" " + student_Name[index_Rank_01] + "|");

        }

        if (0 <= student_PF_Marks[index_Rank_01] && student_PF_Marks[index_Rank_01] < 10) {

            System.out.print("                 " + student_PF_Marks[index_Rank_01] + "|");

        }

        if (10 <= student_PF_Marks[index_Rank_01] && student_PF_Marks[index_Rank_01] < 100) {

            System.out.print("                " + student_PF_Marks[index_Rank_01] + "|");

        }

        if (student_PF_Marks[index_Rank_01] == 100) {

            System.out.print("               " + student_PF_Marks[index_Rank_01] + "|");

        }

        if (0 <= student_dBMS_Marks[index_Rank_01] && student_dBMS_Marks[index_Rank_01] < 10) {

            System.out.print("                " + student_dBMS_Marks[index_Rank_01] + "|");

        }

        if (10 <= student_dBMS_Marks[index_Rank_01] && student_dBMS_Marks[index_Rank_01] < 100) {

            System.out.print("               " + student_dBMS_Marks[index_Rank_01] + "|");

        }

        if (student_dBMS_Marks[index_Rank_01] == 100) {

            System.out.print("              " + student_dBMS_Marks[index_Rank_01] + "|");

        }

        System.out.println();

    }

    public static void return_To_Home_Page_Or_Continue_11() {

        System.out.println();
        System.out.print("Do you want to go back to main menu? (Y / N) > ");

        Scanner input29 = new Scanner(System.in);
        String feed_13 = input29.nextLine();

        System.out.println();

        process_HomePage_11(feed_13);

    }

    public static void process_HomePage_11(String feed_13) {

        if (feed_13.equals("Y")) {

            clearConsole();
            print_Home_Page();
            ask_For_Option();

        }

        if (feed_13.equals("N")) {

            clearConsole();
            best_in_Programming_Fundamentals();

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            return_To_Home_Page_Or_Continue_11();

        }

    }

    public static void best_In_Database_Management_Systems() {

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|                        BEST IN DATABASE MANAGEMENT SYSTEMS                      |");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

        check_Data_To_Print_Best_In_Database_Management_Systems();

    }

    public static void check_Data_To_Print_Best_In_Database_Management_Systems() {

        boolean iS_Mark_Added = true;

        for (int i = 0; i < student_dBMS_Marks.length; i++) {

            if (student_dBMS_Marks[i] >= 0) {

                iS_Mark_Added = false;

            }

        }

        if ((student_PF_Marks.length == 0 && student_dBMS_Marks.length == 0) || iS_Mark_Added == true) {

            System.out.println("The data has not been entered yet!");
            System.out.println("Please enter the data and try again!");

            return_To_Home_Page_Or_Continue_12();

        }

        else {

            process_Print_Best_In_Database_Management_Systems();

        }

    }

    public static void process_Print_Best_In_Database_Management_Systems() {

        int temp[] = new int[student_dBMS_Marks.length];

        for (int i = 0; i < student_dBMS_Marks.length; i++) {

            temp[i] = (student_dBMS_Marks[i]);

        }

        int temp8[] = new int[student_dBMS_Marks.length];

        student_DBMS_Marks_Rank_Array_For_10 = temp8;

        int sorted_Array_Of_DBMS_Marks[] = sort_Array_04(temp);

        for (int i = 0; i < student_dBMS_Marks.length; i++) {

            for (int j = 0; j < student_dBMS_Marks.length; j++) {

                if (sorted_Array_Of_DBMS_Marks[sorted_Array_Of_DBMS_Marks.length - i - 1] < 0
                        && (sorted_Array_Of_DBMS_Marks[sorted_Array_Of_DBMS_Marks.length - i
                                - 1] == student_dBMS_Marks[j])) {

                    student_DBMS_Marks_Rank_Array_For_10[j] = 0;

                }

                if (sorted_Array_Of_DBMS_Marks[sorted_Array_Of_DBMS_Marks.length - i - 1] >= 0
                        && (sorted_Array_Of_DBMS_Marks[sorted_Array_Of_DBMS_Marks.length - i
                                - 1] == student_dBMS_Marks[j])
                        && sorted_Array_Of_DBMS_Marks[j] != previous_Max_03) {

                    max_03 = sorted_Array_Of_DBMS_Marks[j];
                    student_DBMS_Marks_Rank_Array_For_10[j] = rank_03;

                }

            }

            rank_03++;
            previous_Max_03 = max_03;

        }

        rank_03 = 1;
        max_03 = Integer.MIN_VALUE;
        previous_Max_03 = Integer.MIN_VALUE;

        filter_DBMS_Rank_Details();

    }

    public static int[] sort_Array_04(int temp[]) {

        for (int j = temp.length - 1; j >= 0; j--) {

            for (int i = 0; i < j; i++) {

                if (temp[i] > temp[i + 1]) {

                    int t3 = temp[i];
                    temp[i] = temp[i + 1];
                    temp[i + 1] = t3;

                }

            }

        }

        return temp;
    }

    public static void filter_DBMS_Rank_Details() {

        System.out.println("+--------------+-----------------------------+------------------+-----------------+");
        System.out.println("|ID            |Name                         |DBMS Marks        |PF Marks         |");
        System.out.println("+--------------+-----------------------------+------------------+-----------------+");

        for (int j = 0; j < student_dBMS_Marks.length; j++) {

            for (int index_Rank_02 = 0; index_Rank_02 < student_dBMS_Marks.length; index_Rank_02++) {

                if (student_DBMS_Marks_Rank_Array_For_10[index_Rank_02] > 0
                        && student_DBMS_Marks_Rank_Array_For_10[index_Rank_02] == check_Rank_02) {

                    print_Student_Best_In_Database_Management_Systems_Marks_As_Table(index_Rank_02);

                }

            }

            check_Rank_02 += 1;

        }

        System.out.println(
                "+--------------+-----------------------------+------------------+-----------------+");

        check_Rank_02 = 1;

        return_To_Home_Page_Or_Continue_12();

    }

    public static void print_Student_Best_In_Database_Management_Systems_Marks_As_Table(int index_Rank_02) {

        String student_ID_Length_Check_Temp_02 = student_ID[index_Rank_02];
        int student_ID_Length_02 = student_ID_Length_Check_Temp_02.length();

        if (student_ID_Length_02 == 1) {

            System.out.print("|" + "             " + student_ID[index_Rank_02] + "|");

        }

        if (student_ID_Length_02 == 2) {

            System.out.print("|" + "            " + student_ID[index_Rank_02] + "|");

        }

        if (student_ID_Length_02 == 3) {

            System.out.print("|" + "           " + student_ID[index_Rank_02] + "|");

        }

        if (student_ID_Length_02 == 4) {

            System.out.print("|" + "          " + student_ID[index_Rank_02] + "|");

        }

        if (student_ID_Length_02 == 5) {

            System.out.print("|" + "         " + student_ID[index_Rank_02] + "|");

        }

        if (student_ID_Length_02 == 6) {

            System.out.print("|" + "        " + student_ID[index_Rank_02] + "|");

        }

        if (student_ID_Length_02 == 7) {

            System.out.print("|" + "       " + student_ID[index_Rank_02] + "|");

        }

        if (student_ID_Length_02 == 8) {

            System.out.print("|" + "      " + student_ID[index_Rank_02] + "|");

        }

        if (student_ID_Length_02 == 9) {

            System.out.print("|" + "     " + student_ID[index_Rank_02] + "|");

        }

        if (student_ID_Length_02 == 10) {

            System.out.print("|" + "    " + student_ID[index_Rank_02] + "|");

        }

        if (student_ID_Length_02 == 11) {

            System.out.print("|" + "   " + student_ID[index_Rank_02] + "|");

        }

        if (student_ID_Length_02 == 12) {

            System.out.print("|" + "  " + student_ID[index_Rank_02] + "|");

        }

        if (student_ID_Length_02 == 13) {

            System.out.print("|" + " " + student_ID[index_Rank_02] + "|");

        }

        if (student_ID_Length_02 == 14) {

            System.out.print("|" + "" + student_ID[index_Rank_02] + "|");

        }

        String student_Name_Length_Check_Temp_02 = student_Name[index_Rank_02];
        int student_Name_Length_02 = student_Name_Length_Check_Temp_02.length();

        if (student_Name_Length_02 == 1) {

            System.out.print("                            " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 2) {

            System.out.print("                           " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 3) {

            System.out.print("                          " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 4) {

            System.out.print("                         " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 5) {

            System.out.print("                        " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 6) {

            System.out.print("                       " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 7) {

            System.out.print("                      " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 8) {

            System.out.print("                     " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 9) {

            System.out.print("                    " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 10) {

            System.out.print("                   " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 11) {

            System.out.print("                  " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 12) {

            System.out.print("                 " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 13) {

            System.out.print("                " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 14) {

            System.out.print("               " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 15) {

            System.out.print("              " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 16) {

            System.out.print("             " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 17) {

            System.out.print("            " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 18) {

            System.out.print("           " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 19) {

            System.out.print("          " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 20) {

            System.out.print("         " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 21) {

            System.out.print("        " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 22) {

            System.out.print("       " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 23) {

            System.out.print("      " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 24) {

            System.out.print("     " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 25) {

            System.out.print("    " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 26) {

            System.out.print("   " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 27) {

            System.out.print("  " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 28) {

            System.out.print(" " + student_Name[index_Rank_02] + "|");

        }

        if (student_Name_Length_02 == 29) {

            System.out.print("" + student_Name[index_Rank_02] + "|");

        }

        if (0 <= student_dBMS_Marks[index_Rank_02] && student_dBMS_Marks[index_Rank_02] < 10) {

            System.out.print("                 " + student_dBMS_Marks[index_Rank_02] + "|");

        }

        if (10 <= student_dBMS_Marks[index_Rank_02] && student_dBMS_Marks[index_Rank_02] < 100) {

            System.out.print("                " + student_dBMS_Marks[index_Rank_02] + "|");

        }

        if (student_dBMS_Marks[index_Rank_02] == 100) {

            System.out.print("               " + student_dBMS_Marks[index_Rank_02] + "|");

        }

        if (0 <= student_PF_Marks[index_Rank_02] && student_PF_Marks[index_Rank_02] < 10) {

            System.out.print("                " + student_PF_Marks[index_Rank_02] + "|");

        }

        if (10 <= student_PF_Marks[index_Rank_02] && student_PF_Marks[index_Rank_02] < 100) {

            System.out.print("               " + student_PF_Marks[index_Rank_02] + "|");
        }

        if (student_PF_Marks[index_Rank_02] == 100) {

            System.out.print("              " + student_PF_Marks[index_Rank_02] + "|");

        }

        System.out.println();

    }

    public static void return_To_Home_Page_Or_Continue_12() {

        System.out.println();
        System.out.print("Do you want to go back to main menu? (Y / N) > ");

        Scanner input30 = new Scanner(System.in);
        String feed_14 = input30.nextLine();

        System.out.println();

        process_HomePage_12(feed_14);

    }

    public static void process_HomePage_12(String feed_14) {

        if (feed_14.equals("Y")) {

            clearConsole();
            print_Home_Page();
            ask_For_Option();

        }

        if (feed_14.equals("N")) {

            clearConsole();
            best_In_Database_Management_Systems();

        } else {

            System.out.println("Please enter a valid Input!");
            System.out.println();

            return_To_Home_Page_Or_Continue_12();

        }

    }

}