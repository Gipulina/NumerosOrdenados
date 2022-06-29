import java.util.Scanner;

 public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [4];
        int num, aux;
        //introducción de numeros.
        for(int i = 0 ; i < numeros.length; i++){
            System.out.println("Por favor introduzca un numero");
            num = sc.nextInt();
            //Confirma que el numero es negativo
            while (num<0){
                System.out.println("No es positivo!!!, vuelva a ingresar un numero");
                num = sc.nextInt();
            }
        numeros[i] = num;
        }
        for(int i=0; i<numeros.length; i++){
            for(int k = i ; k<numeros.length; k++){
                if(numeros[k]>numeros[1]){
                    aux = numeros[i];
                    numeros[i] = numeros[k];
                    numeros[k] = aux;
                }
            }
        }
        //muestra el contenido del array
        System.out.println("Los numeros son: ");
        for(int n:numeros){
            System.out.println(n + ",");
        }
    }
}