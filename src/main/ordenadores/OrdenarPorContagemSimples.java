package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        if (array == null || array.length <= 1) {
            return array; 
        }

        
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        
        int[] count = new int[max + 1];

        
        for (int i : array) {
            count[i]++;
        }

        
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[index++] = i;
                count[i]--;
            }
        }

        return array;
    }
}
