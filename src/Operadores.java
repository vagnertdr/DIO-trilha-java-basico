public class Operadores {

        public static void main(String[] args){
            String nomeUm = "Vagner";
            String nomeDois = new String("Vagner");

            System.out.println(nomeUm.equals(nomeDois));



            String nomeCompleto = "linguagem " + "Java";
            /*
            int numero = 5;

            numero = - numero;

            System.out.println(numero);

            numero = numero * -1;

            System.out.println(numero);
            */
            /*
             AULA sobre operadores TERNARIOS
             int a, b;
             a = 6;
             b = 6;
             String resultado = a==b ? "Verdadeiro": "Falso";
            */

           /* if (a == b)
                resultado = "verdadeiro";
            else
                resultado = "falso";


            System.out.println(resultado);  */

            int numero1, numero2;
            numero1 = 1;
            numero2 = 2;

           boolean simNao = numero1 == numero2;

           if (numero1 == numero2){
               System.out.println("a nossa condição é verdadeira");
           }


            System.out.println("Número 1 é igual a Número 2 ? " + simNao);


            simNao = numero1 != numero2;
            System.out.println("Número 1 é diferente do Número 2 ? " + simNao);

            simNao = numero1 > numero2;
            System.out.println("Número 1 é maior que Número 2 ? " + simNao);

            boolean condicao1 = true;
            boolean condicao2 = true;

            if (condicao1 && (7 >= 4)) {
                System.out.println("As duas condições são verdadeiras");
            }

            if (condicao1 || condicao2) {
                System.out.println("Uma das condições é verdadeiras");
            }

                System.out.println("Fim");

        }
}
