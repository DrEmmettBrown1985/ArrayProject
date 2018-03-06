//****************************************************************//
// Project Name: ArrayProject                             
// File Name: Array
// Author Name: Arturo
// Created on: 3/1/2018 9:41 AM
// 
//                    History                        
// Initial Build        Arturo         3/1/2018
// JOptionPanes         Arturo         3/5/2018
// Sorting              Arturo         3/5/2018
//
//
//                    Copyrighted Material
// This is my own intellectual property. Do not copy, or in any 
// other way reproduce my work. Do not use without consent.
// You have been warned. 
// Lorem ipsum dolor sit amet, consectetur adipiscing elit.
//***************************************************************//
import java.util.ArrayList;
import java.lang.String;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Array
{
    public static void main(String[] args)
    {

        //Variable Declaration
        ArrayList<String> arrays = new ArrayList<String>();
        int s1;
        String s2;

        //Initial Sentinel
        s1 = JOptionPane.showConfirmDialog(null, "Do you want to make a list?", "Do you want to make a list?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (s1 == JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Good-Bye!");
        }

        //Array Loop
        while (s1 == JOptionPane.YES_OPTION)
        {

            s2 = JOptionPane.showInputDialog(null, "What do you want to put on the list? Type done when you're done.");
            //Sort Sentinel
            if (s2.equals("done"))
            {
                int i = JOptionPane.showConfirmDialog(null,
                        "Do you want to sort the list?", "Do you want to sort the list?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                );
                if (i == JOptionPane.NO_OPTION)
                {
                    JOptionPane.showMessageDialog(null,"This is your list:\n" + arrays);
                    break;
                }
                else
                {
                    Collections.sort(arrays);
                    JOptionPane.showMessageDialog(null, "This is your sorted list:\n" + arrays);
                    break;
                }

            }
            arrays.add(s2);

        }

    }
}