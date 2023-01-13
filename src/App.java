import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        String[] lista1 = new String[]{"morango", "uva", "acerola", "manga"};
        String[] lista2 = new String[]{"pêra", "caju", "morango", "kiwi"};
        
        for(int i = 0; i <= lista1.length-1; i++){
            for(int j = 0; j <= lista2.length-1; j++){
                if(lista1[i] == lista2[j]){
                    System.out.println(lista1[i]);
                }
            }
        }
    }
}
