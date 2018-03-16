

/**
 *
 * @author Ariel
 */



public class Principal {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int Arr[] = new int[5];
        Arr[0]=1;
        Arr[1]=2;
        Arr[2]=3;
        Arr[3]=4;
        Arr[4]=5;
        /*for (int i : Arr) {
            System.out.println(i);
        }*/
        ImprimeArr(Arr);
        System.out.println("Después de cambiar los datos del arreglo");
        Arr[0]=6;
        Arr[1]=7;
        Arr[2]=8;
        Arr[3]=9;
        Arr[4]=10;
        /*for (int i : Arr) {
            System.out.println(i);
        }*/
        ImprimeArr(Arr);
        
    }
    
    public static void ImprimeArr(int[] iArre){
        for (int i : iArre) {
            System.out.println("Valor = " +i);
        }
    }
    
    
    
    
}
