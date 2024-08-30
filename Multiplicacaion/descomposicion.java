import java.util.Scanner;

class descomposicion
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("ingrese un numero: ");
        a = leer.nextInt();
        c = a;
        d=0;
        if(a<10)
        {
            System.out.println("se descomposicion es: "+a);
        } else
        {
            while(c>=10)
            {
                b=c%10;
                c=c/10;
                e=10^d;
                System.out.println("sus datos son: "+b);
                if(c<10)
                {
                    System.out.println("sus datos son: "+c);
                }
                d++;
            }
        }
    }
}