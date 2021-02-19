import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        int x;
        x = 1;
        x =2;
        x =3;
        System.out.println("x:"+x);

        final int y;
        y = 1;

        String strVal = "test";
        System.out.printf("test\n\n~~");


        float Floatval;
        Floatval = 3.141592635f;
        System.out.println(Floatval);
        System.out.printf("%f",Floatval);
        System.out.println("\n");


        int data = 100 ;
        System.out.println("\ndata:\t"+data);
        // integer to string : Integer.toString()
        String datastring = Integer.toString(data);
        System.out.println("\ndatastring:\t"+datastring);

        // String to integer :
        String stringdata = "100021";
        int dataint = Integer.parseInt(stringdata);
        System.out.println("\ndataint:"+ dataint);
    }
}
