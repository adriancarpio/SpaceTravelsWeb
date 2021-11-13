
package com.spacetravels.travels.ws.reservas;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ReservasWS", targetNamespace = "http://reservas.ws.travels.spacetravels.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReservasWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.spacetravels.travels.ws.reservas.Reservas>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTodasReservasIDUsuario", targetNamespace = "http://reservas.ws.travels.spacetravels.com/", className = "com.spacetravels.travels.ws.reservas.ObtenerTodasReservasIDUsuario")
    @ResponseWrapper(localName = "obtenerTodasReservasIDUsuarioResponse", targetNamespace = "http://reservas.ws.travels.spacetravels.com/", className = "com.spacetravels.travels.ws.reservas.ObtenerTodasReservasIDUsuarioResponse")
    public List<Reservas> obtenerTodasReservasIDUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.spacetravels.travels.ws.reservas.Reservas
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearReserva", targetNamespace = "http://reservas.ws.travels.spacetravels.com/", className = "com.spacetravels.travels.ws.reservas.CrearReserva")
    @ResponseWrapper(localName = "crearReservaResponse", targetNamespace = "http://reservas.ws.travels.spacetravels.com/", className = "com.spacetravels.travels.ws.reservas.CrearReservaResponse")
    public Reservas crearReserva(
        @WebParam(name = "arg0", targetNamespace = "")
        Reservas arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.spacetravels.travels.ws.reservas.Reservas>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTodasReservas", targetNamespace = "http://reservas.ws.travels.spacetravels.com/", className = "com.spacetravels.travels.ws.reservas.ObtenerTodasReservas")
    @ResponseWrapper(localName = "obtenerTodasReservasResponse", targetNamespace = "http://reservas.ws.travels.spacetravels.com/", className = "com.spacetravels.travels.ws.reservas.ObtenerTodasReservasResponse")
    public List<Reservas> obtenerTodasReservas();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.spacetravels.travels.ws.reservas.Reservas>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTodasReservasID", targetNamespace = "http://reservas.ws.travels.spacetravels.com/", className = "com.spacetravels.travels.ws.reservas.ObtenerTodasReservasID")
    @ResponseWrapper(localName = "obtenerTodasReservasIDResponse", targetNamespace = "http://reservas.ws.travels.spacetravels.com/", className = "com.spacetravels.travels.ws.reservas.ObtenerTodasReservasIDResponse")
    public List<Reservas> obtenerTodasReservasID(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}