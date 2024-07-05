public class EmployeeDetails {

    public static String[] empAssoc = { "EmpNo", "EmpName", "JoinDate", "DesignationCode", 
                        "Department", "Basic", "HRA", "IT" };
    public static String[][] empTable = new String[][] {
            { "1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000" },
            { "1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000" },
            { "1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000" },
            { "1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000" },
            { "1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000" },
            { "1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400" },
            { "1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000" }
    };

    public static String[] daAssoc = { "Designation Code", "Designation", "DA" };

    public static String[][] daTable = new String[][] {
            { "e", "Engineer", "20000" },
            { "c", "Consultant", "32000" },
            { "k", "Clerk", "12000" },
            { "r", "Receptionist", "15000" },
            { "m", "Manager", "40000" }
    };

    public static void main(String[] args) {
        int id = 0;
        String name = null;
        String DesignationCode = null;
        String Department = null;
        String Designation = null;
        int Basic = 0;
        int HRA = 0;
        int IT = 0;
        int DA = 0;
        int Salary = 0;

        boolean flag = false; // Flag to check if employee ID exists

        if (args.length > 0) {
            for (int i = 0; i < empTable.length; i++) {
                if (args[0].equals(empTable[i][0])) {
                    id = Integer.parseInt(empTable[i][0]);
                    name = empTable[i][1];
                    DesignationCode = empTable[i][3];
                    Department = empTable[i][4];
                    Basic = Integer.parseInt(empTable[i][5]);
                    HRA = Integer.parseInt(empTable[i][6]);
                    IT = Integer.parseInt(empTable[i][7]);

                    for (int j = 0; j < daTable.length; j++) {
                        if (DesignationCode.equals(daTable[j][0])) {
                            Designation = daTable[j][1];
                            DA = Integer.parseInt(daTable[j][2]);
                            Salary = Basic + HRA + DA - IT;

                            System.out.println("EmpNo EmpName Department Designation Salary");
                            System.out.println(id + " " + name + " " + Department + " " + Designation + " " + Salary);

                            flag = true; // Set flag to true since employee ID is found
                            break; // No need to iterate further for this employee ID
                        }
                    }
                }
            }

            if (!flag) {
                System.out.println("There is no employee with empid : " + args[0]);
            }
        } 
    }
}
