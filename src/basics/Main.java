package basics;


public class Main {
    public static void main(String[] args) {
        System.out.println("Java学習スタート！");

        System.out.println("演算子と制御構造");
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
        
        System.out.println("基本データ型と文字列の操作");

        System.out.println("以下の変数の宣言はエラーになる");
        //double a = 1_.0;
        //int b = _100;
        //int c = 100_;
        //byte d = 0b_100;
        //int e = 0x_100;

        System.out.println("varのNG利用方法");
        //var a;
        //var b = null;
        //var c = {1, 2, 3};
        //public void Sample(var value) { eny code,,, }
        
        System.out.println("Stringクラスを利用した文字列の生成");
        String str = "Sample";
        String str2 = new String("Sample");
        String str3 = String.valueOf("Sample");
    }
}
