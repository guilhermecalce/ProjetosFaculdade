/*Bubble Sort

public class MedioCaso {

    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis();
        long tempoFinal = System.currentTimeMillis();
        int i;
        int[] chave = new int[500];
        int n = chave.length;
        geraVetor(chave);
        tempoInicio = System.currentTimeMillis();
        bubbleSort(chave, n);
        tempoFinal = System.currentTimeMillis();
        System.out.println("");
        System.out.print("Tempo Total: " + (System.currentTimeMillis() - tempoInicio));

    }

    static void geraVetor(int[] chave) {
        System.out.println("Valor ordenado: ");
        for (int i = 0; i < chave.length; i++) {
            chave[i] = (int) (501 * Math.random());
            System.out.print(chave[i] + " ");
        }

    }

    public static void bubbleSort(int[] chave, int n) {
        int temp;
// inicia o Bubble Sort
        for (int i = 0; i < n; i++) {
            try {
                Thread.sleep(1);

            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
            for (int j = 1; j < n - i; j++) {

                if (chave[j - 1] > chave[j]) {
//troca os elementos
                    temp = chave[j - 1];
                    chave[j - 1] = chave[j];
                    chave[j] = temp;

                }
            }
        }
    }

}

/*Insertion Sort
public class MedioCaso {

    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis();
        long tempoFinal = System.currentTimeMillis();
        int i;
        int[] chave = new int[50000];
        int n = chave.length;
        geraVetor(chave);
        tempoInicio = System.currentTimeMillis();
        insertionSort(chave);
        tempoFinal = System.currentTimeMillis();
        System.out.println("");
        System.out.print("Tempo Total: " + (System.currentTimeMillis() - tempoInicio));

    }

    static void geraVetor(int[] chave) {
        System.out.println("Valor ordenado: ");
        for (int i = 0; i < chave.length; i++) {
            chave[i] = (int) (50001 * Math.random());
            System.out.print(chave[i] + " ");
        }

    }

    static void insertionSort(int[] chave) {
        int j, aux;
        for (int i = 1; i < chave.length; i++) {
            try {
                Thread.sleep(1);

            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
            aux = chave[i];
            for (j = i - 1; j >= 0 && aux < chave[j]; j--) {
                chave[j + 1] = chave[j];
            }
            chave[j + 1] = aux;
        }
    }

}
 */

 /* Selection Sort*/
public class MedioCaso {

    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis();
        long tempoFinal = System.currentTimeMillis();
        int i;
        int[] chave = new int[500];
        int n = chave.length;
        geraVetor(chave);
        tempoInicio = System.currentTimeMillis();
        selectionSort(chave);
        tempoFinal = System.currentTimeMillis();
        System.out.println("");
        System.out.print("Tempo Total: " + (System.currentTimeMillis() - tempoInicio));

    }

    static void geraVetor(int[] chave) {
        System.out.println("Valor ordenado: ");
        for (int i = 0; i < chave.length; i++) {
            chave[i] = (int) (501 * Math.random());
            System.out.print(chave[i] + " ");
        }

    }

    static void selectionSort(int[] chave) {
        int j, min, aux;
        for (int i = 0; i < chave.length - 1; i++) {
            try {
                Thread.sleep(1);

            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
            min = i;
            for (j = i + 1; j < chave.length; j++) {
                if (chave[j] < chave[min]) {
                    min = j;
                }
            }
            if (i != min) {
                aux = chave[i];
                chave[i] = chave[min];
                chave[min] = aux;
            }
        }
    }

}
*/
