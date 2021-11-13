
package com.spacetravels.travels.ws.reservas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.spacetravels.travels.ws.reservas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerTodasReservasIDUsuario_QNAME = new QName("http://reservas.ws.travels.spacetravels.com/", "obtenerTodasReservasIDUsuario");
    private final static QName _CrearReserva_QNAME = new QName("http://reservas.ws.travels.spacetravels.com/", "crearReserva");
    private final static QName _ObtenerTodasReservas_QNAME = new QName("http://reservas.ws.travels.spacetravels.com/", "obtenerTodasReservas");
    private final static QName _CrearReservaResponse_QNAME = new QName("http://reservas.ws.travels.spacetravels.com/", "crearReservaResponse");
    private final static QName _ObtenerTodasReservasResponse_QNAME = new QName("http://reservas.ws.travels.spacetravels.com/", "obtenerTodasReservasResponse");
    private final static QName _ObtenerTodasReservasIDUsuarioResponse_QNAME = new QName("http://reservas.ws.travels.spacetravels.com/", "obtenerTodasReservasIDUsuarioResponse");
    private final static QName _ObtenerTodasReservasID_QNAME = new QName("http://reservas.ws.travels.spacetravels.com/", "obtenerTodasReservasID");
    private final static QName _ObtenerTodasReservasIDResponse_QNAME = new QName("http://reservas.ws.travels.spacetravels.com/", "obtenerTodasReservasIDResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.spacetravels.travels.ws.reservas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerTodasReservasID }
     * 
     */
    public ObtenerTodasReservasID createObtenerTodasReservasID() {
        return new ObtenerTodasReservasID();
    }

    /**
     * Create an instance of {@link ObtenerTodasReservasIDUsuarioResponse }
     * 
     */
    public ObtenerTodasReservasIDUsuarioResponse createObtenerTodasReservasIDUsuarioResponse() {
        return new ObtenerTodasReservasIDUsuarioResponse();
    }

    /**
     * Create an instance of {@link CrearReservaResponse }
     * 
     */
    public CrearReservaResponse createCrearReservaResponse() {
        return new CrearReservaResponse();
    }

    /**
     * Create an instance of {@link ObtenerTodasReservasResponse }
     * 
     */
    public ObtenerTodasReservasResponse createObtenerTodasReservasResponse() {
        return new ObtenerTodasReservasResponse();
    }

    /**
     * Create an instance of {@link CrearReserva }
     * 
     */
    public CrearReserva createCrearReserva() {
        return new CrearReserva();
    }

    /**
     * Create an instance of {@link ObtenerTodasReservas }
     * 
     */
    public ObtenerTodasReservas createObtenerTodasReservas() {
        return new ObtenerTodasReservas();
    }

    /**
     * Create an instance of {@link ObtenerTodasReservasIDUsuario }
     * 
     */
    public ObtenerTodasReservasIDUsuario createObtenerTodasReservasIDUsuario() {
        return new ObtenerTodasReservasIDUsuario();
    }

    /**
     * Create an instance of {@link ObtenerTodasReservasIDResponse }
     * 
     */
    public ObtenerTodasReservasIDResponse createObtenerTodasReservasIDResponse() {
        return new ObtenerTodasReservasIDResponse();
    }

    /**
     * Create an instance of {@link Reservas }
     * 
     */
    public Reservas createReservas() {
        return new Reservas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasReservasIDUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservas.ws.travels.spacetravels.com/", name = "obtenerTodasReservasIDUsuario")
    public JAXBElement<ObtenerTodasReservasIDUsuario> createObtenerTodasReservasIDUsuario(ObtenerTodasReservasIDUsuario value) {
        return new JAXBElement<ObtenerTodasReservasIDUsuario>(_ObtenerTodasReservasIDUsuario_QNAME, ObtenerTodasReservasIDUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservas.ws.travels.spacetravels.com/", name = "crearReserva")
    public JAXBElement<CrearReserva> createCrearReserva(CrearReserva value) {
        return new JAXBElement<CrearReserva>(_CrearReserva_QNAME, CrearReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasReservas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservas.ws.travels.spacetravels.com/", name = "obtenerTodasReservas")
    public JAXBElement<ObtenerTodasReservas> createObtenerTodasReservas(ObtenerTodasReservas value) {
        return new JAXBElement<ObtenerTodasReservas>(_ObtenerTodasReservas_QNAME, ObtenerTodasReservas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservas.ws.travels.spacetravels.com/", name = "crearReservaResponse")
    public JAXBElement<CrearReservaResponse> createCrearReservaResponse(CrearReservaResponse value) {
        return new JAXBElement<CrearReservaResponse>(_CrearReservaResponse_QNAME, CrearReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasReservasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservas.ws.travels.spacetravels.com/", name = "obtenerTodasReservasResponse")
    public JAXBElement<ObtenerTodasReservasResponse> createObtenerTodasReservasResponse(ObtenerTodasReservasResponse value) {
        return new JAXBElement<ObtenerTodasReservasResponse>(_ObtenerTodasReservasResponse_QNAME, ObtenerTodasReservasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasReservasIDUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservas.ws.travels.spacetravels.com/", name = "obtenerTodasReservasIDUsuarioResponse")
    public JAXBElement<ObtenerTodasReservasIDUsuarioResponse> createObtenerTodasReservasIDUsuarioResponse(ObtenerTodasReservasIDUsuarioResponse value) {
        return new JAXBElement<ObtenerTodasReservasIDUsuarioResponse>(_ObtenerTodasReservasIDUsuarioResponse_QNAME, ObtenerTodasReservasIDUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasReservasID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservas.ws.travels.spacetravels.com/", name = "obtenerTodasReservasID")
    public JAXBElement<ObtenerTodasReservasID> createObtenerTodasReservasID(ObtenerTodasReservasID value) {
        return new JAXBElement<ObtenerTodasReservasID>(_ObtenerTodasReservasID_QNAME, ObtenerTodasReservasID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasReservasIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservas.ws.travels.spacetravels.com/", name = "obtenerTodasReservasIDResponse")
    public JAXBElement<ObtenerTodasReservasIDResponse> createObtenerTodasReservasIDResponse(ObtenerTodasReservasIDResponse value) {
        return new JAXBElement<ObtenerTodasReservasIDResponse>(_ObtenerTodasReservasIDResponse_QNAME, ObtenerTodasReservasIDResponse.class, null, value);
    }

}
