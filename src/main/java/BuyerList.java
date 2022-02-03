public class BuyerList {
    import java.util.*;

import static java.util.Collections.*;

    public class Test {
        public static void main(String[] args) {
            Shop megamarket = new Shop("Megamarket");
            megamarket.addCustomerToShopList(new Customer("Иван", "Дроздов", "Михайлович", "Украина", 11_22_33_44, 12345));
            megamarket.addCustomerToShopList(new Customer("Андрей", "Фамильян", "Иванович", "Россия", 22_33_44_55, 23456));
            megamarket.addCustomerToShopList(new Customer("Богдан", "Мурахоедов", "Франкович", "Болгария", 33_44_55_66, 34567));
            megamarket.addCustomerToShopList(new Customer("Виктор", "Викторян", "Викторович", "Украина", 44_55_66_77, 45678));
            megamarket.addCustomerToShopList(new Customer("Франк", "Ибрагимов", "Ибрагимович", "Латвия", 55_66_77_88, 56789));
            megamarket.addCustomerToShopList(new Customer("Наташа", "Дроздова", "Алексеевна", "Россия", 66_77_88_99, 67890));
            megamarket.addCustomerToShopList(new Customer("Оксана", "Ростинова", "Ростиславовна", "Украина", 77_88_99_00, 78901));
            megamarket.addCustomerToShopList(new Customer("Степан", "Боруков", "Алексеевич", "Россия", 88_99_00_11, 89012));
            megamarket.addCustomerToShopList(new Customer("Steeve", "Jackson", "<noname>", "USA", 99_00_11_22, 90123));
            megamarket.addCustomerToShopList(new Customer("Александр", "Добрынин", "Станиславович", "Украина", 10_12_23_34, 10234));

            System.out.println("sort by name:");
            List<Customer> listSortByName = megamarket.getListByName();
            for (Customer c : listSortByName) {
                System.out.println(c);
            }

            System.out.println("sort by name2:");
            List<Customer> listSortByName2 = megamarket.getListByName2();
            for (Customer c : listSortByName2) {
                System.out.println(c);
            }

            System.out.println("print customers by diapazon credit card:");
            List<Customer> listSortByDiapazonCreditCard = megamarket.getListByDiapasonCreaditCard(22_33_44_55, 66_77_88_99);
            for (Customer c : listSortByDiapazonCreditCard) {
                System.out.println(c);
            }


        }
    }

    class Shop {
        private String shopName;
        private ArrayList<Customer> customersList = new ArrayList<>();

        Shop(String shopName) {
            this.shopName = shopName;
        }

        void addCustomerToShopList(Customer customer) {
            customersList.add(customer);
        }

        List<Customer> getListByName() {
            List<Customer> list = new ArrayList<>(customersList);
            Collections.sort(list, new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    return o1.getName().compareToIgnoreCase(o2.getName());
                }
            });
            return list;
        }

        List<Customer> getListByName2() {
            List<Customer> list = new ArrayList<>(customersList);
            Collections.sort(list, new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    return o1.getName2().compareToIgnoreCase(o2.getName2());
                }
            });
            return list;
        }

        List<Customer> getListByDiapasonCreaditCard(int diapazonStart, int diapazonEnd) {
            List<Customer> list = new ArrayList<>();
            for (Customer c : customersList) {
                if (c.getCreditCardId() >= diapazonStart && c.getCreditCardId() <=diapazonEnd) {
                    list.add(c);
                }
            }

            return list;
        }



    }

    class Customer {
        {
            idGenerator++;
        }

        private static int idGenerator = 0;
        private int id = idGenerator;
        private String name;
        private String name2;
        private String name3;
        private String address;
        private int creditCardId;
        private int bankNumberCard;

        Customer(String name, String name2, String name3, String address, int creditCardId, int bankNumberCard) {
            this.name = name;
            this.name2 = name2;
            this.name3 = name3;
            this.address = address;
            this.creditCardId = creditCardId;
            this.bankNumberCard = bankNumberCard;
        }

        public String getName() {
            return name;
        }

        public String getName2() {
            return name2;
        }

        public String getName3() {
            return name3;
        }

        public String getAddress() {
            return address;
        }

        public int getCreditCardId() {
            return creditCardId;
        }

        public int getBankNumberCard() {
            return bankNumberCard;
        }

        public String toString() {
            return String.format("ID: %d\t name: %s\t name2: %s\t name3 %s \t from: %s\t credit card %d\t bank number %d",
                    id, name, name2, name3, address, creditCardId, bankNumberCard);
        }

    }
}
