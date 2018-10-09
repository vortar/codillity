package com.kodilla;

public class CyclicRotation {
    public static void main(String args[]) {
        int []a={1,2,3,4};
        int k=1;
        int [] newArray = new int [a.length];
      for (int i=0; i<a.length;i++){

          int newPosition = (i+k) % a.length;
          newArray[newPosition] = a[i];
      }
for (int i=0; i<newArray.length;i++){

    System.out.print(newArray[i]);

}

        }

}
//https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/