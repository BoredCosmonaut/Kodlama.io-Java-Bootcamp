public class Product {

        public  Product(int id, String name, String description, double price, int stockAmount, String renk) {
                this._id = id;
                this._renk = renk;
                this._name = name;
                this._description = description;
                this._price = price;
                this._stockAmount = stockAmount;
        }
        //Overloading
        public  Product() {

        }
        // Attribute or Field
        private String _name;
        private String _description;
        private double _price;
        private int _stockAmount;
        private int _id;
        private String _renk;
        private String kod;

        public String get_name() {
                return _name;
        }

        public void set_name(String _name) {
                this._name = _name;
        }

        public String get_description() {
                return _description;
        }

        public void set_description(String _description) {
                this._description = _description;
        }

        public double get_price() {
                return _price;
        }

        public void set_price(double _price) {
                this._price = _price;
        }

        public int get_stockAmount() {
                return _stockAmount;
        }

        public void set_stockAmount(int _stockAmount) {
                this._stockAmount = _stockAmount;
        }

        public int get_id() {
                return _id;
        }

        public void set_id(int _id) {
                this._id = _id;
        }

        public String get_renk() {
                return _renk;
        }

        public void set_renk(String _renk) {
                this._renk = _renk;
        }

        public String getKod() {
                return this._name.substring(0,1) + this._id;
        }
}
