package com.epam;

import java.util.HashSet;
import java.util.Set;

public class Ticket {
    private static long countId;
    private long id;
    private Set<Integer> numbers;
    private Set<Integer> winningNumbers = new HashSet<>();

    public Ticket() {
        id = ++countId;
    }

    public Ticket(Set<Integer> numbers) {
        this();
        this.numbers = numbers;
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<Integer> numbers) {
        this.numbers = numbers;
    }

    public long getId() {
        return id;
    }

    public Set<Integer> getWinningNumbers() {
        return winningNumbers;
    }

    public void setWinningNumbers(Set<Integer> winningNumbers) {
        this.winningNumbers = winningNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id;
    }

        @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", numbers=" + numbers +
                ", winningNumbers=" + winningNumbers +
                '}';
    }
}















