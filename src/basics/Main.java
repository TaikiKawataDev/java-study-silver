package basics;


public class Main {
    public static void main(String[] args) {
        System.out.println("Java学習スタート！");

        //equalsメソッドにnullを渡すとNullPointerExceptionが発生する
        Object a = new Object();
        Object b = null;
        System.out.println(a.equals(b));

        //swich文条件式が戻せる型は int, byte, short, enum, String, char のみ
        //long, float, double, boolean は使用できない
        
        int c = 1;
        for (int i = 2, total = 0; i <= 5; i++) {
            total += c * i;
        }
        //System.out.println(total); for文ので宣言した変数のスコープはfor文の外では使用できない
    }
}
