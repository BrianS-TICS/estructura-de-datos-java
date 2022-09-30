package EjercicioPilas;

public class Delimitadores {

    //Evalua si una cadena tiene los delimitadores correctos
    public  boolean     evaluacionDelimitadores(String cadena) {
        Pila<String> pcaracteres = new Pila<String>();

        int i = 0;

        boolean masElementosPorLeer = true;

        while (i<cadena.length() && masElementosPorLeer)
        {
            char car = cadena.charAt(i);
            String s = charToString(car);
            i++;

            switch (car)
            {
                //En caso de Apilar
                case '(':{

                    pcaracteres.apilar(charToString(')'));
                    break;
                }
                case '[':{

                    pcaracteres.apilar(charToString(']'));
                    break;
                }

                case '{':{

                    pcaracteres.apilar(charToString('}'));
                    break;
                }
                case '/':{
                    if (siguienteEsAsterisco(cadena,i)) {
                        pcaracteres.apilar(charToString('/'));
                        i++;
                    }
                    break;
                }

                //Para Desapilar
                case ')':
                case ']':
                case '}':
                {
                    //comparar que corresponda
                    String aux = pcaracteres.cima();

                    if (aux!=null)
                    {

                        if(s.compareTo(aux)==0)
                        {
                            //hay correspondencia por lo tanto
                            //lo elimino
                            pcaracteres.retirar();
                        }
                        else
                        {
                            masElementosPorLeer = false;
                        }

                    }
                    else
                    {

                        masElementosPorLeer = false;
                    }

                }
                case '*':{
                    if (siguienteEsDiagonal(cadena,i)) {
                        pcaracteres.retirar();
                        i++;
                    }
                }
            }
        }
        //Si la Pila aún tiene elementos es un Error

        if (pcaracteres.esVacia() && masElementosPorLeer)
            return true;
        else
            return false;

    }
    private static boolean siguienteEsAsterisco(String cadena, int posicion) {

        char car = cadena.charAt(posicion);
        if (car=='*')
            return true;
        else
            return false;

    }
    private static boolean siguienteEsDiagonal(String cadena, int posicion) {
        char car = cadena.charAt(posicion);
        if (car=='/')
            return true;
        else
            return false;

    }
    //convierte un char a un objeto tipo String
    private static String charToString(char ch) {
        return String.valueOf(ch);
    }

}