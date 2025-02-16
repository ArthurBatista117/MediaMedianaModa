/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediamedianamoda;

/**
 *
 * @author alexb
 */
public class MediaMedianaModa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int sizeData = 99;
        int[] data = new int[sizeData];
        for(int i=0; i<sizeData; i++){
            data[i] =  (int) (1+ Math.random() * 10);
            System.out.print(data[i] + " ");
            if(i % 10 == 0 && i != 0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Media:");
        System.out.println(media(data));
        System.out.println("Mediana: ");
        System.out.println(mediana(data));
    }
    
    private static int soma(int [] ve) {
        int s = 0;
        for(int i=0; i<ve.length; i++){
            s += ve[i];
        }
        return s;
    }
    public static float media(int[] vet) {
        int so = soma(vet);
        float media = so / vet.length;
        return media;
    }
    
    public static float mediana(int[] vet){
        int n = vet.length;
        if (n % 2 == 0){
            int n1 = n / 2 - 1;
            int n2 =  n / 2;
            return (n1+n2) / 2;
        } else{
            int num = n/2;
            return vet[num];
        }
        
    }
}
