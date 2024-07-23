
/*

Create an abstract class Compartment to represent a rail coach. 
Provide an abstract function notice in this class. 

public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. 
Override the notice function in each of them to print notice message 
that is suitable to the specific type of compartment.

Create a class TestCompartment. 
Write main function to do the following:

i.	    Declare an array of Compartment of size 10.
ii.	    Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
iii.	Check the polymorphic behavior of the notice method. 
[i.e based on the random number genererated, 
    the first compartment can be Luggage, 
    the second one could be Ladies and so on .. ]	

*/

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "This is First Class";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "This is Ladies Compartment";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "This is General Compartment";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "This is Luggage Compartment";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] c = new Compartment[10];
        System.out.println("**********");
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 4) + 1;
            if (random == 1) {
                c[i] = new FirstClass();
            } else if (random == 2) {
                c[i] = new Ladies();
            } else if (random == 3) {
                c[i] = new General();
            } else {
                c[i] = new Luggage();
            }
            System.out.println(c[i].notice());
            System.out.println( "---------------------------------------------"); 
        }
        System.out.println("**********");
    }
}
