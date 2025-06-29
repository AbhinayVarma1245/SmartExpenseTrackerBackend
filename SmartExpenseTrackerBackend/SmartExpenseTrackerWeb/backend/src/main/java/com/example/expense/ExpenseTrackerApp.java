
package com.example.expense;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin
public class ExpenseTrackerApp {

    private final List<Expense> expenses = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(ExpenseTrackerApp.class, args);
    }

    @GetMapping("/expenses")
    public List<Expense> getExpenses() {
        return expenses;
    }

    @PostMapping("/expenses")
    public List<Expense> addExpense(@RequestBody Expense expense) {
        expenses.add(expense);
        return expenses;
    }
}
