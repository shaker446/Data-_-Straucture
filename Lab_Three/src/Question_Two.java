

import java.util.Arrays;

public class Question_Two {
    String name;
    int age;
    int id;

    public Question_Two(String name, int old, int id) {
        this.name = name;
        this.age = old;
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "{ name : " + name
                + ", age : " + age
                + ", ID : " + id + " }";
    }
    public static void main(String[] args) {
        
        Q_Two[] arr = new Q_Two[2];
        arr[0] = new Q_Two("ali", 25, 123);
        arr[1] = new Q_Two("khaled", 23, 124);
        
        Q_Two[] arr2 = new Q_Two[arr.length];
        arr2 = arr;
        
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i].toString());
        }
    }
}