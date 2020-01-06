/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.soaexpert.camelexpert.processo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 *
 * @author fsoa34
 */
public class ProcessoFileName implements Processor{
    
    
//      public void process(Exchange exchng) throws Exception {
//                System.out.print("O nome do arquivo é: "
//                        + exchng.getIn().getHeader("CamelFileName"));
//
//            }
    
     public void process(Exchange exchng) throws Exception {
                System.out.println(exchng.getIn().getBody());

            }
}
