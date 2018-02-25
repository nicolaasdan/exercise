
/**
 * Write a description of class Path here.
 *
 * nicolaas danneels
 * 25/02/2018
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List <String> new_ary = new ArrayList(Arrays.asList(new_path.split("/")));
        List <String> cur_ary = new ArrayList(Arrays.asList(cur_path.split("/")));
        
        for(int i=0; i < new_ary.size(); i++)
        {
            if(new_ary.get(i).equals(".."))
            {
                cur_ary.remove(cur_ary.size() - 1);
            }
            else 
            {
                cur_ary.add(new_ary.get(i));
            }
        }
        
        String str = String.join("/", cur_ary);
        return str;
    }
}
