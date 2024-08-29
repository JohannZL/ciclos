import java.util.Scanner;

class descomposicion
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        int a,b,c,d=0;
        System.out.println("ingrese un numero: ");
        a = leer.nextInt();
        c = a;
        if(a<10)
        {
            System.out.println("se descomposicion es: "+a);
        } else
        {
            while(c>=10)
            {
                b=c%10;
                System.out.println("sus datos son: "+b);
                c=c/10;
                d++;
            }
        }
    }
}