public class InverterString {
    public static void main(String[] args) {
        String string = "MAY THE FORCE BE WITH YOU - YODA";

        int len = string.length();
        char[] armazenamentoTemporarioCaractere = new char[len];
        char[] novoCaractere = new char[len];

        for(int i = 0; i < len; i++){
            armazenamentoTemporarioCaractere[i] = string.charAt(i);
        }

        for(int j = 0; j < len; j++){
            novoCaractere[j] = armazenamentoTemporarioCaractere[len - 1 - j];
        }

        String novoReverter = new String(novoCaractere);
        System.out.println(novoReverter);
    }
}
