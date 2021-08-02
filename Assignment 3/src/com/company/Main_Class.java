package com.company;
import java.util.*;
public class Main_Class {
    static Map<Integer,employee> emp_list=new HashMap<>();

    //Takes valid integer input in the [min,max] range
    private  static int takeIntegerInput(int min,int max)
    {
        Scanner sc;
        int input=0;
        boolean is_input_correct=false;
        //Try catch to ask for input until user gives correct input
        while(!is_input_correct) {
            try {
                is_input_correct=true;

                sc=new Scanner(System.in);
                input = sc.nextInt();
                if (input > max || input < min) {
                    throw new InputMismatchException();
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Please enter a valid input.");
                is_input_correct=false;
            }
        }
        return input;
    }
    private static void addEmployee()
    {
        //Creating new employee
        Scanner sc=new Scanner(System.in);
        employee new_emp=new employee();

        //First add employee id
        new_emp.addId(emp_list.size());
        //Adding name/email/age/dob of employee
        System.out.println("Enter the details of new Employee:");
        System.out.println("Name:");
        new_emp.addName(sc.nextLine());
        System.out.println("Email:");
        new_emp.addEmail(sc.next());
        System.out.println("Age:");
        new_emp.addAge(takeIntegerInput(0,150));
        System.out.println("Date of Birth:");
        new_emp.addDob(sc.next());

        //Store the new employee in the list
        emp_list.put(new_emp.getId(), new_emp);

        //Data stored information given to the user
        System.out.println("We have stored the information of "+new_emp.getName()+
                " having id = " +new_emp.getId()+".\n");
    }
    private static void deleteEmployee()
    {
        int id=takeIntegerInput(0,Integer.MAX_VALUE);
        System.out.println("Enter Employee id you want to delete: ");

        //Searching and removing the id (if id present in the map)
        if(emp_list.containsKey(id))
        {
            emp_list.remove(id);
        }
        else
        {
            System.out.println("This id doesn't exist.");
        }
    }
    private static void printEmployeeDetails(int id)
    {
        //Printing id details of the employee
        employee emp = emp_list.get(id);
        System.out.println("Employee ID: "+emp.getId());
        System.out.println("1) Employee Name: "+emp.getName());
        System.out.println("1) Employee Email: "+emp.getName());
        System.out.println("2) Employee Age: "+emp.getAge());
        System.out.println("3) Employee Dob: "+emp.getDob());
        System.out.println("\n");
    }
    private static void searchEmployee()
    {
        System.out.println("Enter the details of employee you want to search:");
        System.out.println("(If you don't want to specify a specific detail," +
                " enter -1 in place of that detail.)");

        //Searching requirements of employee entered here
        Scanner sc=new Scanner(System.in);
        employee new_emp=new employee();
        System.out.println("Name:");
        new_emp.addName(sc.nextLine());
        System.out.println("Email:");
        new_emp.addEmail(sc.next());
        System.out.println("Age:");
        new_emp.addAge(takeIntegerInput(-1,150));
        System.out.println("Date of Birth:");
        new_emp.addDob(sc.next());
        System.out.println("\n");

        //Filtering the employees and storing them in filtered_emp
        ArrayList<employee> filtered_emp=new ArrayList<>();
        for(Map.Entry<Integer, employee> store:emp_list.entrySet())
        {
            employee employe = store.getValue();
            /*If the entry is -1(No specification in that details) or the employee details
             *are present in the map, the printing details of that employee
             */
            if(
                    (employe.getName().compareTo(new_emp.getName())==0 || new_emp.getName().compareTo("-1")==0) &&
                            (employe.getEmail().compareTo(new_emp.getEmail())==0 || new_emp.getEmail().compareTo("-1")==0) &&
                            (employe.getAge()==new_emp.getAge()|| new_emp.getAge()==-1) &&
                            (employe.getDob().compareTo(new_emp.getDob())==0|| new_emp.getDob().compareTo("-1")==0)
            )
            {
                filtered_emp.add(employe);
            }
        }

        //Asking the details, on the basis of which sorting will be performed
        System.out.println("According to which details, do you want to order your query: ");
        System.out.println("1) Id 2) Name 3) Email 4)Age 5) Dob");
        employee.selection =takeIntegerInput(1, 5);

        //Asking the order of sorting
        System.out.println("Enter 1 - To sort in ascending order. " +
                           "Enter 2 - To sort in descending order. ");
        if(takeIntegerInput(1,2)==1)
        {
            employee.order_by=1;
        }
        else
        {
            employee.order_by=-1;
        }
        Collections.sort(filtered_emp);
        for(employee each_emp:filtered_emp)
        {
            printEmployeeDetails(each_emp.getId());
        }
    }

    private static void printAllEmployee()
    {
        for(Map.Entry<Integer, employee> store:emp_list.entrySet())
        {
            employee employee = store.getValue();
            System.out.println("Employee ID(Should always be positive or zero): "+employee.getId());
            System.out.println("1) Employee Name: "+employee.getName());
            System.out.println("2) Employee Email: "+employee.getEmail());
            System.out.println("3) Employee Age: "+employee.getAge());
            System.out.println("4) Employee Dob: "+employee.getDob());
        }
        System.out.println("\n");
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome, please follow the " +
                "instructions and enter valid inputs.");

        //Taking the input
        /**To Exit the main function when it becomes true*/
        boolean isExit;
        do{
            isExit=false;
            System.out.println("You can perform the queries as follows.");
            System.out.println("Enter 1, To add employee:");
            System.out.println("Enter 2, To remove a employee:");
            System.out.println("Enter 3, To search a employee:");
            System.out.println("Enter 4, To print details of all employees:");
            System.out.println("Enter 5, To exit:");
            System.out.print("     :");
            int query=takeIntegerInput(1,5);
            switch(query)
            {
                case 1:
                {
                    addEmployee();
                    break;
                }
                case 2:
                {
                    deleteEmployee();
                    break;
                }
                case 3:
                {
                    searchEmployee();
                    break;
                }
                case 4:
                {
                    printAllEmployee();
                    break;
                }
                default:
                {
                    isExit=true;
                    break;
                }
            }
        }
        while(!isExit);
    }
}
