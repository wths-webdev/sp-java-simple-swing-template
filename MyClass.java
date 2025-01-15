public class MyClass {
    private String fName;
    private String lName;

    public MyClass(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public String toString(){
        return fName + " " + lName;
    }
}
