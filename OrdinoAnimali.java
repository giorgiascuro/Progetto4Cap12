import java.util.ArrayList; 
import java.util.Scanner; 
public class OrdinoAnimali {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        ArrayList<Animale> lista = new ArrayList<>();
        boolean end = false;
        while (!end) {
            Animale animale = new Animale();
            System.out.println("nome");
            String nome = tastiera.next();
            animale.setNome(nome);
            System.out.println("eta");
            int eta = tastiera.nextInt();
            animale.setEta(eta);
            System.out.println("peso");
            double peso = tastiera.nextDouble();
            animale.setPeso(peso);
            lista.add(animale);
            System.out.println("ora scrivi \'continua\' o scrivi \'end\'");
            String risposta = tastiera.next();
            if (risposta.equals("end"))
                end = true;
            }
        for (Animale animale : lista) {
            System.out.println(animale.toString());
        }
    }
}
        
        
            
            
        
        
        