abstract class Employee {
    int employeeId;
    String name;

    Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    abstract double calculatePerformanceScore();

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Performance Score: " + calculatePerformanceScore());
    }
}

class Developer extends Employee {
    int completedProjects;

    Developer(int id, String name, int projects) {
        super(id, name);
        completedProjects = projects;
    }

    double calculatePerformanceScore() {
        return completedProjects * 10;
    }
}

class Manager extends Employee {
    int teamPerformance;

    Manager(int id, String name, int performance) {
        super(id, name);
        teamPerformance = performance;
    }

    double calculatePerformanceScore() {
        return teamPerformance;
    }
}

 class Main {
    public static void main(String[] args) {
        Developer d = new Developer(101, "Rahul", 8);
        Manager m = new Manager(102, "Priya", 85);

        System.out.println("Developer Details:");
        d.display();

        System.out.println("\nManager Details:");
        m.display();
    }
}