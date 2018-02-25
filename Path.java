
/**
 * Write a description of class Path here.
 *
 * nicolaas danneels
 * 25/02/2018
 */
public class Path
{
    // instance variables
    private String cur_path;

    /**
     * Constructor for objects of class Path
     */
    public Path(String cur_path)
    {
        this.cur_path = cur_path;
    }
    
    public String cd(String new_path)
    {
        String[] new_ary = new_path.split("/");
        String[] cur_ary = cur_path.split("/");
        String[] return_ary;
        int j = cur_ary.length;
        
        for(int i=0; i < new_ary.length; i++)
        {
            if(new_ary[i].equals(".."))
            {
                //decrease length of cur_ary
                j = j - 1;
            }
            else 
            {
                //replace el from cur_ary
                cur_ary[cur_ary.length - i - 1] = new_ary[i];
            }
        }
        
        //new array with length j
        return_ary = new String[j];
        for(int k = 0; k < j; k++)
        {
            return_ary[k] = cur_ary[k];
        }
        
        String str = String.join("/", return_ary);
        return str;
    }
}
