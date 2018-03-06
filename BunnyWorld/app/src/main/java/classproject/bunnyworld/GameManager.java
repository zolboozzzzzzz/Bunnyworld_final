package classproject.bunnyworld;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nicholasseay on 3/5/18.
 * Zola, I wrote some basic functions that I think the game will need but left
 * the more involved ones empty. Please feel free to change variable names, or
 * to change/add functions. This was just what I thought of off the top of my head.
 * 
 */

class GameManager {
    private Set<Game> allGames; // essentially active games for edit or play

    private static final GameManager ourInstance = new GameManager();

    static GameManager getInstance() {
        return ourInstance;
    }

    private GameManager() {
        allGames = new HashSet<Game>();
        //deepLoad();
    }

    /* saves all of its games
     */
    public void deepSave() {
        for(Game game: allGames) {
            saveGame(game);
        }
    }

    /* Probably used by Editor to save games
     */
    public void saveGame(Game game) {

    }

    /* used when booting up the game on phone
     * runs through underlying database and
     * creates all game instances, then saves them
     * to the list of games
     * Probably would be needed while in editor but not
     * necessarily when playing a single game.
     */
    private void deepLoad() {


    }

    /* Checks underlying database for a game by
     * its name, then creates an instance of the
     * game if it exists, putting it in its set of
     * games. Returns game or null or none exists
     */
    public void loadGame(String gameName) {
        // load from database
        getGame(gameName);
    }

    /* returns a game referred to by gameName
     * to the asking class. Returns null if a game
     * by that name does not exist.
     */
    public Game getGame(String gameName) {
        for (Game game : allGames) {
            if(game.getName().equals(gameName)) return game;
        }
        return null;
    }
}
