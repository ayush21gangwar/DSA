class Solution
{
    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length()!= str2.length())   
        return false;

        String s1 = str1.substring(2,str1.length())+str1.substring(0,2);
        String s2= str1.substring(str1.length()-2,str1.length()) + str1.substring(0,str1.length()-2);

        if(str2.equals(s1) || str2.equals(s2))
        return true;

        return false;

    }

}