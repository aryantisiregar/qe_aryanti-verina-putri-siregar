import java.util.*;  
public class MergeArray{  
public static void main(String args[])   
{  
String str1[] = { "kazuya", "jin", "lee" };          //source array  
String str2[] = { "kazuya", "feng" };               //destination array  
List list = new ArrayList(Arrays.asList(str1)); //returns a list view of an array  
//returns a list view of str2 and adds all elements of str2 into list  
list.addAll(Arrays.asList(str2));     
Object[] str3 = list.toArray();         //converting list to array  
System.out.println(Arrays.toString(str3));  //prints the resultant array  
}  
}  