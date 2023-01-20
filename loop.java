import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        /* FOR
        for(int cont=0; cont < 10; cont++){
            System.out.printf("Marcos %d \n", cont);

        }
        */
        // WHILE
        Scanner scan=new Scanner (System.in);
        int max = scan.nextInt();
        int cont = 0;
        while(cont < max){
            System.out.println(cont + " Marcos");
            cont++;
        }
        scan.close();
        
        /* DO WHILE
        int cont=0;
        do{
            System.out.println(" Marcos");
            cont++;
        }while (cont < 0);
            System.out.println(cont + " Marcos");
            cont++;
            */ 

    }
}
