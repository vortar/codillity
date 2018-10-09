package com.kodilla;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class binaryGaps {
    public static void main(String args[]) {

        int N=32;
            int binaryGap = 0;


           while (N % 2 == 0) {
               N /= 2;
      }

            for (int j = 0; N > 0; N /= 2) {
                if (N % 2 == 0) {
                    j++;
                } else {
                    if (j > binaryGap) {
                        binaryGap = j;
                    }

                    j = 0;
                }
            }

            System.out.println(binaryGap);
        }
    }

//https://app.codility.com/programmers/lessons/1-iterations/binary_gap/