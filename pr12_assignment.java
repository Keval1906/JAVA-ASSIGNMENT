class Bank {

    private String name;
    Bank(String name) {

        this.name = name;
    }

   
    public String getBankName() {
       return this.name;
    }
}

class Employee {
    private String name;

    
    Employee(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return this.name;
    }
}

class pr12_assignment {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Employee emp = new Employee("HARSH DUDHAT");
        System.out.println(emp.getEmployeeName()
                + " is employee of "
                + bank.getBankName());
    }
}