package progskills;


import progskills.SpeakBehaviour;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo Cardoso
 */

public class Animal {

	SpeakBehaviour sp;
	public Animal(SpeakBehaviour spbehaviour){
		sp = spbehaviour;
	}
        
	public String speak(){
		return sp.toString();
	}

}


