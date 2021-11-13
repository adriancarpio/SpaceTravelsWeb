
package com.spacetravels.travels.ws.usuarios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.spacetravels.travels.ws.usuarios package. 
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

    private final static QName _LoginResponse_QNAME = new QName("http://usuarios.ws.travels.spacetravels.com/", "loginResponse");
    private final static QName _ObtenerUsuarios_QNAME = new QName("http://usuarios.ws.travels.spacetravels.com/", "obtenerUsuarios");
    private final static QName _ObtenerUsuariosResponse_QNAME = new QName("http://usuarios.ws.travels.spacetravels.com/", "obtenerUsuariosResponse");
    private final static QName _RegisterUser_QNAME = new QName("http://usuarios.ws.travels.spacetravels.com/", "registerUser");
    private final static QName _RegisterUserResponse_QNAME = new QName("http://usuarios.ws.travels.spacetravels.com/", "registerUserResponse");
    private final static QName _Login_QNAME = new QName("http://usuarios.ws.travels.spacetravels.com/", "login");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.spacetravels.travels.ws.usuarios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuarios }
     * 
     */
    public ObtenerUsuarios createObtenerUsuarios() {
        return new ObtenerUsuarios();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link ObtenerUsuariosResponse }
     * 
     */
    public ObtenerUsuariosResponse createObtenerUsuariosResponse() {
        return new ObtenerUsuariosResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link Usuarios }
     * 
     */
    public Usuarios createUsuarios() {
        return new Usuarios();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.ws.travels.spacetravels.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.ws.travels.spacetravels.com/", name = "obtenerUsuarios")
    public JAXBElement<ObtenerUsuarios> createObtenerUsuarios(ObtenerUsuarios value) {
        return new JAXBElement<ObtenerUsuarios>(_ObtenerUsuarios_QNAME, ObtenerUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.ws.travels.spacetravels.com/", name = "obtenerUsuariosResponse")
    public JAXBElement<ObtenerUsuariosResponse> createObtenerUsuariosResponse(ObtenerUsuariosResponse value) {
        return new JAXBElement<ObtenerUsuariosResponse>(_ObtenerUsuariosResponse_QNAME, ObtenerUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.ws.travels.spacetravels.com/", name = "registerUser")
    public JAXBElement<RegisterUser> createRegisterUser(RegisterUser value) {
        return new JAXBElement<RegisterUser>(_RegisterUser_QNAME, RegisterUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.ws.travels.spacetravels.com/", name = "registerUserResponse")
    public JAXBElement<RegisterUserResponse> createRegisterUserResponse(RegisterUserResponse value) {
        return new JAXBElement<RegisterUserResponse>(_RegisterUserResponse_QNAME, RegisterUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.ws.travels.spacetravels.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

}
