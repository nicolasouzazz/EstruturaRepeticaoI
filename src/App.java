public class App {
    public static void main(String[] args) throws Exception {

        /* Estrutura de repetição - while */

        System.out.println("Estrutura de Repetição I");
        System.out.println("==========================");

        // int contador = 0;

        /*
         * Uso do while contador de cambalhotas
         * 
         * Enquanto contador for menor ou igual 5 executa o bloco
         * while (contador <= 5) {
         * System.out.println("Contador de cambalhotas:" + contador);// contador +1 para
         * exibir a contagem correta
         * contador++;
         * System.out.println("==========================");
         * }
         * System.out.println("Fora do while, o contador vale:" + contador); // Exibe o
         * valor final do contador, logo não entra no loop.
         * 
         * System.out.println("==========================");
         * 
         */

        /*
         * Uso do continue muda o fluxo do laço
         * 
         * while (contador<10) {
         * contador++;
         * if (contador == 5 || contador == 7 || contador == 9) {
         * continue;// pula as iterações 5,7 e 9
         * }
         * System.out.println("Contador de cambalhotas:" + contador);
         * System.out.println("==========================");
         * }
         * sout.println("Continue acionado...");//logo 5,7,9 não são exibidos
         */

        /*
         * Uso do break para sair do laço
         * 
         * while (contador < 10) {
         * contador++;
         * if (contador == 3) {
         * break;// sai do laço quando contador for igual a 3
         * }
         * System.out.println("Contador de cambalhotas:" + contador);
         * System.out.println("==========================");
         * }
         * System.out.println("Break acionado...");// logo que contador for igual a 3
         * sai do laço
         * 
         */
        /*
         * Ex1 - Verificar erro de compilação
         * 
         * char c = 'c';
         * int i = 10;
         * double d = 10;
         * long l = 1;
         * String s = "Hello";
         * 
         * // c = c + i; erro de compilação
         * // s += i; correta
         * // i += s; erro de compilação
         * // c += s; erro de compilação
         * // i += l; correta
         */

        /* Ex2 - Valores impressos */
        int i = 1;
        int a = 0;
        while (i < 10) {
            ++a;
            i = i + 1;
            if(a>6)++i;
        }
        System.out.println(i);
        System.out.println(a);
    }
}
