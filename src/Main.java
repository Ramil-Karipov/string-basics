public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);
        System.out.println("Задача 2");
        String firstName1 = "Иван";
        String middleName1 = "Иванович";
        String lastName1 = "Иванов";
        String fullName1 = lastName1 + " " + firstName1 + " " + middleName1;
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName1.toUpperCase());
        System.out.println("Задача 3");
        String firstName2 = "Семён";
        String middleName2 = "Семёнович";
        String lastName2 = "Иванов";
        String fullName2 = lastName2 + " " + firstName2 + " " + middleName2;
        fullName2 = fullName2.replace("ё", "e");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2);



    }
}