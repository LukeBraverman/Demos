package ObjectsAndArrays;

public class Data {
    //Intsance variables
    private String name;
    private int age;

    //constuctor
    Data(String n,int a)
    {
        name = n;
        age = a;
    }

    //getter and setters
    public String GetName()
    {
        return(name);
    }
    public void SetName(String n)
    {
        name = n;
    }
    public int GetAge()
    {
        return(age);
    }
    public void SetAge(int a)
    {
        age = a;
    }
    //method

    public void Print()
    {
        System.out.print(("("+GetName()));
        System.out.print(",");
        System.out.print(GetAge());
        System.out.print(") ");
    }

    //toString


    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
