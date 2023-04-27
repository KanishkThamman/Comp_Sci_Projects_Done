import java.util.*;
public class powerLifting
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

            // User Inputs Done //

        for(int currentBench = minBench; currentBench <= maxBench; currentBench += 5) 
        {
            for(int currentSquat = minSquat; currentSquat <= maxSquat; currentSquat += 5)
            {
                for(int currentDeadlift = minDead; currentDeadlift <= maxDead; currentDeadlift += 5)
                {
                    if(totalWeight == currentBench + currentSquat + currentDeadlift)
                        System.out.println("Bench : " + currentBench + " | Squat : " + currentSquat + " | Dead Lift : " + currentDeadlift + "\t");
                }
            }

        }







    }
}