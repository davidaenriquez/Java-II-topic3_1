package app;

/**
 * The PersonInterface defines methods related to a person's actions.
 */

public interface PersonInterface {
	
	/**
     * Makes the person walk.
     */
	public void walk();
	
	/**
     * Makes the person run.
     */
	public void run();
	
	/**
     * Checks if the person is running.
     *
     * @return true if the person is running, false otherwise.
     */
	public boolean isRunning();
}
