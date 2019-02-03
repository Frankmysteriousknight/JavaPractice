import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
class DrWho {
	public static void main(String [] args) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMddyyyy");
		LocalDate bday = null;
		try {
			bday = LocalDate.parse(args[0],f);
		}
		catch (java.time.DateTimeException e) {
			System.out.println("bad dates Indy");
			System.exit(0);
		
		}
		System.out.println("Your birthday is "+bday);
		System.out.println("a "+ bday.getDayOfWeek());

		Period p1 = Period.between(bday, LocalDate.now());
		System.out.println("You'hv lived for :");
		System.out.println(p1.getDays() + "days ");
		System.out.println(p1.getMonths() + "months");
		System.out.println(p1.getYears() + "years");
		int yearsOld = p1.getYears();
		if(yearsOld<0 || yearsOld>119) 
			System.out.println("Wow,are you a time lord?");
		long tDays = bday.until(LocalDate.now(),ChronoUnit.DAYS);
		System.out.println("You'hv lived for "+tDays+ " days, so far");
		System.out.println("You'll reach 30,000 days on "+ bday.plusDays(30_000));
		LocalDate d2000 = LocalDate.of(2_000,1,1);
		Period p2 = Period.between(d2000,LocalDate.now());
		System.out.println("Period since Y2K:"+p2);
	
	}

}
