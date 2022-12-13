package decorator.baseOnInterface;

public class HotDeskSellers extends SalesDecorator {

    public HotDeskSellers(Seller seller) {
        super(seller);
    }

    @Override
    public void sale() {
        super.sale();
        callToHotClient();
    }

    private void callToHotClient(){
        System.out.println("Call to hot client ...");
    }
}
