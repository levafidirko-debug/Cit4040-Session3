
void main() {
    System.out.println("100 pages -> " + readingTime(100) + " min");
    System.out.println("500 pages -> " + readingTime(500) + " min");
    System.out.println("800 pages -> " + readingTime(800) + " min");
}

int readingTime(int pages) {
    int minutes = pages * 2;

    if (pages > 500) {
        minutes = minutes + minutes / 10;
    }

    return minutes;
}
