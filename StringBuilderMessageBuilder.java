public class StringBuilderMessageBuilder {
    public static void main(String[] args) {
        StringBuilder message = new StringBuilder();

        message.append("Name: Jimwell P Daan\n");
        message.append("Course: Certificate In Computer Science\n");
        message.append("Year: 1\n");
        message.append("Status: Inactive\n");
        message.append("Temporary line to delete\n");

        message.insert(0, "Student Information\n");

        int inactiveStart = message.indexOf("Inactive");
        message.replace(inactiveStart, inactiveStart + "Inactive".length(), "Active");

        int temporaryStart = message.indexOf("Temporary line to delete\n");
        message.delete(temporaryStart, temporaryStart + "Temporary line to delete\n".length());

        message.reverse();
        message.reverse();

        String finalMessage = message.toString();
        System.out.print(finalMessage);
    }
}
