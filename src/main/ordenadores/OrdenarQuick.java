package ordenadores;

public class OrdenarQuick implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        if (array == null || array.length <= 1) {
            return array; // Already sorted or no elements to sort
        }

        quicksort(array, 0, array.length - 1);

        return array;
    }

    private void quicksort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = quickParticio(array, inicio, fim);
            quicksort(array, inicio, indicePivo - 1);
            quicksort(array, indicePivo + 1, fim);
        }
    }

    public int quickParticio(int[] array, int inicio, int Fim){
        int pivo = array[Fim];
        int i = inicio - 1;

        for (int j = inicio; j < Fim; j++) {


            if (array[j] <= pivo) {
                i++;

                int temp = array[i+1];

                array[i+1] = array[Fim];

                array[Fim] = temp;
            }
        }

        int temp = array[i +1];

        array[i +1] = array[Fim];
        
        array[Fim] = temp;

        return i;
    }
}
