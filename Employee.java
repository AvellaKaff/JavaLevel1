package lesson5;

public class Employee {
    public static void main(String[] args) {

        Employee[] arr = new Employee[5];
        arr[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        arr[1] = new Employee("Sidorov Andrey", "Engineer", "sidor@mail.ru", "89997456231", 35000, 40);
        arr[2] = new Employee("Galkina Tatyana", "Secretary", "galkina@mail.ru", "89523641758", 22000, 29);
        arr[3] = new Employee("Mankin Ivan", "Builder", "ivannnn@mail.ru", "89235641123", 30000, 44);
        arr[4] = new Employee("Kirov Mihail", "Director", "direktor@mail.ru", "89453215226", 100000, 47);

        for (int i = 0; i < 5; i++) {
                arr[i].info();
        }
    }

    private String FCS;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String FCS, String post, String email, String phone, int salary, int age) {
        this.FCS = FCS;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
            if (age > 40) {
                System.out.println("ФИО: " + FCS + "; Должность: " + post + "; email: " + email + "; Телефон: " + phone + "; Зарплата: " + salary + "; Возраст: " + age);
            }
    }
}


