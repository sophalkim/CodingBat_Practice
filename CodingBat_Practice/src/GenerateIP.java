import java.io.*;
	import java.util.*;


public class GenerateIP {

	
	// IP Address:
	// 198.126.44.1
	// Write a method which can generate all possible IP addresses from a given string with out modifying the string.
	// input: 1111 23432325
	// Input: 1111
	// Output: 1.1.1.1
	// Input: 10111
	// Ouput: 1.0.1.11,   1.0.11.1,   101.1.1

	

	/*
	 * To execute Java, please define "static void main" on a class
	 * named Solution.
	 *
	 * If you need more classes, simply define them inline.
	 */

	// We should return List<String> ip or String[] string;

	class Solution {
	  
	  // Returning a list of IP addresses
	  public List<String> generateIp(String str) {
	  // Finding the length of the input
	  int len = str.length();
	  // Output
	  String result = "";
	  // Counter for elements already used
	  int count = 0;
	  // Iterate through the string, add elements to new string
	  // I need to determine how many elements per "." and
	  // not exceed 3, so based on the str.length(), we can
	  // have either 3 or 2 or 1 elements per ".".
	  ArrayList<String> list = new ArrayList<String>();
	  if (len < 4) return list;
	  generateOneIp(str);
	    
	  // Populate the list
	  for (String ip : list) {
	    list.add(ip);
	  }
	  return list;
	  }
	  
	  // Recursion
	  // base case: if (str.length <= 4) return IP
	  // return method(str - 1);
	  
	  
	  // Base case: generate one IP address, then generate
	  // other IP address from that one.
	  // Make sure that the second IP address is different.
	  // Generate one IP address
	  public String generateOneIp(String str) {
	    int len = str.length();
	    String result = "";
	    int count = 0;
	    // Variables to represent how much element we can
	    // put in before we add the period.
	    int period = len / 4;
	    // Maximum amount of numbers in IP is
	    int max = 12;
	    // Can't generate valid IP address
	    if (len < 4) return "";
	    for (int i = 0; i < len; i++) {
	      // Figure out where to put "."
	      // Can be count of 3 or 2 or 1 depending on len;
	      if (count == 3 && count < period) {
	        result += ".";
	      }
	      if (len == 12) {
	        result += str.substring(i, i + 1);
	        count++;
	      }
	    }
	    return result;
	  }
	  
	  public void main(String[] args) {
	    String str = "10111";
	    Solution s = new Solution();
	    System.out.println(s.generateIp(str));
	  }
	}
}
