/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author Josh
 */
public class ant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City town= new City();
        Robot jarvis = new Robot(town,5,5,Direction.EAST);
        int inc=0;
        while(inc!=15000)
        {
            if(jarvis.canPickThing())
            {
                jarvis.pickThing();
                jarvis.turnLeft();
                jarvis.move();
            }
            else
            {
                new Thing(town,jarvis.getStreet(),jarvis.getAvenue());
                jarvis.turnLeft();
                jarvis.turnLeft();
                jarvis.turnLeft();
                jarvis.move();
            }
            inc++;
        }
    }
    
}
