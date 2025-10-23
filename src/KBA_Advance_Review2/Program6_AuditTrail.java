package KBA_Advance_Review2;

import java.util.*;
import java.time.*;

public class Program6_AuditTrail {
    static abstract class AuditTrail {
        // template method does standard tasks like add timestamp
        public final void record(String event) { // (1)
            String ts = LocalDateTime.now().toString(); // (2)
            String entry = String.format("%s | %s", ts, event); // (3)
            write(entry); // (4) delegate actual storage
        }

        protected abstract void write(String entry); // (5)
    }

    static class ConsoleAudit extends AuditTrail {
        @Override
        protected void write(String entry) { // (6)
            System.out.println("AUDIT: " + entry);
        }
    }

    static class InMemoryAudit extends AuditTrail {
        private List<String> buffer = new ArrayList<>(); // (7)
        @Override
        protected void write(String entry) { // (8)
            buffer.add(entry); // store in memory
        }

        public List<String> getBuffer() { return buffer; } // (9)
    }

    public static void main(String[] args) {
        AuditTrail console = new ConsoleAudit(); // (10)
        InMemoryAudit mem = new InMemoryAudit(); // (11)

        console.record("User login: alice"); // (12)
        mem.record("User created invoice #2001"); // (13)

        System.out.println("In-memory audit buffer:");
        for (String s : mem.getBuffer()) { // (14)
            System.out.println(s); // (15)
        }
    }
}

