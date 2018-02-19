package nfl_draft;

/** Class: Offensive Player
 * Summary: 
 * Author: Katon Bingham
 * Date: 
 *
 * All following work is my own. 
 * -Katon
 */
public class OffensivePlayer extends Player {

    public OffensivePlayer() {}
    public OffensivePlayer(String newName, String newPosition, 
            String newCollege, int newJerseyNumber, int newHeightFEET, 
            int newHeightINCHES, int newWeight, int newAge, int newFumbles, 
            int newPassing, int newReceiving, int newPunting, 
            Boolean newIsDrafted) {
        super(newName, newPosition, newCollege, newJerseyNumber, newHeightFEET, 
                newHeightINCHES, newWeight, newAge, newFumbles, newIsDrafted);
        passing = newPassing;
        receiving = newReceiving;
        punting = newPunting;
    }

    @Override
    public String toString() {
        return "OffensivePlayer{" + "passing=" + passing + ", receiving=" +
                receiving + ", punting=" + punting + '}';
    }

    private int passing = 0;
    private int receiving = 0;
    private int punting = 0;

    public int getPassing() {
        return passing;
    }
    public int getReceiving() {
        return receiving;
    }
    public int getPunting() {
        return punting;
    }
    public void setReceiving(int receiving) {
        this.receiving = receiving;
    }
    public void setPassing(int passing) {
        this.passing = passing;
    }
    public void setPunting(int punting) {
        this.punting = punting;
    }

}
