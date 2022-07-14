public class XidianStudent extends Student implements Developer{
    public XidianStudent(int id,String name,String sex){
        super(id,name,sex);           //用父类的构造器
    }
    @Override
    public void play() {
        System.out.println(this.name+"看似在玩，其实他还在卷");
    }
    @Override
    public void writeBug() {
        System.out.println(this.name+"在写bug");
    }
    @Override
    public void debug() {
        System.out.println(this.name+"在改bug");
    }
    public void haveGirlfriend(){
        System.out.println(this.name+"有女朋友");
    }
    //重载
    public void haveGirlfriend(int n){
         System.out.println(this.name+"有"+n+"个女朋友，渣男！");
     }
    public static void main(String[] args){
        XidianStudent xduer = new XidianStudent(123, "邹俊智", "男");
        xduer.sleep();
        xduer.study();
        xduer.play();
        xduer.writeBug();
        xduer.debug();
        xduer.haveGirlfriend();
        xduer.haveGirlfriend(10);
    }
}