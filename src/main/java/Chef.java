import java.util.ArrayList;

/**
 * Created by George Dzagali on 3/29/2017.
 */
public abstract class Chef extends Employee {
    private ArrayList<Order> meals;
    private String dish;
    private String name;
   // private Chef ChefStatus;
    private String type;
    private float salary;

    public Chef(String lastName, String firstName, float salary, int pin, String name, String type, String meal) {
        super(lastName, firstName, salary, pin);
        this.name = name;
        this.type = type;
        this.dish = dish;
        meals = new ArrayList<Order>();
    }

    // getters
    public float getSalary() {
        return salary;
    }

    // setters
    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Get the name of the meal
    public String getName() {
        return dish;
    }

    // Get the type of meal
    public String getType() {
        return type;
    }

    // Set the  name of the meal
    public String setName() {
        return dish;
    }

    public String setType() {
        return type;
    }

}











