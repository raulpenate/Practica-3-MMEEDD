/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator_Manto;
import Clases.Mantos;
import java.util.Comparator;
/**
 *
 * @author raul-pc
 */
public class DescTipoManto implements Comparator<Mantos> {
    @Override
    public int compare(Mantos procedimientoUno, Mantos procedimientoDos) {
        return procedimientoDos.getTipoManto().compareTo(procedimientoUno.getTipoManto());
    }
}