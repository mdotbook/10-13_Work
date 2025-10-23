package KBA_Advance_Review2;

import java.util.*;

public class Program3_FinancialReport {
    static abstract class FinancialReport {
        // (1) Template method: final so subclass won't override the sequence
        public final void generate() {
            fetchData();      // (2)
            calculate();      // (3)
            String out = formatOutput(); // (4)
            System.out.println(out);     // (5)
        }

        protected abstract void fetchData();     // (6)
        protected abstract void calculate();     // (7)
        protected abstract String formatOutput();// (8)
    }

    static class BalanceSheetReport extends FinancialReport {
        private double assets, liabilities, equity; // (9)

        @Override
        protected void fetchData() { // (10)
            // in real life, we'd query DB; here hardcode demo numbers
            assets = 50000;
            liabilities = 20000;
        }

        @Override
        protected void calculate() { // (11)
            equity = assets - liabilities;
        }

        @Override
        protected String formatOutput() { // (12)
            return String.format("Balance Sheet:%nAssets: %.2f%nLiabilities: %.2f%nEquity: %.2f%n", assets, liabilities, equity);
        }
    }

    static class IncomeStatementReport extends FinancialReport {
        private double revenue, expense, netIncome;

        @Override
        protected void fetchData() {
            revenue = 120000;
            expense = 90000;
        }

        @Override
        protected void calculate() {
            netIncome = revenue - expense;
        }

        @Override
        protected String formatOutput() {
            return String.format("Income Statement:%nRevenue: %.2f%nExpense: %.2f%nNet Income: %.2f%n", revenue, expense, netIncome);
        }
    }

    public static void main(String[] args) {
        FinancialReport bs = new BalanceSheetReport(); // (13)
        FinancialReport is = new IncomeStatementReport(); // (14)

        bs.generate(); // (15)
        is.generate(); // (16)
    }
}

