import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaComandi = new ArrayList<>();
        boolean stop = false;
        String tab = "\t";
        String appoggio;
        String s = "public class main {";
        String s1 = "public static void main(String[] args) {";
        String s2 = "}";
        String c = "switch(){"; //inizio del case;
        String c1 = "case ";
        String c11 = ":";
        String c2 = "break;";
        String c3 = "default:";

        while(!stop){
            appoggio = sc.nextLine();
            if(appoggio.equals("stop") ){
                stop = true;
            }
            else{
                listaComandi.add(appoggio);
            }


        }



        System.out.println(s);
        System.out.println(tab + s1); //inizio main
        //codice
        System.out.println(tab +tab +c); //primo case
        for(int i = 0; i<listaComandi.size(); i++){

            System.out.println(tab + tab +tab +c1 + i + c11) ;
            System.out.println(tab +tab +tab +listaComandi.get(i) + ";");
            System.out.println(tab +tab +tab +c2); //break
        }




        System.out.println(tab +tab +tab +c3); //default
        System.out.println(tab +tab +s2); //chiusura switch


        System.out.println(tab +s2); //fine main
        System.out.println(s2);



    }
}
