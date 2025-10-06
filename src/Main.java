public class Main {
    public static void main(String[] args) {

    int[] rzeczywiste =new int[] {1,25,225,36,25,16,9,49,64,121};
    for(int i = 0;i<rzeczywiste.length;i++) {
        double Zmienna = Math.sqrt(rzeczywiste[i]);
        System.out.println(Zmienna);
    }
    int[] Fibonnaci=new int[40];
        int li1=1;//mniejsza
        int li2=1;//wieksza
        for (int i = 0; i < 40; i++) {

        int sum=li1+li2;
        Fibonnaci[i]=sum;
        li1=li2;
        li2=sum;





        }
        for (int i = 0; i <40 ; i++) {
            System.out.println(Fibonnaci[i]);
        }

    }
}