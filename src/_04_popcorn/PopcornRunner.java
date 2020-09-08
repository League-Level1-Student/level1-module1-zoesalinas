package _04_popcorn;
/* Your mission and you have to accept it:
 * Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
 * The main method should create a bag of Popcorn and cook it in the microwave.
 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
 * Don't change the existing methods.
 */
public class PopcornRunner {
public static void main(String[] args) {
Microwave micro = new Microwave();
Popcorn pop = new Popcorn("butter");
micro.putInMicrowave(pop);
micro.setTime(5);
micro.startMicrowave();
}
}
