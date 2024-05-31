package practice;

import java.util.UUID;

public class UUIDGenerator {


    public static void main(String[] args) {
        // Generate a random UUID
        UUID uuid = UUID.randomUUID();
        System.out.println("Random UUID: " + uuid);

        // Convert UUID to String representation
        String uuidString = uuid.toString();
        System.out.println("UUID as String: " + uuidString);
    }
}
