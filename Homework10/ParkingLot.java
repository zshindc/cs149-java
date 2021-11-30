import java.awt.Rectangle;
/**
 * Exercise 10.1 Parking Lot program.
 * 
 * @author Zachary Shin
 * @version 09/26/21
 * Helped by TAs
 */
 
public class ParkingLot { 
   
   /** Search method.
   *
   * @param lot adjacent parking spaces of various sizes lot
   * @param car Rectangle[] car bounding box for the vehicle to be parked
   * @return area of the parking space surrounding the car
   */
   public static int search(Rectangle[] lot, Rectangle car) {
      int sqFt = -1;
      if (lot == null || lot.length < 0) {
         return -1;
      }
      
      for (int i = 0; i < lot.length; i++) { 
         int sqftRMwidth = lot[i].width - car.width;
         int sqftRMheight = lot[i].height - car.height;
         if (sqftRMwidth >= 4 && sqftRMheight >= 4) {
            car.x = lot[i].x + sqftRMwidth / 2;
            car.y = lot[i].y + sqftRMheight / 2;
            sqFt = (lot[i].width * lot[i].height) - (car.width * car.height);
            break;
         }
      }
      return sqFt;
   }
}