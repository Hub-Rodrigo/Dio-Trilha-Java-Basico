public class ExCalculadora {
    public int calcula(int a, int  b){
        return a+b;
    
    }
    public double calcula(double a, double b){
        return a+b;
    }
    public String calcula(String a, String b){
        return a+b;
    }
    public static void main (String[] args){
        ExCalculadora calc = new ExCalculadora();
        System.out.println(calc.calcula(1,1));
        System.out.println(calc.calcula(2.0,2.1));
        System.out.println(calc.calcula("vi","ram?"));
    }
}
