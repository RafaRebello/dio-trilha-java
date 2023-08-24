public class Metodos {

    int num1 = 6;
    int num2 = 6;

    public int somar(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int resultado = metodos.somar(metodos.num1, metodos.num2);
        System.out.println("Resultado da soma: " + resultado);
    }
}
