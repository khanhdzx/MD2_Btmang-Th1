
public class BTH1_2 {
   double width,  height;
   public BTH1_2(){

   }
   public BTH1_2(double width, double height){
      this.width=width;
      this.height=height;
   }
   public double getArea(){
      return this.width*this.height;
   }
   public double getPerimeter(){
      return(this.width+this.height)*2;

   }
   public String display(){
      return "hình chữ nhật{"+"chiều rộng="+ width + ", chiều cao =" + height + "}";
   }
}