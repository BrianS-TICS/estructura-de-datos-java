package ListaContacto;
import Listas.Lista;
import Listas.PosicionIlegalException;

public class ClienteMain {
    public static void main(String []args) {
        ListaDeContactos ldc=new ListaDeContactos();

        try {
            //agregamos algunos contactos
            ldc.agregarContacto("Fernando", "Castro", "Cll 12 no.12-12 Popayan" ,
                    "ferCastro@gmail.com","8207858", "314878245");
            ldc.agregarContacto("Maria Andrea", "Vargas", "Cll 12 no.10-45 Popayan" ,
                    "mativ@gmail.com","8337252", "3113231231");
            ldc.agregarContacto("Carolina", "Sanchez", "." ,
                    "carolsao@gmail.com","8211121", "3001235845");
            ldc.agregarContacto("Federica", "Cardenas", "." ,
                    "fede@gmail.com","8232322", "3001257845");

            if(ldc.eliminarContacto("Federica", "Cardenas")){
                System.out.println("*Contacto eliminado*");

                ldc.modificarContacto("Fernando", "Castro", "cra 16 no, 11-12 Cali", "fercastri@gmail.com",
                        "82522323", "314878245");

                Contacto con=ldc.buscarContacto("Carolina", "Sanchez");
                System.out.println("-----------------contacto buscado------------");
                System.out.println(con);
                Lista<Contacto>listado=ldc.mostrarTodosLosContactos();
                System.out.println("-----------------Listado de contactos------------");
                for(int i=0;i<listado.getTamanio();i++) {
                    System.out.println(listado.getValor(i));
                }

            }

        }catch(Exception ex){
            System.out.print("Ocurrio una excepcion");
        }
    }
}
