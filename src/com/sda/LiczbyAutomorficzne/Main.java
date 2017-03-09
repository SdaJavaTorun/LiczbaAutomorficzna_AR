package com.sda.LiczbyAutomorficzne;

public class Main {
    /*
    Liczbami automorficznymi nazywamy takie liczby, które podniesione do kwadratu zawierają w końcówce samą siebie.
     Np. 5 pow 2 = 25, 6 pow 2 = 36. Ciekawostką jest to że, liczby automorficzne w zapisie dziesiętnym zawsze kończą się na 5 lub 6.
    Czy liczba naturalna n o dowolnej podstawie m jest automorficzna można sprawdzić za pomocą następującego równania:
    n=(n pow 2)*mod*(m pow k)
    Gdzie:
    n to badana liczba,
    m to podstawa liczby,
    k oznacza ilość cyfr w liczbie n.
    */

    public static boolean autoNumber (double n, int m) {
        int k = 1;       // z ilu cyfr składa sie liczba
        double n2 = n;
        double result = 0;

        while ((n2 / 10) > 1) {
            n2 = n2 / 10;
            k++;
        }
        result = (n*n)%(Math.pow(m,k));

        if (result == n) return true;
        else return false;
    }

    public static void main(String[] args) {

        double n = 976;  // liczba do sprawdzenia.
        int m = 10;   // podstawa liczby
        if (autoNumber(n,m) == true)
            System.out.println("Liczba n: " + n + " jest automorficzna.");
        else
            System.out.println("Liczba n: " + n + " nie jest automorficzna.");
    }
}
