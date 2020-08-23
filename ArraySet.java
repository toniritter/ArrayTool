/* 
 * Title:	Random Character in ArraySet
 * Author:	Toni Ritter
 * Date:	23.08.2020
 * 
 */

import java.util.Random;

public class ArraySet {

	public static void main(String[] args) {
		
		//Initialize vars
		int[] 		count		= 	new int[5];
		String[]	chars		= 	new String[5];
		String		cstring 	=	"abcdefghijklmnopqrstuvwxyz";
				
		Random 		random 		= 	new Random();
		
		/* start loop
		 * get random number
		 * add char from random position to String array
		 */
		for (int i = 0; i < count.length; i++) {
			count[i]	= 	random.nextInt(count.length);
			
			chars[i] = cstring.substring(count[i],count[i]+1);
			
		}
		
		/* start loop
		 * print random counter and selected character
		 */
		for (int cnt: count) {
			System.out.println(count[cnt] + " --> " + chars[cnt]);
			
		}
		
	}
	
}
