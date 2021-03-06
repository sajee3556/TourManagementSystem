package db.entity;
// Generated Mar 15, 2014 11:52:23 AM by Hibernate Tools 3.6.0



/**
 * DriverRouteId generated by hbm2java
 */
public class DriverRouteId  implements java.io.Serializable {


     private int routeId;
     private int driverId;

    public DriverRouteId() {
    }

    public DriverRouteId(int routeId, int driverId) {
       this.routeId = routeId;
       this.driverId = driverId;
    }
   
    public int getRouteId() {
        return this.routeId;
    }
    
    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }
    public int getDriverId() {
        return this.driverId;
    }
    
    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DriverRouteId) ) return false;
		 DriverRouteId castOther = ( DriverRouteId ) other; 
         
		 return (this.getRouteId()==castOther.getRouteId())
 && (this.getDriverId()==castOther.getDriverId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getRouteId();
         result = 37 * result + this.getDriverId();
         return result;
   }   


}


