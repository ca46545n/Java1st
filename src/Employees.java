
    import java.util.Scanner;
    public class Employees {


        private float salary, hours;


        public Employees() {

            salary = 0;
            hours = 0;


        }


        public void GetInfo(float sal, float hr) {

            salary = sal;

            hours = hr;


        }


        public float AddSal() {

            if (salary < 500) {

                salary = salary + 10;

            }
            return salary;
        }

        public float AddWork() {


            if (hours < 6) {

                salary = salary + 5;
            }

            return salary;
        }
    }

    class EmployeesInfo {

        float salary;

        public EmployeesInfo(float sal) {
            salary = sal;
        }

        public void printSal() {

            System.out.println("Salary : " + salary);
        }
    }


    class NewEmployee {


        public static void main(String[] args) {

            Employees mon = new Employees();


            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your Salary: ");
            float salary = sc.nextFloat();
            System.out.println("Enter the number of hours of work");
            float hours = sc.nextFloat();

            mon.GetInfo(salary, hours);
            salary = mon.AddSal();
            salary = mon.AddWork();


            EmployeesInfo Info = new EmployeesInfo(salary);

            Info.printSal();


        }

    }



