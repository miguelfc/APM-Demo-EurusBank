
package com.eurus.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.eurus.ws package. 
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

    private final static QName _QueryAccountsByNameName_QNAME = new QName("http://ws.eurus.com", "name");
    private final static QName _SayHelloResponseReturn_QNAME = new QName("http://ws.eurus.com", "return");
    private final static QName _QueryAccountsByNameAndBranchBranch_QNAME = new QName("http://ws.eurus.com", "branch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.eurus.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryAccountsByName }
     * 
     */
    public QueryAccountsByName createQueryAccountsByName() {
        return new QueryAccountsByName();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link QueryAccountsByNameAndBranch }
     * 
     */
    public QueryAccountsByNameAndBranch createQueryAccountsByNameAndBranch() {
        return new QueryAccountsByNameAndBranch();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link QueryAccountsByNameResponse }
     * 
     */
    public QueryAccountsByNameResponse createQueryAccountsByNameResponse() {
        return new QueryAccountsByNameResponse();
    }

    /**
     * Create an instance of {@link QueryAccountsByNameAndBranchResponse }
     * 
     */
    public QueryAccountsByNameAndBranchResponse createQueryAccountsByNameAndBranchResponse() {
        return new QueryAccountsByNameAndBranchResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.eurus.com", name = "name", scope = QueryAccountsByName.class)
    public JAXBElement<String> createQueryAccountsByNameName(String value) {
        return new JAXBElement<String>(_QueryAccountsByNameName_QNAME, String.class, QueryAccountsByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.eurus.com", name = "return", scope = SayHelloResponse.class)
    public JAXBElement<String> createSayHelloResponseReturn(String value) {
        return new JAXBElement<String>(_SayHelloResponseReturn_QNAME, String.class, SayHelloResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.eurus.com", name = "name", scope = SayHello.class)
    public JAXBElement<String> createSayHelloName(String value) {
        return new JAXBElement<String>(_QueryAccountsByNameName_QNAME, String.class, SayHello.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.eurus.com", name = "branch", scope = QueryAccountsByNameAndBranch.class)
    public JAXBElement<String> createQueryAccountsByNameAndBranchBranch(String value) {
        return new JAXBElement<String>(_QueryAccountsByNameAndBranchBranch_QNAME, String.class, QueryAccountsByNameAndBranch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.eurus.com", name = "name", scope = QueryAccountsByNameAndBranch.class)
    public JAXBElement<String> createQueryAccountsByNameAndBranchName(String value) {
        return new JAXBElement<String>(_QueryAccountsByNameName_QNAME, String.class, QueryAccountsByNameAndBranch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.eurus.com", name = "return", scope = QueryAccountsByNameAndBranchResponse.class)
    public JAXBElement<String> createQueryAccountsByNameAndBranchResponseReturn(String value) {
        return new JAXBElement<String>(_SayHelloResponseReturn_QNAME, String.class, QueryAccountsByNameAndBranchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.eurus.com", name = "return", scope = QueryAccountsByNameResponse.class)
    public JAXBElement<String> createQueryAccountsByNameResponseReturn(String value) {
        return new JAXBElement<String>(_SayHelloResponseReturn_QNAME, String.class, QueryAccountsByNameResponse.class, value);
    }

}
