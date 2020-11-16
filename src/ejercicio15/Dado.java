package ejercicio15;

import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Dado {

    private final LongAdder[] dados = {new LongAdder(), new LongAdder(), new LongAdder()
            , new LongAdder(), new LongAdder(), new LongAdder()};

    protected int lanzarDado() {
        Random random = new Random();

        return random.nextInt(6) + 1;


    }

    protected void aumentarContador(int num) {
        dados[num - 1].increment();
    }

    public void showCounters() {
        double total = dados[0].intValue() + dados[1].intValue() + dados[2].intValue()
                + dados[3].intValue() + dados[4].intValue() + dados[5].intValue();
        System.out.printf("Número 1: %d veces\n" +
                        "Número 2: %d veces\n" +
                        "Número 3: %d veces\n" +
                        "Número 4: %d veces\n" +
                        "Número 5: %d veces\n" +
                        "Número 6: %d veces\n" +
                        "Total de veces: %d + %d + %d + %d + %d + %d = %.0f", dados[0].intValue(), dados[1].intValue(), dados[2].intValue()
                , dados[3].intValue(), dados[4].intValue(), dados[5].intValue(), dados[0].intValue(), dados[1].intValue(), dados[2].intValue()
                , dados[3].intValue(), dados[4].intValue(), dados[5].intValue(), total);
    }
}
