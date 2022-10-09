package EjercicioPilas;

public class ExpresionAritmeticaInfija {
    Pila<String> pOperadores = new Pila<String>();
    char operadores[] =          {'^','*','/','+','-','('};
    byte prioridadDentroPila[] = {3,   2,  2,  1,  1,  0};
    //byte prioridadFueraPila[] =  {3,   2,  2,  1,  1,  4};

    //Arreglo en donde regresara la expresión
    //convertido en formato postFija
    char arregloPostFijo[] = new char[30];

    static int posicion = 0;
    static int posicionArregloPostFijo = 0;

    public ExpresionAritmeticaInfija() {

    }
    public ExpresionAritmeticaInfija(String cadena) {

    }
    public char [] convertirPostFija(String cadena)
    {
        //int posicionArregloOperadores = 0;
        for (int i = 0;i<cadena.length();i++) {
            char car = obtenerCaracter(cadena);
            //System.out.println("Operador a evaluar: "+car);

            switch (car) {
                //en caso que sean operados
                case '^':
                case '*':
                case '/':
                case '+':
                case '-':{
                    //Evaluar si se meten a la pila
                    //solo si la pila esta vacía
                    //o si el operador a evaluar tiene mayor prioridad
                    //que la cima de la pila
                    if(pOperadores.esVacia()) {
                        pOperadores.apilar(charToString(car));
                        break;
                    }
                    else {
                        char cima = pOperadores.cima().charAt(0);
                        if (prioridad(car)>prioridad(cima))
                        {
                            pOperadores.apilar(charToString(car));
                            break;
                        }
                        else
                        {

                            sacarPilaHastaPrioridad(car);
                            break;

                        }
                    }

                }
                case '(':{
                    //no pregunto por prioridad porque tiene la mínima

                    pOperadores.apilar(charToString(car));
                    break;

                }
                case ')':{
                    //sacar todos los operadores de la pila
                    //y que pasen a la expresion postfija
                    //hasta llegar a un paréntesis izquierdo
                    //el cual se elimima porque los paréntesis
                    //no forman parte de las expresiones PostFijas
                    sacarPilaParentesisIzquierdo();
                    break;
                }


                //en caso que sean operadores, cuaquier cosa que no es operando
                case ' ':
                    break;
                default:
                {

                    meterArregloPostFijo(car);

                }

            }

        }
        vaciarPila();
        mostrarArregloPostFijo();

        return arregloPostFijo;
    }
    private char obtenerCaracter(String cadena){
        char car = cadena.charAt(posicion);
        posicion++;
        return car;
    }
    //convierte un char a un objeto tipo String
    private  String charToString(char ch) {
        return String.valueOf(ch);
    }

    //Regresa la prioridad de car y -1 en caso de que
    //no encuentre el operador
    private byte prioridad(char car) {

        for(int i=0;i<prioridadDentroPila.length;i++)
        {
            if (car==operadores[i])
            {
                return prioridadDentroPila[i];
            }
        }
        return -1;

    }
    //Itera y Saca los operadores de la pila hasta que encuentra
    //un paréntesis izquierdo
    private void sacarPilaParentesisIzquierdo() {

        do
        {
            meterArregloPostFijo(pOperadores.cima().charAt(0));
            pOperadores.retirar();
        }while (pOperadores.cima()=="(");
        pOperadores.retirar();

    }
    //Itera y saca los operadores hasta que encuantra en la
    //Pila un operador con prioridad mayor al car (operador) evaluado
    private void sacarPilaHastaPrioridad(char car) {
        char cima;
        do
        {
            cima = pOperadores.cima().charAt(0);
            meterArregloPostFijo(cima);
            pOperadores.retirar();
        }while (prioridad(car)<=prioridad(cima) && !pOperadores.esVacia());
        pOperadores.apilar(charToString(car));

    }
    //Elimina todos los elemento de la pila
    private void vaciarPila() {
        while (pOperadores.cima()!=null)
        {
            arregloPostFijo[posicionArregloPostFijo++]=
                    pOperadores.cima().charAt(0);
            pOperadores.retirar();
        }
    }
    //agrega el car al arrego de expresión postFija
    private void meterArregloPostFijo(char car) {
        arregloPostFijo[posicionArregloPostFijo++]=car;

    }
    //muestra los elementos que forman la expresion postFija
    private void mostrarArregloPostFijo() {
        for (int i=0; i<arregloPostFijo.length;i++) {
            System.out.print(arregloPostFijo[i]);
        }
    }


}
