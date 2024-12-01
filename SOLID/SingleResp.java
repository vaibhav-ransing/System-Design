public class SingleResp {

    class Marker {
        String brand;
        String color;
        int price;

        Marker(String brand, String color, int price) {
            this.brand = brand;
            this.price = price;
            this.color = color;
        }
    }
    // This is incorrect we have 3 factors affecting class 
    // i.e. claclulate toalal, printInvoice, SaveToDB
    class Invoice {
        private Marker marker;
        private int quantity;

        public Invoice(Marker marker, int quantity) {
            this.marker = marker;
            this.quantity = quantity;
        }

        public int calculateTotal() {
            return this.marker.price * this.quantity;
        }

        public void printInvoice() {

        }

        public void saveToDB() {

        }
    }
    // ------------------------------------------------------------------------

    class Invoice {
        private Marker marker;
        private int quantity;

        public Invoice(Marker marker, int quantity) {
            this.marker = marker;
            this.quantity = quantity;
        }

        public int calculateTotal() {
            return this.marker.price * this.quantity;
        }
    }
    // Data access layer
    class InvoiceDao {
        Invoice invoice;

        public InvoiceDao(Invoice invoice) {
            this.invoice = invoice;
        }

        public void saveToDB() {
            // save to DB
        }
    }

    class InvoicePrinter {
        Invoice invoice;

        public InvoicePrinter(Invoice invoice) {
            this.invoice = invoice;
        }

        public void pringInvoice() {
            // print Invoice as you wish
        }
    }
}