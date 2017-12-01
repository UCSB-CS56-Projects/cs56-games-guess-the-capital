package edu.ucsb.cs56.projects.games.guess_the_capitals;

/**
 * Contains the data for the territories in our game.
 * Territories refer to countries, provinces, states, etc. that have capitals.
 *
 * @author Sean Shelton, Armin Mahini
 * @version for UCSB CS56, F16  
 */
public class Territory {

	private String territoryName;
	private Capital capital;

    /** Constructs a newly allocated Territory object 
     *  that's name is "Territory" and Capital's name is 
     *  "Capital"
     */ 
	Territory() {
		this.territoryName = "Territory";
		capital = new Capital();
	}

    /** Constructs a newly allocated Territory object 
     *  that's Territory and Capital names are input by the user
     *  @param capitalName name of the Territory objects capital
     *  @param territoryName name of the Territory
     */
	Territory(String capitalName, String territoryName) {
		capital = new Capital(capitalName);
		this.territoryName = territoryName;
	}
    
    /** 
     * @return the name of the Territory
     */
	public String getName() { return this.territoryName; }
    
    /** 
    * @return the name of the Capital
     */
	public Capital getCapital() { return this.capital; }
}
