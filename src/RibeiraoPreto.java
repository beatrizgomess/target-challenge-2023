import java.text.DecimalFormat;

public class RibeiraoPreto {
    public static void main(String[] args) {

        /*
        Logica:

            Parecia mais fácil começar pelo calculo de tempo viagem sem os obstaculos
            pois seria um cálculo mais direto.

            Depois disso, cálcular isoladamente o tempo gasto nos pedágios e somar ao tempo anterior,
            visto que, se ele fosse sem intercorrências no caminho, gastaria x tempo, entretanto houve 10 min a mais
            por conta do pedagio.

            Somando os dois tempo, conseguiriamos definir quanto ele gastou para pecorrer a distância com o novo tempo definido.
            E como durante o percurso do carro, segundo o enunciado, nao houve intercorrências, não foi necessario calcular
            um novo tempo para ele. Pois ele se manteve a 110km/h

            E o cálculo final, seria necessário apenas dividr as suas velocidades dos dois pela distância percorrida.

         */

        double velocidadeCarro = 110.0;
        double velocidadeCaminhao;
        double distanciaComum = 100.0;
        double tempo = 0;
        double tempoSemObstaculo = 0;


        //Calculo do tempo de viagem sem obstaculo
        tempoSemObstaculo = distanciaComum/80.0; //1h25

        System.out.println("Tempo de viagem sem obstaculo =  " + new DecimalFormat("#,##0.00").format(tempoSemObstaculo) );

        double tempoPerdidoNoObstaculo = 10.0/60.0;
        System.out.println("Tempo perdido nos obstaculos:  " + new DecimalFormat("#,##0.00").format(tempoPerdidoNoObstaculo) );
        double velocidadeCaminhaoComObstaculo = tempoSemObstaculo + tempoPerdidoNoObstaculo;

        //Calculo com os pedagios
        velocidadeCaminhao = distanciaComum/ velocidadeCaminhaoComObstaculo;
        System.out.println("Velocidade do caminhao a Km/h com os obstaculos: " + new DecimalFormat("#,##0.00").format(velocidadeCaminhao));

        double calculoFinal = (velocidadeCarro * distanciaComum)/(velocidadeCarro + velocidadeCaminhao);

        System.out.println("Essa é a distancia que ambos se cruzam: " + new DecimalFormat("#,#0.0").format(calculoFinal) + "km");

    }
}
