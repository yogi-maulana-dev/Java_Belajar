public class TipeDataNumber {
    public static void main(String[] args){
        byte iniByte = 100;
        short iniShort = 10000;
        int iniInt = 1000000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;
        float iniFloat = 3.14f;
        double iniDouble = 3.14;

        int decimalInt = 34; 
        int hexaDecimal = 0xFF;
        int binaryDecimal = 0b1010;

        int mount = 1000_000_000;

        System.out.println("Byte: " + iniByte);
        System.out.println("Short: " + iniShort);
        System.out.println("Int: " + iniInt);
        System.out.println("Long: " + iniLong);
        System.out.println("Long2: " + iniLong2);
        System.out.println("Float: " + iniFloat);
        System.out.println("Double: " + iniDouble);
        System.out.println("Decimal: " + decimalInt);
        System.out.println("Hexadecimal: " + hexaDecimal);
        System.out.println("Binary: " + binaryDecimal);
        System.out.println("M2aount: " + mount);  
    }
}