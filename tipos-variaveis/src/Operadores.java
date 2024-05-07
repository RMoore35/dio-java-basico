public class Operadores {
    public static void main(String[] args) {
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";

        System.err.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.err.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";

        System.err.println(concatenacao);
        
        concatenacao = "1"+1+1+1;

        System.err.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);

        System.err.println(concatenacao);
    }
}
