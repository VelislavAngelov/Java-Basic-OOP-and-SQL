package task_7_VariablesExercises;

import java.util.*;

public class CurrencyExchangeBureauVariables {

//    Имате поръчка да направите софтуер, който обслужва чейндж бюро на летището.
//    Бюрото работи само с левове, долари и евро.
//    Дефинирайте еднозначно какви променливи можете да имате и от какъв тип ще бъдат.

    public static void main(String[] args) {

//        int lev = 1;
//        double usd = 1.83 * lev;
//        double euro = 1.95 * lev;
        int[][]arr={{1,3,5,13,14,15,16,17},{2,4,6,7},{8,9,10,11,12}};
       System.out.println(Arrays.toString(zipMany(arr)));



         //System.out.println(Arrays.toString(zipMany(arrrr)));

//        int[]arr={1,2,3,4,5};
//        rotate(arr,-1);
//        System.out.println(Arrays.toString(arr));

    }

    /**
     * Berechnet für das übergebene Array die Summe der Quadrate der Einträge.
     * Gibt dabei einen Fehler aus und -1 zurück, wenn ein Overflow entsteht.
     *
     * @param array Ein beliebiges Integer-Array.
     * @return Die Summe der Quadrate, wenn diese in einen 'long' passt, -1 sonst.
     */
    public static long sumOfSquares(int[] array) {

        long square = 1;
        long sum = 0;

        if (array.length == 0) {
            return 0;
        }
        for (int j : array) {
            square = (long) j * j;
            if (square < 0) {
                System.out.println("Overflow!");
                return -1;
            }
            sum += square;

        }
        return sum;
    }


    /**
     * Methode, die zwei Arrays zu einem verbindet, indem sie abwechselnd Einträge des ersten und des zweiten Input-
     * Arrays verwendet.
     *
     * @param a Ein beliebiges Integer-Array.
     * @param b Ein beliebiges Integer-Array.
     * @return 'a' und 'b' zusammengezipped.
     */
    public static int[] zip(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        int endLength = 0;

        if (a.length > b.length) {
            endLength = a.length;
        } else {
            endLength = b.length;
        }

        for (int i = 0, j = 0; i < endLength; i++) {

            if (i < a.length && i < b.length) {
                arr[j++] = a[i];
                arr[j++] = b[i];

            } else if (i < a.length) {
                arr[j++] = a[i];

            } else {
                arr[j++] = b[i];
            }
        }
        return arr;
    }

    /**
     * Methode, die eine beliebige Zahl an Arrays (dargestellt als Array von Arrays) zu einem einzigen Array verbindet,
     * indem sie abwechselnd von jedem Array einen Eintrag nimmt, bis alle aufgebraucht sind.
     *
     * @param arrays Array von Integer-Arrays
     * @return Die Arrays in 'arrays' zusammengezipped
     */
    public static int[] zipMany(int[][] arrays) {

        HashMap<Integer,Integer> hashMap= new HashMap<>();

        for (int i = 0; i < arrays.length; i++) {

            for (int j = 0; j < arrays[i].length; j++) {

                hashMap.put(i+(j*arrays.length),arrays[i][j]);
            }
        }
        int[] arr = new int[hashMap.size()];
        int j=0;
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {

            arr[j]=entry.getValue();
            j++;
        }

        return arr;
    }

    /**
     * Behält aus dem übergebenen Array nur die Einträge, die innerhalb der übergebenen Grenzen liegen.
     * Gibt das Ergebnis als neues Array zurück.
     *
     * @param array Ein beliebiges Integer-Array
     * @param min   Ein beliebiger Integer
     * @param max   Ein beliebiger Integer
     * @return Das gefilterte Array
     */
    public static int[] filter(int[] array, int min, int max) {
        // TODO
        return null;
    }

    /**
     * Rotiert das übergebene Array um die übergebene Anzahl an Schritten nach rechts.
     * Das Array wird In-Place rotiert. Es gibt keine Rückgabe.
     *
     * @param array  Ein beliebiges Integer-Array
     * @param amount Ein beliebiger Integer
     */
    public static void rotate(int[] array, int amount) {
        if (amount < 0) {
            amount *= -1;

            for (int i = 0; i < amount; i++) {
                int firstDigit = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = firstDigit;
            }

        } else {
            for (int i = 0; i < amount; i++) {
                int digit2;
                digit2 = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = digit2;
            }
        }

    }

    /**
     * Zählt die Anzahl an Vorkommen jeder Zahl im übergebenen Array, die in diesem mindestens einmal vorkommt.
     * Die Rückgabe erfolgt über ein 2D-Array, bei dem jedes innere Array aus zwei Einträgen besteht: Einer Zahl,
     * die im übergebenen Array vorkommt sowie der Anzahl an Vorkommen dieser.
     * Für jede im übergebenen Array vorkommenden Zahl gibt es ein solches inneres Array.
     * Diese tauchen im Rückgabewert in der gleichen Reihenfolge auf, in der die jeweils ersten Vorkommen der Zahlen
     * im übergebenen Array auftauchen.
     *
     * @param array Ein beliebiges Integer-Array
     * @return Das Array mit den Vielfachheiten der einzelnen Zahlen, wiederum als Integer-Arrays mit zwei Einträgen dargestellt.
     */
    public static int[][] quantities(int[] array) {
        // TODO
        return null;
    }
}



