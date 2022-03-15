public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary, double workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary > 1000) return this.salary * 0.03;
        else return 0;
    }

    public double bonus(){
        if(40<this.workHours){
            return 30*(this.workHours-40);
        }return 0;
    }

    public double raiseSalary(){
        if(2021-this.hireYear<10) {
            return this.salary * 0.05;
        }
        else if(2021-this.hireYear<20){
            return this.salary * 0.1;
        }
        else{
            return this.salary * 0.15;
        }
    }
    @Override
    public String toString(){
        System.out.println("Adi  : \t"+this.name);
        System.out.println("Maas : \t"+this.salary);
        System.out.println("Whour:\t"+this.workHours);
        System.out.println("BYılı: \t"+this.hireYear);
        System.out.println("Vergi: \t"+tax());
        System.out.println("Bonus: \t"+bonus());
        System.out.println("MaasA: \t"+raiseSalary());
        System.out.println("NetMa: \t"+(this.salary+bonus()-tax()));
        this.salary = this.salary+bonus()+raiseSalary()-tax();

        System.out.println("Topla: \t"+this.salary);
        return "a";
    }

}
