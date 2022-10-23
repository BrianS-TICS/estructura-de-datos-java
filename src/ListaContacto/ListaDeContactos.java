package ListaContacto;
import Listas.Lista;
import Listas.PosicionIlegalException;
public class ListaDeContactos {

    private Lista<Contacto> contactos;

    public ListaDeContactos() {
        contactos=new Lista <Contacto>();
    }
    //retorna una lista de todos los contactos
    public Lista<Contacto> mostrarTodosLosContactos(){
        return contactos;
    }
    /*
     * agregar un nuevo contacto a la lista si todavia no hay ningun contact
     * con los nombres y apellidos dados
     * @throws PosicionIlegalException
     */
    public boolean agregarContacto(String nombres,String apellidos,String direccion,
                                   String correo, String telefono, String celular) throws PosicionIlegalException{
        Contacto con=buscarContacto(nombres, apellidos);
        if(con==null)//se pueded agregar el contacto
        {
            Contacto nuevo= new Contacto(nombres, apellidos,
                    direccion, correo, telefono, celular);
            contactos.agregar(nuevo);
            return true;
        }
        else {
            return false;
        }
    }
    /*
     * elimina un contacto dado sus nombres y su apellido
     * si el usuario existe en la lista se elimina si no
     * se puede eliminar el contacto retorno falso
     */
    public boolean eliminarContacto(String nombres, String apellidos)throws PosicionIlegalException{
        Contacto con=buscarContacto(nombres,apellidos);
        if(con!=null) {
            for(int i=0;i<this.contactos.getTamanio();i++) {
                Contacto contAux=contactos.getValor(i);
                if(contAux.getNombres().equals(nombres)&&
                        contAux.getApellidos().equals(apellidos))
                {
                    contactos.remover(i);
                }
            }return true;
        }else
            return false;
    }
    /*
     * modificar los datos de un contacto dando sus nombres y
     * apellidos. Si el usuario existe se modifican los datos
     * regresa true si se pudo modificar y falso si no se pudo modificar
     */

    public boolean modificarContacto(String nombres, String apellidos,String direccion,
                                     String correo, String telefono, String celular)throws PosicionIlegalException{

        //verifica si el cobtacto existe
        Contacto con=buscarContacto(nombres,apellidos);
        if(con==null) {
            return false;
        }
        //modifica  el contacto con los nuevos datos
        con.setNombres(nombres);
        con.setApellidos(apellidos);
        con.setDireccion(direccion);
        con.setCorreo(correo);
        con.setTelefono(telefono);
        con.setCelular(celular);

        return true;
    }
    /*
     * busca un contacto dado sus nombres y apellidos
     * retorna el contacto si lo encuentra y null si no lo encuentra
     */
    public Contacto buscarContacto(String nombres, String apellidos)throws PosicionIlegalException {
        for(int i=0;i<contactos.getTamanio();i++) {
            Contacto con=contactos.getValor(i);
            if(nombres.equals(con.getNombres())&&
                    apellidos.equals(con.getApellidos())){
                return con;
            }
        }return null; //no lo encontro
    }
}
