/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2dd;

/**
 *
 * @author jade
 */
public class PrintCharacters {
	
	public static void main( String args [ ] ) {
		String word = args[ 0 ];
		char [ ] arrChars = word.toCharArray( );
		for ( int i = arrChars.length -1  ; i >=0 ; i -- ) {
			System.out.print( arrChars[ i ] );
		}
		System.out.println( "" );
	}
}
