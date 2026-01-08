class product {
    String product_name;
    String color;
    String mfd;
    String expd;
    double price;
    int tax;

  public product(String product_name,String mfd,String expd ,double price){
    this.product_name=product_name;
    this.mfd=mfd;
    this.expd=expd;
    this.price=price;
 }
 public product(String product_name,String color,String mfd,double price,int tax ){
    this.product_name=product_name;
    this.color=color;
    this.mfd=mfd;
    this.price=price;
    this.tax=tax;
 }
 public product(String product_name,String color,String mfd,String expd,double price,int tax){
    this.product_name=product_name;
    this.color=color;
    this.mfd=mfd;
    this.expd=expd;
    this.price=price;
    this.tax=tax;

 }
 void detail_of_product(){
    System.out.println("name of product is " + product_name);
    System.out.println("color of product is = " + color);
    System.out.println("manufacturing date of product is "+ mfd);
    System.out.println("experied Date of the product is = " + expd);
    System.out.println("price of the product is = "+ price );
    System.out.println("tax ="+tax);
 }

    }
class productdet{
   public static void main(String[] args) {
      product l=new product("sope","03-12-2023","03-13-2024", 53);
      product l1=new product("shoe", "red", "13-2-2024", 230,10);
      product l2=new product("past","white" ,"2-02-2024", "7-07-2024",150, 10);
      l.detail_of_product();
      l1.detail_of_product();
      l2.detail_of_product();
      
   }

}