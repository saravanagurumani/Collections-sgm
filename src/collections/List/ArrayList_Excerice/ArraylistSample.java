package collections.List.ArrayList_Excerice;

import java.util.ArrayList;
import java.util.List;

public class ArraylistSample {
    int rollno;
    String name;
    int batchno;

    public ArraylistSample() {
    }

    @Override
    public String toString() {
        return "ArraylistSample{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", batchno=" + batchno +
                '}';
    }

    public ArraylistSample(int rollno, String name, int batchno) {
        this.rollno = rollno;
        this.name = name;
        this.batchno = batchno;
    }

    public void updatebath(int batch){
        this.batchno=batch;
        System.out.println("Batch updated for " + name + " → " + batch);
    }

    public static void info(){
        System.out.println("Welcome to ABC insttiute");
    }

    public static void main(String[] args) {
        ArraylistSample obj=new ArraylistSample();
        ArraylistSample obj1=new ArraylistSample(101,"saro",55);
        List<ArraylistSample> list=new ArrayList<>();
        list.add(obj1);
        System.out.println(list);
    }
}
