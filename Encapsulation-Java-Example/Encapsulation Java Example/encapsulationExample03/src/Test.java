public class Test {

    public static void main(String[] args) {

        //creating instance of the encapsulated class
        Employee e = new Employee();

        System.out.println(e.getDepartment());//Compile Time Error, because there is no such method
        System.out.println(e.department);//Compile Time Error, because the department data member is private.
                                      //So, it can't be accessed from outside the class
    }
}
