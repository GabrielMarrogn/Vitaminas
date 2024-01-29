import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int diferenca = 0;
        int total;
        int num = 0;
        String entrada;
        
        while (a != 0) {
            total = 0;
            for(int i = 0; i < a; i++){
               num = sc.nextInt();
               entrada = sc.nextLine().replace(" ", "");;

                total += vitamina(num, entrada);

            }
            if(total > 130){
                diferenca = total - 130;
                System.out.println("Menos " + diferenca +" mg");
            }else if(total < 110){
                diferenca = 110 - total;
                System.out.println("Mais " + diferenca +" mg");
            }else if(total >= 110 & total <= 130){
                System.out.println(total +" mg");
            }
            a = sc.nextInt();
        }

        sc.close();
        
    }

    public static int vitamina(int a, String b){
        int v = 0;
        if(b.equals("sucodelaranja")){
            v = a * 120;
        }else if(b.equals("morangofresco")){
            v = a * 85;
        }else if(b.equals("mamao")){
            v = a * 85;
        }else if(b.equals("goiabavermelha")){
            v = a * 70;
        }else if(b.equals("manga")){
            v = a * 56;
        }else if(b.equals("laranja")){
            v = a * 50;
        }else if(b.equals("brocolis")){
            v = a * 34;
        }

        return v;
    }
}
