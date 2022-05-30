public class Student {
    public int id;
    public String name;
    public String sex;

    public Student(int id,String name,String sex){   //构造器
        this.id=id;
        this.name=name;
        this.sex=sex;
    }
    public void sleep(){
        System.out.println(name+"在睡觉");
    }
    public void study(){
        System.out.println(name+"在卷");
    }
    public void play(){
        System.out.println(name+"在摆烂");
    }
}