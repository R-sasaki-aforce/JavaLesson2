package jp.co.aforce.sample;

public class tesutzenzitu {
    String name;
    int id;

    public tesutzenzitu(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        tesutzenzitu employee = (tesutzenzitu) obj;
        return id == employee.id;
    }

    public static void main(String[] args) {
    	tesutzenzitu emp1 = new tesutzenzitu("John", 101);
    	tesutzenzitu emp2 = new tesutzenzitu("Jane", 102);
    	tesutzenzitu emp3 = new tesutzenzitu("John", 101);

        System.out.println(emp1.equals(emp2)); // false
        System.out.println(emp1.equals(emp3)); // true
    }

}
