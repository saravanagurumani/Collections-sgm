package collections.List.AbstractListPractice;

import java.util.AbstractList;

public class MyList {
    public static void main(String[] args) {
        OwnList list=new OwnList();
        list.add("saro");
        list.add("lakshu");
        list.add("anu");
        list.add("kaviya");
        list.add("kaviya");
        System.out.println("This get : " + list.get(2));
        System.out.println("This is size : " + list.size());
        System.out.println("this is remove : " + list.remove(2));
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

class OwnList extends AbstractList<String>{

    //if we user add data must be internal storage thats why we create this
    private String[] data=new String[10];
    private int size;

    //this is implement method
    @Override
    public String get(int index) {
        return data[index];
    }

    @Override
    public int size() {
        return size;
    }

    //we need to add data to the user thats why we need to implement this
    @Override
    public boolean add(String s) {
        data[size++]=s;
        return true;
    }

    //{1,2,3,3}
    @Override
    public String remove(int index) {
        String store=data[index];
        for (int i = index; i < size-1 ; i++) {
            data[i]=data[i+1];
        }
        size--;
        return store;
    }
}
