package com.imie.tp.calculator.utils;

import java.util.Scanner;
/**
 *
 * @author Anne-SOphie
 *
 */
public final class KeyboardUtils {

    public static String readFromKeyboard(String displayAsk) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println(displayAsk);

        keyboard.close();

        return keyboard.nextLine();
    }
}
