package com.epam;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static final int SIZE_RANGE_NUMBERS = 36;
    private static final int COUNT_NUMBER_OF_PLAYED = 5;
    private static final int COUNT_TICKETS = 1000000;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        TicketGeneratorNumbers generator = new TicketGeneratorNumbers(SIZE_RANGE_NUMBERS);

        Set<Ticket> tickets = new HashSet<>();
        for (int i = 1; i <= COUNT_TICKETS; i++) {
            tickets.add(new Ticket(generator.generate(COUNT_NUMBER_OF_PLAYED)));
        }

        RevealWinners winners = new RevealWinners();

        winners.setTickets(tickets);

        Wheel wheel = new Wheel(SIZE_RANGE_NUMBERS);


        for (int i = 1; i <= COUNT_NUMBER_OF_PLAYED; i++) {
            winners.setWinNumber(wheel.winNumber());
        }

        winners.printWinners();

        long stopTime = System.currentTimeMillis();

        System.out.println(stopTime - startTime);

    }
}
