/*
Have the function BinaryReversal(str) take the str parameter being passed, which will be a positive integer, take its binary representation (padded to the nearest N * 8 bits), reverse that string of bits, and then finally return the new reversed string in decimal form. For example: if str is "47" then the binary version of this integer is 101111 but we pad it to be 00101111. Your program should reverse this binary string which then becomes: 11110100 and then finally return the decimal version of this string, which is 244.
*/

public class BinaryReversal{

int binaryReversal(String str){
  System.out.println("Given String: " + str);

  if(str.isEmpty() || str == null){
    return -1;
  }

  int num = Integer.parseInt(str);
  str = Integer.toBinaryString(num);
  int numBinary = Integer.parseInt(str);

  str = String.format("%08d", numBinary);
  StringBuilder reversedString = new StringBuilder(str).reverse();
  str = reversedString.toString();
  int result = Integer.parseInt(str, 2);

  return result;
}
  public static void main(String args[]){
    BinaryReversal bn = new BinaryReversal();
    System.out.println("Binary Reversal: " + bn.binaryReversal("0"));
    System.out.println("Binary Reversal: " + bn.binaryReversal(""));
    System.out.println("Binary Reversal: "+ bn.binaryReversal("47"));
    System.out.println("Binary Reversal: " + bn.binaryReversal("128"));
    System.out.println("Binary Reversal: " + bn.binaryReversal("513"));

    
    
   }
}