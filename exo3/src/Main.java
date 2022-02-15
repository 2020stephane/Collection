public class Main {

    Integer[] tabInt ={1,2, 3, 4, 5, 6, 7, 8, 10, 12, 18};
    Character[] tabCarac ={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
    int nbr = 0;

    public Main(){
        for(Integer obj : tabInt)
            if (testParite(obj)){
                nbr += 1;
        }
        System.out.println("nombre d'entier pair = " + nbr);
        nbr = 0;
        for(Character obj : tabCarac)
            if (testParite(obj)){
                nbr += 1;
            }
        System.out.println("nombre de caractere pair = " + nbr);
    }

    public static void main(String[] args) {  new Main(); }

    public static boolean testParite(int obj ) {
        if ( obj% 2 == 0){
            return (true);
        } else {
            return false;
        }
    }
}
