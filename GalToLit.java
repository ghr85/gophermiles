/*
Try this 1-1
This program converts gallons to litres

Call this program GalToLit.java
 */

class GalToLit {
    public static void main(String args[]){
        double gallons, litres; //holds the number of gallons & litres
        int counter;

        counter = 0;
        for(gallons = 1; gallons <= 100 ; gallons++) {
        litres = gallons*3.7854; // convert to litres
        System.out.println(gallons + " gallons is equivalent to "+ litres+ " litres."); // displays the quivalency

            counter++;
            //if every 10th line, print a blank line
            if(counter== 10){
                System.out.println();
                counter = 0 ;// reset the line counter
            }
        }





    }

}