package strings;

import java.util.regex.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class MultiDelimiter{
public static void main(String args[]){
String val="How are you,Mr.X?";
List<String> delList=new ArrayList<String>();
delList.add(".");
delList.add(",");
delList.add("\\s");
List<String> result=method(val,delList);
System.out.println("result"+result);
}
public static List<String> method(String s,List<String> delimiterList){
String delimiters="[";
for(String del:delimiterList){
delimiters=delimiters+del;
}
delimiters=delimiters+"]+";
System.out.println(delimiters);
String[]str=s.split(delimiters);
List<String> list=Arrays.asList(str);
return list;
}
}
