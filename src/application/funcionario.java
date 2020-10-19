package application;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.employee;

public class funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<employee> list = new ArrayList<>(); 
        System.out.println("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt();

        for(int i = 1 ;i <= n ;i++) {
            System.out.println();
            System.out.printf("Funcionário #%d:\n",i);
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            Double salary = sc.nextDouble();
            employee emp = new employee(id,name,salary);
            list.add(emp);
        }
        System.out.print("Digite o ID do funcionario que recebera o aumento: ");
        int idsalary = sc.nextInt();
        Integer pos = hasId(list,idsalary);
        if(pos == null) {
            System.out.println("\n\nO ID não existe!");
        }
        else {
            System.out.print("Digite o aumento em porcentagem: ");
            double percent = sc.nextDouble();
            System.out.println();
            list.get(pos).increasesalary(percent);
        }
        for(employee emp : list) {
            System.out.println(emp);
        }
        
        sc.close();
    }
    private static Integer hasId(List<employee> list, int id) {
        for(int i = 1; i <= list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
