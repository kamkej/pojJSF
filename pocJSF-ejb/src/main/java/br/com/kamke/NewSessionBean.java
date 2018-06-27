/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kamke;

import javax.ejb.Stateless;

/**
 *
 * @author martin
 */
@Stateless(name = "teste")
public class NewSessionBean {

    public String businessMethod() {
        return "Hi... again";
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
