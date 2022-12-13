package decorator.baseOnInterface;

public class ColdDeskSellers extends SalesDecorator {

    public ColdDeskSellers(Seller seller) {
        super(seller);
    }

    @Override
    public void sale() {
        super.sale();
        callToColdClient();
    }

    private void callToColdClient(){
        System.out.println("Call to cold client ...");
    }
}
