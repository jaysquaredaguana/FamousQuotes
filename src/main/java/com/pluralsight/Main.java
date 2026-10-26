package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
            String[] quotes = new String[10];
            quotes[0] = "\"Success is not final; failure is not fatal: " +
                    "It is the courage to continue that counts." +
                    "\" — Winston S. Churchill";
            quotes[1] = "\"Life is like a box of chocolates. You never know what you're gonna get." +
                    "\" — Forrest Gump";
            quotes[2] = "\"Your time is limited, so don't waste it living someone else's life.\" — Steve Jobs";
            quotes[3] = "\"Be the change that you wish to see in the world.\" — Mahatma Gandhi";
            quotes[4] = "\"Life is like riding a bicycle. To keep your balance, you must keep moving.\" — Albert Einstein";
            quotes[5] = "\"It's not what you look at that matters, it's what you see.\" — Henry David Thoreau";
            quotes[6] = "\"The question isn't who is going to let me, it's who is going to stop me.\" — Ayn Rand";
            quotes[7] = "\"An unexamined life is not worth living.\" — Socrates";
            quotes[8] = "\"Life is 10% what happens to us and 90% how we react to it.\" — Charles R. Swindoll / Lou Holtz";
            quotes[9] = "\"Whether you think you can or think you can't, you're right.\" — Henry Ford";

            System.out.print("Select a number between 1 and 10: ");
            int index = read.nextInt();
            index--; // adjust number for index
            System.out.println(quotes[index]);
        }
        catch (Exception e) {
            System.out.println("Your number was out of range!");
            e.printStackTrace();
        }
        read.close();
    }
}