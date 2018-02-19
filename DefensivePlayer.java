package nfl_draft;

/** Class: 
 * Summary: 
 * Author: Katon Bingham
 * Date: 
 *
 * All following work is my own. 
 * -Katon
 */
public class DefensivePlayer extends Player {
    // ???
    public DefensivePlayer() {}
    public DefensivePlayer(String newName, String newPosition, 
            String newCollege, int newJerseyNumber, int newHeightFEET, 
            int newHeightINCHES, int newWeight, int newAge, int newFumbles, 
            int newDefensive, Boolean newIsDrafted) {
        super(newName, newPosition, newCollege, newJerseyNumber, newHeightFEET, 
                newHeightINCHES, newWeight, newAge, newFumbles, newIsDrafted);
        defensive = newDefensive;
    }

    @Override
    public String toString() {
        return "DefensivePlayer{" + "defensive=" + defensive + '}';
    }
        
    private int defensive = 0;

    public int getDefensive() {
        return defensive;
    }
    public void setDefensive(int defensive) {
        this.defensive = defensive;
    }
    
}
