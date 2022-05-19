package ZadachkiPosleEkzamena;

import java.util.ArrayList;

public class Arithmeticlmpl implements Arithmetic {
    @Override
    public double getSum(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public int getSum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum = sum + arrayList.get(i);
        }
        return sum;

    }

    @Override
    public Integer[] getCountAndSum(ArrayList<Integer> arraylist) {
        Integer[] integer = new Integer[2];
        int count = 0;
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i) > 0) {
                count++;
            }
        }
            if (count == 0 || arraylist == null) {
                integer[0] = null;
                integer[1] = null;
            } else {
                integer[0] = count;
                integer[1] = getSum(arraylist);
            }
        return integer;
    }
}

