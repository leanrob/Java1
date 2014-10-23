public class Lab51 {

  public static void main(String arg[]) {

    char a[] = {'r','o','b','e','r','t','b','y','r','n','e'};

    int n = countVowels(a);
      System.out.println("There are " + n + " vowels");
    }

      public static int countVowels(char a[]) {
	
	int c = 0;
	for(int i = 0; i < a.length; i++) {
	  if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u')
	    c++;
	}
      return c;
      }
}