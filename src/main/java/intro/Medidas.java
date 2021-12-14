// 1 - pacote
package intro;

// 2 - Referencia as bibliotecas

// 3 - Classe

             public class Medidas {
                                              // 3.1 - Atributo - Caracteristicas
                                             // 3.2 - Metodos e funções ( o que ele sabe fazer) e (faz alguma coisa)

             public static void main (String[] args) {

                                            // INICIO DO USO "switch"

                        String opcao = "outro";

                        switch (opcao) {
                            case "ifsimples" :
                                System.out.println("Voce escolheu executar os metodo ifsimples");
                                ifsimples();
                                break;
                            case "curto" :
                                System.out.println("Voce escolheu executar os metodo calculodeareamodocurto");
                                calculodeareamodocurto();
                                break;
                            case "longo" :
                                System.out.println("Voce escolheu executar os metodo longo");
                                calculodedeareamodolongo();
                                break;
                            default:
                                System.out.println("Voce não escolheu nenhum metodo conhecido");
                                calculodedeareamodolongo();
                                break;

                        }



             }

                    public static void ifsimples () {

                                            // INICIO DO USO "if" e do "else"


                        String modo = "curto";

                        if (modo =="curto") {
                            calculodeareamodocurto();
                        }
                        else {
                            calculodedeareamodolongo();
                        }
                                            // FINAL DO USO "if" e do "else"

                    }


                                            // INICIO CALCULO DE AREA - MODO CURTO

             public static void calculodeareamodocurto(){

                 System.out.println("CALCULO DE AREA MODO CURTO");



                 int largura = 4;           //LARGURA RECEBE 4
                 int comprimento = 3;       //COMPRIMENTO RECEBE 3

                 System.out.println("PARA LARGURA DE " + largura + "m E O COMPRIMENTO DE "
                         + comprimento + "m A AREA É DE " + largura * comprimento + "m²");


             }
                                        // FINAL CALCULO DE AREA - MODO CURTO


                                        // INICIO CALCULO DE AREA MODO LONGO

             public static void calculodedeareamodolongo(){

                 System.out.println("CALCULO DE AREA MODO LONGO");
             int largura;
             int comprimento;
             int resultado;


             largura = 8;                   //LARGURA RECEBE 8
             comprimento = 3;               //COMPRIMENTO RECEBE 3

             resultado = largura * comprimento;

             System.out.println("PARA LARGURA DE " + largura + "m E O COMPRIMENTO DE "
                     + comprimento + "m A AREA É DE " + resultado + "m²");


         }
                                            // FINAL CALCULO DE AREA MODO LONGO


}
