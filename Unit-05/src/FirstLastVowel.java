//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov
//Date - 20 Jan 2022

public class FirstLastVowel {

  public static String go(String a) {
    String vowels = "aeiouAEIOU";
    String first = a.substring(0, 1);
    String last = a.substring(a.length() - 1);

    if (vowels.contains(first) || vowels.contains(last)) return "yes";
    return "no";
  }
}
