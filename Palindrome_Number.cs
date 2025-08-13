public class Solution
{
    public bool IsPalindrome(int x)
    {
        string cadena = x.ToString();
        int elements = cadena.Length;

        for (int i = 0; i < elements / 2; i++)
        {
            if (cadena[i] != cadena[elements - 1 - i])
            {
                return false;
            }
        }
        return true;
    }
}
