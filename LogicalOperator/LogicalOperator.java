
/**
 * Write a description of LogicalOperator here.
 * 
 * @author Filmon
 * @version 09/28/2021
 */
public class LogicalOperator 
{
    public static void main(String [] arg)
    {
        boolean yes = true;
        boolean no = false;
        boolean result = (yes && yes); //true
        boolean result_1 = (yes && no); //false
        boolean result_2 = (yes || yes); //true
        boolean result_3 = (yes || no); //true
        boolean result_4 = (no || no); //false
        System.out.println(result);
        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println(result_3);
        System.out.println(result_4);
    }

}
