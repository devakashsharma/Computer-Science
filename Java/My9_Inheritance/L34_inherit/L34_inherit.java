package Java.My9_Inheritance.L34_inherit;

public class L34_inherit {
    public static void main(String[] args) {
        // L34_inherit_Calc obj = new L34_inherit_Calc();
        // L34_inherit_AdvCalc obj = new L34_inherit_AdvCalc();
        L35_inherit_SupCal obj = new L35_inherit_SupCal();
        int n1 = obj.add(2,4);
        int n2 = obj.sub(9,3);
        int n3 = obj.multi(2, 3);
        int n4 = obj.div(24, 4);
        double n5 = obj.power(4, 2);

        System.out.println("[" + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5+ "]");
    
    }
}
