
void main() {
    int total = 100;
    int week = 0;

    while (total > 10) {
        total = total / 2;
        week = week + 1;

        System.out.println(
                "total = " + total + ", week = " + week
        );
    }

    System.out.println("Result: " + week);
}
