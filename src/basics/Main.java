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

        System.out.println("クラスの定義とインスタンスの使用");
        System.out.println("レコードのコンストラクタのアクセス修飾詞について");
        //レコードクラスより厳しいアクセス修飾詞をコンストラクタに指定してはいけない
        //レコードクラスは他のクラスを継承できない代わりにインタフェースの実現は可能である。
        //デフォルトメソッドが定義されていて、レコードとgetterとインタフェースのデフォルトメソッドの名前が同じ場合
        //getterがデフォルトメソッドをオーバーライドするその際、シグニクチャや戻り値が違うとコンパイルエラーが発生する

        System.out.println("抑制された例外について");
        //Aクラスのtry with resources内で例外が発生するとcloseメソッドが呼ばれる
        //closeメソッドでも例外が発生した際には、Aクラスで発生した例外に隠れてしまい、catchできない。
        //これを抑制された例外という
    }

    //オーバーロードの条件
    //引数の型、数、順番が違う
    //オーバーロードは同じクラス内で同じ名前のメソッドを定義できる
    public int calc(int a, int b) {
        return a + b;
    }
    public int calc(int a, int b, int c) {
        return a + b + c;
    }

}
