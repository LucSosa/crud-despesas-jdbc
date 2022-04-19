package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("2BBG3", "Pixel");
        Smartphone s3 = new Smartphone("SSG36", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);

        //smartphones.clear(); Limpa o array

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("XI987", "Xiaomi");
        smartphones.add(s4);
        System.out.println(smartphones.contains(s4));//retorna true ou false, para saber se existe
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}