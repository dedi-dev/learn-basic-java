package basic;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.UUID;

public class BasicApp {
    public static void main(String[] args) {
        /// StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append("nama");
        builder.append(" ");
        builder.append("Saya ");
        builder.append("Dedi");

        String name = builder.toString();
        System.out.println(name);

        /// StringJoiner
        String[] names = {"Dedi", "AcA", "Azmi"};
        StringJoiner joiner = new StringJoiner("||", "[", "]");

        for (String string : names) {
            joiner.add(string);
        }

        System.out.println(joiner.toString());

        /// StringTokenizer
        StringTokenizer tokenizer = new StringTokenizer(joiner.toString(), "||");
        while (tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }

        /// Number
        Integer intValue = 100;
        Long longValue = intValue.longValue();
        Short shortValue = longValue.shortValue();

        String strValue = "1000";
        Double dblValue = Double.valueOf(strValue);
        Double dblPValue = Double.parseDouble(strValue);

        /// Math
        System.out.println(Math.ceil(11.5));

        /// Big Number
        BigInteger bigA = new BigInteger("99999999999999999999999999999999999999999999999");
        BigInteger bigB = new BigInteger("99999999999999999999999999999999999999999999999");
        BigInteger bigC = bigA.add(bigB);
        System.out.println(bigC);

        /// Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DATE, 4);
        calendar.set(Calendar.HOUR_OF_DAY, 23);

        Date tanggal = calendar.getTime();
        System.out.println(tanggal);
        calendar.add(Calendar.YEAR, -2);
        System.out.println(calendar.getTime());


        /// System Class
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        // System.out.println(System.getenv("PATH"));

        /// Runtime Class
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors() + " available processor");
        System.out.println(runtime.freeMemory() + " free memory");
        System.out.println(runtime.totalMemory() + " total memory");
        System.out.println(runtime.maxMemory() + " max memory");

        /// UUID
        UUID uuid = UUID.randomUUID();
        String key = uuid.toString();
        System.out.println(key);
    }
}
