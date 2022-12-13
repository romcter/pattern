package decorator.baseOnInterface;

public class SaleRunner {
    public static void main(String[] args) {
        Seller seller = new ColdDeskSellers(new HotDeskSellers(new TeamLeadSeller()));
        seller.sale();
    }
}
