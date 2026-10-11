
void main() {
    System.out.println(withDelivery(6000));
    System.out.println(withDelivery(3000));
}

int withDelivery(int price) {
    if (price > 5000) {
        return price;
    }

    return price + 900;
}
