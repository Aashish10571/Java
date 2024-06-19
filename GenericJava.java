class GenericClass<G extends Number> {
    private final G a;
    private final G b;

    GenericClass(G a, G b) {
        this.a = a;
        this.b = b;
    }

    public G add() {
        if (a instanceof Integer)
            return (G) (Integer) (a.intValue() + b.intValue());
        else if (a instanceof Double)
            return (G) (Double) (a.doubleValue() + a.doubleValue());
        else
            return null;
    }
}

public class GenericJava {
    public static void main(String[] args) {
        GenericClass<Integer> integerGenericClass = new GenericClass<>(1, 2);
        GenericClass<Double> doubleGenericClass = new GenericClass<>(1.2, 2.2);
        GenericClass<Float> floatGenericClass = new GenericClass<>(1.2f, 2.3f);

        System.out.println(integerGenericClass.add());
        System.out.println(doubleGenericClass.add());
        System.out.println(floatGenericClass.add());
    }
}
