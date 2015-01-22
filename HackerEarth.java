/*
 * In the race for the best Internet browser, there's now a new contender for it, this browser is called the: 
 * "The Semantic Mind-Reader!" After its promo on the world wide web, everyone's been desperately waiting for 
 * the browser to be released. And why shouldn't they be curious about it, after all, it's the new project of 
 * our very own genius "Little Jhool!" He's worked very hard for this browser, and to add new mind reading 
 * features to it.

Apart from the various security powers it possesses, it's called the mind-reader for a reason. Here's why:

You don't need to type 'www.' to open a website anymore.
Though, you still need to type '.com' to open a website.
The browser predicts ALL THE VOWELS in the name of the website. (Not '.com', though. Again!)
Obviously, this means you can type the name of a website faster and save some time.
Now to convince users that his browser will indeed save A LOT of time for users to open a particular website, Little Jhool has asked you to prepare a report on the same.

Input format:
The first line contains tc, the number of test cases.
The second line contains the name of websites, as a string.

Output format:
You have to print the ratio of characters you would have typed in Jhool's browser, to your normal browser.

Constraints:
1 <= tc <= 100
1 <= Length of the website <= 200

Sample Input (Plaintext Link)
2
www.google.com
www.hackerearth.com
Sample Output (Plaintext Link)
7/14
11/19

Explanation
Consider the first case:

In Jhool's browser, you'll only have to type: ggl.com (7 characters) while in a normal browser, 
you'll have to type www.google.com, which is 14 characters.
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class HackerEarth {
    public static void main(String args[] ) throws Exception {
    	String noVowels="";
        
          //Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String[] websites= new String[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter Website");
            websites[i] = br.readLine();
        }
        
        for(int i=0; i < N ; i++){
        	String website = websites[i];
        	int length=website.length();
        	String websiteSubString=website.substring(4,length-4);
        	noVowels = websiteSubString.replaceAll("[aeiou]", "");
        	System.out.println(noVowels);
        	System.out.println(noVowels.length()+4 + "/" + website.length());
        }

        
    }
}