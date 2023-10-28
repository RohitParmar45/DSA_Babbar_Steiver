package Matrix;

public class Practice2 {
    private  static  Practice2 a;
    private Practice2(){
        a  = new Practice2();
    }
    public static Practice2 getInstance (){
        return a;
    }
}
