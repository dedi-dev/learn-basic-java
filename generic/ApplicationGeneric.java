package generic;

public class ApplicationGeneric {
    public static void main(String[] args) {
        MyData<String> dataString = new MyData<String>("Dedi");
        MyData<Integer> dataInteger = new MyData<>(20);

        String strData = dataString.getData();
        Integer intData = dataInteger.getData();

        Pair<String, Integer> pairdata = new Pair<String,Integer>("key", 10);
        String first = pairdata.getFirst();
        Integer second = pairdata.getSecond();

        String[] names = {"Dedi", "Aca", "Azmi"};
        Integer[] numbers = {1, 2, 3, 4};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(numbers));

        process(dataInteger);

        MyData<? super String> contraVariant = new MyData<>("testing");
        processing(contraVariant);

        // contoh bounded type generic
        NumberData<Integer> number = new NumberData<>(10);
        // NumberData<String> numString = new NumberData<>("sepuluh");  // will error because String os non member of Number object
    }

    // invariant = type data tidak bisa di subtitusi
    // covariant = type data bisa di subtitusi untuk child nya
    //contravariant = type data bisa di subtitusi parent nya

    // contoh covariant, covariant hanya bisa get data saja
    public static void process(MyData<? extends Object> myData) {
        // myData.setData("Eko"); error tidak bisa set data,
        System.out.println(myData.getData());
    }

    // contoh contravariant, set data aman, utk get data harus hati hati.
    public static void processing(MyData<? super String> myData) {
        System.out.println(myData.getData()); // agak tidak aman, harus hati hati
        Object gObject = myData.getData();
        String gString = (String )myData.getData(); // perlu di conversi secara manual walaupun sebenarnya agak berbahaya
        myData.setData("myData");
    }
}
