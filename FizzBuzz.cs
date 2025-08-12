public class Solution
{
    private bool IsDivisibleBy (int dividend, int divisor)
    {
        return dividend % divisor == 0;
    }
    public IList<string> FizzBuzz(int n)
    {
        List<string> lista = new List<string>();
        for (int i = 1; i <= n; i++)
        {
            string result= i switch
            {
                _ when IsDivisibleBy(dividend: i, divisor: 3) && IsDivisibleBy(dividend: i, divisor: 5) => "FizzBuzz",
                _ when IsDivisibleBy(dividend: i, divisor: 3) => "Fizz",
                _ when IsDivisibleBy(dividend: i, divisor: 5) => "Buzz",
                _ => i.ToString()
            };
            lista.Add(result);
        }
        return lista;
    }
}