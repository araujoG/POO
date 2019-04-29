package animais;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal animais[] =  new Animal[10];
        //Random gerador = new Random();
        for (int i = 0; i < 10; i++){
            int r = (int)(Math.random() * 3);
            switch (r) {
                case 0:
                    animais[i] = new Cao();
                    break;
                case 1:
                    animais[i] = new Gato();
                    break;
                case 2:
                    animais[i] = new Homem();
                    break;
            }
        }
        for (int i = 0; i < 10; i++){
            animais[i].fala();
        }

    }

}
