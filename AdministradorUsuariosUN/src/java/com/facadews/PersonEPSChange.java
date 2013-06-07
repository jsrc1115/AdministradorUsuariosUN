/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facadews;

import com.clients.DeleteMedicalRecord_Service;
import com.services.clients.CreateMedicalRecord_Service;
import com.services.clients.ProcessResult;
import fachadews.GetMedicalRecord_Service;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Sebastian
 */
@WebService(serviceName = "PersonEPSChange")
@Stateless()
public class PersonEPSChange {
    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/GetMedicalRecord/GetMedicalRecord.wsdl")
    private GetMedicalRecord_Service service_2;
    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/DeleteMedicalRecord/DeleteMedicalRecord.wsdl")
    private DeleteMedicalRecord_Service service_1;
    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/CreateMedicalRecord/CreateMedicalRecord.wsdl")
    private CreateMedicalRecord_Service service;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "changeEPS")
    public String changeEPS(Integer personID) {
        // TODO: i have to set the wsdl location dynamically, im supposed to get the medical record
        // TODO: from the correct eps and send it to the new eps
        /*fachadews.MedicalRecord personMRecord = getMedicalRecord(personID);
        if(personMRecord != null)
        {
            deleteMedicalRecord(personMRecord.getIdHistoria());
            createMedicalRecord(personMRecord.getIdHistoria());
        }*/
        
        return hello_1("asdaaaaaaaaaaa");
    }

    private ProcessResult createMedicalRecord(java.lang.Integer arg0) {
        com.services.clients.CreateMedicalRecord port = service.getCreateMedicalRecordPort();
        return port.createMedicalRecord(arg0);
    }

    private com.clients.ProcessResult deleteMedicalRecord(java.lang.Integer arg0) {
        com.clients.DeleteMedicalRecord port = service_1.getDeleteMedicalRecordPort();
        return port.deleteMedicalRecord(arg0);
    }

    private String hello_1(java.lang.String name) {
        service_1 = new DeleteMedicalRecord_Service();
        com.clients.DeleteMedicalRecord port = service_1.getDeleteMedicalRecordPort();
        System.out.println(port);
        return port.hello(name);
    }

    private fachadews.MedicalRecord getMedicalRecord(java.lang.Integer arg0) {
        fachadews.GetMedicalRecord port = service_2.getGetMedicalRecordPort();
        return port.getMedicalRecord(arg0);
    }
}
