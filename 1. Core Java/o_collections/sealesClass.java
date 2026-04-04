final class A{

}

sealed class B permits C,D {
}

// permitted classe should be sealed or final or non sealed
final class C extends B{

}

final class D extends B{

}


public class sealesClass {
    public static void main(String[] args) {
        
    }
}
