import java.util.Scanner;
class multiplicacion
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        int a,b,c;
        System.out.println("ingrese un numero: ");
        a = leer.nextInt();
        System.out.println("ingrese otro numero: ");
        b = leer.nextInt();
        c = a;
        for(int x=1;x<=b;x++)
        {
            for(int y=1;y<=b;y++)
            {
                c = c+a;
            }
            System.out.println("el numero es: " +c);
        }
    }
}