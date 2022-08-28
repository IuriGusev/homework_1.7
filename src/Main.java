public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //task 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName0 = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName0);


        // task 2
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);


        // task 3
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName1);

    }
}