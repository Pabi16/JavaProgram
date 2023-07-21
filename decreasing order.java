import java.util.*;
class decreasing order {
    

static void printChar(char []arr, int len)
{
 
    
    HashMap<Character,
              Integer> occ = new HashMap<Character,
                                         Integer>();
    for (int i = 0; i < len; i++)
        if(occ.containsKey(arr[i]))
        {
            occ.put(arr[i], occ.get(arr[i]) + 1);
        }
          else
        {
            occ.put(arr[i], 1);
        }
 
    
    int size = occ.size();
 
    
    while (size-- > 0)
    {
 
        
        int currentMax = 0;
        char arg_max = 0;
        for (Map.Entry<Character,
                        Integer> it : occ.entrySet())
        {
            if (it.getValue() > currentMax ||
               (it.getValue() == currentMax &&
                it.getKey() > arg_max))
            {
                arg_max = it.getKey();
                currentMax = it.getValue();
            }
        }
 
      
        System.out.print(arg_max + " - " +
                         currentMax + "\n");
 
     
        occ.remove(arg_max);
    }
}
 

public static void main(String[] args)
{
    String str = "geeksforgeeks";
    int len = str.length();
 
    printChar(str.toCharArray(), len);
}
}