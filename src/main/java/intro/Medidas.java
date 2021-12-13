// 1 - pacote
package intro;

// 2 - Referencia as bibliotecas

// 3 - Classe

public class Medidas {
        // 3.1 - Atributo - Caracteristicas

        // 3.2 - Metodos e funções ( o que ele sabe fazer) e (faz alguma coisa)

         public static void main (String[] args) {
             System.out.println("SEJA BEM VINDO!!!");
             System.out.println("Meu primeiro codigo em java");

             // CALCULO DE AREA FORMULA MAIS LONGA

             int largura;
             int comprimento;
             int resultado;


             largura = 8;        //LARGURA RECEBE 8
             comprimento = 3;   //COMPRIMENTO RECEBE 3

             resultado = largura * comprimento;

             System.out.println("PARA LARGURA DE " + largura + "m E O COMPRIMENTO DE "
                     + comprimento + "m A AREA É DE " + resultado + "m²");

         }

                // CALCULO DE AREA - FORMULA REDUZIDA

                public void calcularAreaFormulaCompacta(){

                    int largura = 4;
                    int comprimento = 8;

                    System.out.println("PARA LARGURA DE " + largura + "m E O COMPRIMENTO DE "
                            + comprimento + "m A AREA É DE " + largura * comprimento + "m²");


             }






}
