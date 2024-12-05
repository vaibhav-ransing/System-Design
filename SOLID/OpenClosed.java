public class OpenClosed {

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

    class InvoiceDao {
        Invoice invoice;

        public InvoiceDao(Invoice invoice) {
            this.invoice = invoice;
        }

        public void saveToDB() {
            // save to db
        }
    }

    // Now we want to add another method into InvoiceDao i.e. svaeToFile method
    class InvoiceDao {
        Invoice invoice;

        public InvoiceDao(Invoice invoice) {
            this.invoice = invoice;
        }

        public void saveToDB() {
            // save to db
        }

        public void svaeToFile(String filename) {
            // svae it
        }
    }

    // In the above class we modified the InvoiceDao class which violates out
    // principles


    interface InvoiceDao {
        public void save(Invoice invoice);
    }
    
    class DatabaseInvoiceDao implements InvoiceDao{
        @Override
        public void save(Invoice invoice){
            // save to db
        }
    }
    
    class FileInvoiceDao implements InvoiceDao{
        @Override
        public void save(Invoice invoice){
            // save to file
        }
    }

}
