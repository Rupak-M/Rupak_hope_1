public class WrapperEX {
    public static void main(String[] args) {
        Integer iObj=Integer.valueOf(100);
        Double dObj=Double.valueOf(2.5);
        Character cObj=Character.valueOf('S');
        System.out.println("Integer value: "+iObj.intValue());
        System.out.println("Double value: "+dObj.doubleValue());
        System.out.println("Character value: "+cObj.charValue());
        String strNum="50";
        int pInt=Integer.parseInt(strNum);
        System.out.println("Parsed integer: "+pInt);
        String strDouble="54.3";
        double pDouble=Double.parseDouble(strDouble);
        System.out.println("Parsed double: "+pDouble);
        String strChar="N";
        char pChar=strChar.charAt(0);
        System.out.println("Parsed character: " + pChar);
        Integer iObj1=Integer.valueOf(100);
        Integer iObj2=Integer.valueOf(100);
        System.out.println(iObj1.equals(iObj2));
        System.out.println((iObj1 == iObj2));
        System.out.println(iObj1.compareTo(iObj2));
        char ch='Z';
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(iObj.toString());
    }
}