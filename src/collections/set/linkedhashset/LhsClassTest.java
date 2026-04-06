package collections.set.linkedhashset;


import java.util.LinkedHashSet;
import java.util.Objects;

class Test{
    private final int rollno;
    private final String name;

    public Test(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null || getClass()!=obj.getClass()) return false;
        Test s = (Test) obj;

        return rollno == s.rollno;//&&
//                Objects.equals(name,s.name);
    }
}

public class LhsClassTest {
    public static void main(String[] args) {
        LinkedHashSet<Test> set=new LinkedHashSet<>();
        Test s1=new Test(101,"saro");
        Test s2=new Test(102,"lakshu");
        Test s3=new Test(102,"kaviya");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        for(Test t:set){
            System.out.println(t);
        }
    }
}
