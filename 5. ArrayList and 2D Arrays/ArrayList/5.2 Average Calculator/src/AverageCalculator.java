import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        double suma = 0;

        for (int num: numbers) {
            suma = suma + num;
        }
        return suma/numbers.size();
    }
}