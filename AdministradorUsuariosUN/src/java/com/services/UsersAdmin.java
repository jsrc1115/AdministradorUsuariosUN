/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.model.ProcessResult;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Sebastian
 */
@Singleton
@LocalBean
public class UsersAdmin {
        
    public ProcessResult changeEPS()
    {
        
        /*
         * 
         * 
         */
        return ProcessResult.COMPLETED;
    }
    
}
