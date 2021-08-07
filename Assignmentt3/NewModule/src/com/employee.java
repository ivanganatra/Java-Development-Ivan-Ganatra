package com;

public class employee implements Comparable<employee>{
    private String name;
    private String email;
    private int age;
    private String dob;
    private int id;
    public static int selection;
    public static int order_by;

    /**Ordering according to the input provided*/
    public int compareTo(employee e)
    {
        switch(selection)
        {
            case 1:
            {
                return order_by*Integer.compare(id,e.id);
            }
            case 2:
            {
                return order_by*String.CASE_INSENSITIVE_ORDER.compare(name,e.name);
            }
            case 3:
            {
                return order_by*String.CASE_INSENSITIVE_ORDER.compare(email,e.email);
            }
            case 4:
            {
                return order_by*Integer.compare(age,e.age);
            }
            case 5:
            {
                return order_by*String.CASE_INSENSITIVE_ORDER.compare(dob,e.dob);
            }
        }
        return order_by*String.CASE_INSENSITIVE_ORDER.compare(dob,e.dob);
    }

    //All the Setter methods
    void addId(int id)
    {
        this.id=id;
    }
    void addName(String name)
    {
        this.name=name;
    }
    void addEmail(String email)
    {
        this.email=email;
    }
    void addAge(int age)
    {
        this.age=age;
    }
    void addDob(String dob)
    {
        this.dob=dob;
    }

    //All the Getter Methods
    int getId()
    {
        return this.id;
    }
    String getName()
    {
        return this.name;
    }
    String getEmail()
    {
        return this.email;
    }
    int getAge()
    {
        return this.age;
    }
    String getDob()
    {
        return this.dob;
    }

}
