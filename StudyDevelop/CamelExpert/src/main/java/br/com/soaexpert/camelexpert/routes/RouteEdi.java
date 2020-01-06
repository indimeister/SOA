/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.soaexpert.camelexpert.routes;

import br.com.soaexpert.camelexpert.processo.ProcessoFileName;
import org.apache.camel.builder.RouteBuilder;

/**
 *
 * @author fsoa34
 */
public class RouteEdi extends RouteBuilder {

    @Override
    public void configure() {

        //from("file:///home/fsoa34/EDI/entrada").to("file:///home/fsoa34/EDI/saida");
        //from("file:///home/fsoa34/EDI/entrada?include=.*jar").to("file:///home/fsoa34/EDI/saida");

//        from("file:///home/fsoa34/EDI/entrada?include=.*jar")
//                .process(new ProcessoFileName())
//                    .to("file:///home/fsoa34/EDI/saida");
        
        
//        from("file:///home/fsoa34/EDI/entrada")
//                .process(new ProcessoFileName())
//                    .choice()
//                    .when(header("CamelFileName").regex(".*jar"))
//                    .to("file:///home/fsoa34/EDI/saida/jar")
//                    .otherwise()
//                    .to("file:///home/fsoa34/EDI/saida/others");
        
        //irc.freenode.net    #SOA
        
        from("file:///home/fsoa34/EDI/entrada?include=.*txt")
                .process(new ProcessoFileName())
                    .to("irc:Dindi@irc.freenode.net?channels=#soa");

    }

}
