package entities;

public class employee {
  
    private Integer id;
    private String name;
    private Double salary;
  
    public employee(Integer id,String name,Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Double getSalary() {
        return salary;
    }
    public void increasesalary(Double percentage) {
        salary += salary * percentage/100.0;
    }
    public String toString() {
        return"Id: " 
        +id 
        +", "
        +name
        + ", new salary: "
        +String.format("%.2f", salary);
    }
}
