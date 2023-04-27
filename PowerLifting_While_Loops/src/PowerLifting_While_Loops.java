import java.util.*;
public class PowerLifting_While_Loops
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //Scanner Defined

        // User Inputs Start //

        System.out.println("Min Bench = ");
        int minBench = sc.nextInt();
        System.out.println("Max Bench = ");
        int maxBench = sc.nextInt();;
        System.out.println("Min Squat = ");
        int minSquat = sc.nextInt();
        System.out.println("Max Squat = ");
        int maxSquat = sc.nextInt();;
        System.out.println("Min DeadLift = ");
        int minDead = sc.nextInt();
        System.out.println("Max Deadlift = ");
        int maxDead  = sc.nextInt();
        System.out.println("Total Weight = ");
        int totalWeight= sc.nextInt();
        int currentBench = minBench;
        int currentSquat = minSquat;
        int currentDeadlift = minDead;
        int counter = 0;

        // User Inputs Done //

        while(currentBench <= maxBench)
        {
            while(currentSquat <= maxSquat)
            {
                while(currentDeadlift <= maxDead)
                {

                    if(totalWeight == currentBench + currentSquat + currentDeadlift)
                    {
                        System.out.println("Bench : " + currentBench + " | Squat : " + currentSquat + " | Dead Lift : " + currentDeadlift + "\t");
                        counter++;
                    }
                    currentDeadlift += 5;
                    // System.out.println(currentDeadlift);
                }
                currentDeadlift = minDead;
                currentSquat += 5;
            }
            currentSquat = minSquat;
            currentBench += 5;
        }
        System.out.println("Total Combinations: " + counter);
    }
}