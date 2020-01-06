/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.soaexpert.camelexpert;

import br.com.soaexpert.camelexpert.routes.RouteEdi;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

/**
 *
 * @author fsoa34
 */
public class CamelEDI {
    
    public static void main(String args[]) throws Exception{
        
        CamelContext context = new DefaultCamelContext();
        
        context.addRoutes(new RouteEdi());
        
        context.start();
        Thread.sleep(360000);
    }
    
}
