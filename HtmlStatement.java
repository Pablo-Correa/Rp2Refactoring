import java.util.Enumeration;

public class HtmlStatement extends Statement {
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = "Rental Record for " + aCustomer.getName() +
      "\n";
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "\n";
      }
      //add footer lines
      result += "Amount owed is" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
      result += "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "frequent renter points<P>";
      return result;
   }
}