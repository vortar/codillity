package com.kodilla;



public class unpairedArray {
    public static void main(String args[]) {
     int tab[] = {3,5,3,1,7,1,9};

for (int i=0;i<tab.length;i++){
    for (int j=0;j<tab.length;j++) {
        if (tab[i] == tab[j] && i!=j) {
           tab[i]=-1;
          tab[j]=-1;
        //  j=tab.length;
           // System.out.println(tab[j]);
        }
    }

}
for (int i=0 ; i< tab.length; i++){

    if (tab[i] != -1){
        System.out.println(tab[i]) ;
    }
}
    }
}
//https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/