/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.io.IOException;

/**
 *
 * @author newbi
 */
public class Grafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODOS LOS METODOS SE USAN COMENTANDO LOS DEMAS Y SOLO HABILITANDO 1 A LA VEZ
        ErdosRenyi er = new ErdosRenyi(500,503,false);//vertexes, edges, sameVertexEdge
        er.grafoNoDirigido();
        er.exportGraphVizND();
        er.grafoDirigido();
        er.exportGraphVizD();
        
        
        Gilbert g = new Gilbert(500,0.1,false);//vertexes, probability, sameVertexEdge
        g.grafoNoDirigido();
        g.exportGraphVizND();
        g.grafoDirigido();
        g.exportGraphVizD();
        
        Geografico ge = new Geografico(500,0.1,false);//vertexes, distance, sameVertexEdge
        ge.grafoNoDirigido();
        ge.exportGraphVizND();
        ge.grafoDirigido();
        ge.exportGraphVizD();
        
        BarabasiAlbert ba = new BarabasiAlbert(500,5,true);//vertexes, number of edges, sameVertexEdge
        ba.grafoNoDirigido();
        ba.exportGraphVizND();
        ba.grafoDirigido();
        ba.exportGraphVizD();
        
    }
    
}
