/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package universidad;

/**
 *
 * @author Lucas Cometto
 */

public class ValidacionDatos {

    private static final String DNI_MODELO = "\\d{7,8}"; // Para un DNI de 7 u 8 dígitos
    private static final String NOMBRE_MODELO = "[A-Za-zÁÉÍÓÚáéíóúñÑ\\s]+"; // Para un nombre que acepte letras, espacios y acentos
    private static final String APELLIDO_MODELO = "[A-Za-zÁÉÍÓÚáéíóúñÑ\\s]+"; // Para un apellido que acepte letras, espacios y acentos
    private static final String NOTAS_MODELO = "^(10|[1-9])$";
    private static final String NUMEROS_POSITIVOS ="\\d+";
    
    public static boolean validarNumeroPositivo (String numero) {
    return numero.matches (NUMEROS_POSITIVOS);
    }
    
    
    public static boolean validarNota (String nota) {
    return nota.matches(NOTAS_MODELO);
            }
    
    public static boolean validarDNI(String dni) {
        return dni.matches(DNI_MODELO);
    }

    public static boolean validarNombre(String nombre) {
        return nombre.matches(NOMBRE_MODELO);
    }

    public static boolean validarApellido(String apellido) {
        return apellido.matches(APELLIDO_MODELO);
    }
    
    
}


