public class quickshort {
    public static void main(String[] args) {

        int[] vetor = { 2, 5, 6, 8, 4, 1 };

        arrumarapido(vetor, 0, vetor.length - 1);

        for (int x : vetor) {
            System.out.println(x);
        }

    }

    public static void arrumarapido(int[] vet, int min, int max) {

        if (max <= min) {
            return;
        }

        int pivo = partition(vet, min, max);
        arrumarapido(vet, min, pivo - 1);
        arrumarapido(vet, pivo + 1, max);

    }

    private static int partition(int[] vet, int min, int max) {

        int pivo = vet[max];
        int i = min - 1;
        for (int j = min; j <= max - 1; j++) {
            if (vet[j] < pivo) {
                i++;
                int temp = vet[i];
                vet[i] = vet[j];
                vet[j] = temp;
            }
        }
        i++;

        int temp = vet[i];
        vet[i] = vet[max];
        vet[max] = temp;

        return i;
    }

}