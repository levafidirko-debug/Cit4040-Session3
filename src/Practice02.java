
void main() {
    checkQuantity(5);
    checkQuantity(0);
    checkQuantity(10);
    checkQuantity(100);
}

void checkQuantity(int qty) {
    if (qty <= 0) {
        System.out.println(qty + " -> invalid");
    } else if (qty < 10) {
        System.out.println(qty + " -> standard price");
    } else if (qty < 100) {
        System.out.println(qty + " -> bulk discount");
    } else {
        System.out.println(qty + " -> wholesale");
    }
}
