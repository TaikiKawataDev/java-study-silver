package basics;

public interface Interfes {
    //java.lang.objectクラスに定義されているメソッドをdefaultメソッドでオーバーライドできない

    //スーパークラスのデフォルトメソッドの呼び出しは、"クラス名.super.メソッド()" その際、間に別のクラスを挟んで呼び出せない

    //オーバーライドの条件は、シグニクチャが同じかつ戻り値が同じもしくはそのラッパークラスなどである必要がある

    //public class B extends A {@override void sample()}
    //A a = new B() a.sample
    //まずA型にsample()があるかコンパイル時に確認。なければコンパイルエラー。
    //Bクラスがオーバーライドしていた場合は、Bクラスのsampleを使用
    //していなければ、Aクラスで実装されたsample()が使用される。
}
