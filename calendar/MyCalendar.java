import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class MyCalendar {
	private String calendarName;
	private ArrayList<Appointment> slots;
	public ArrayList<Appointment> bookings = new ArrayList<Appointment>();

	public MyCalendar(String calendarName) {
		this.calendarName = calendarName;
		slots = new ArrayList<Appointment>();
	}

	public String getCalendarName() {
		return calendarName;
	}

	public boolean createAppointmentSlot (Appointment slot) {
		boolean flag = false;
			if(slots.size() == 0)
		{
			slots.add(slot);
			flag = true;
		}
		else if(slots.size() > 0) {
			for(int i = 0;i < slots.size();i++) {
				Date slotsDate = slots.get(i).getDateTime();
				Date emptySlotDate = slot.getDateTime();
				long a = (slotsDate.getTime() / (60000));
				long b = (emptySlotDate.getTime() / (60000));

				/*int a = slotsDate.getMinutes();
				int b = slots.get(i).getDuration();
				int p = slotsDate.getHours();
				int e = emptySlotDate.getMinutes();
				int q = emptySlotDate.getHours();
				int c = a + b;
				if(e > (a + b)||(q > p)) {*/
				if(a>b) {	
					slots.add(slot);
					flag = true;
				}
			}//System.out.println(slots);
		}
		return flag;
	}
	
	public boolean bookAppointment(String name, String datetime, int duration, String organisation) {
		boolean flag=false;
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yy HH:mm:ss");
		Date date = null;
		try {
		 	 date = sdf.parse(datetime);
		 } catch(Exception e) {
		 	System.out.println(e);
		 }		
		for(int i = 0;i < slots.size();i++) {
			int meetduration = slots.get(i).getDuration();

			if((slots.get(i).getDateTime()).compareTo(date) == 0 && (meetduration)>=duration) {
				//int count = 0;//bookings.size();
				if(bookings.size()== 0) {
					bookings.add(slots.get(i));
					//count++;
					flag = true;
				} else if(bookings.size() > 0) {
					for(int j=0;j<bookings.size();j++) {
						if(bookings.get(j).getDateTime().equals(date)) {
								flag=false;
								break;
							} else{
								bookings.add(slots.get(i));
								flag=true;
								break;
							}
						}
						
					}
				}
			}
		return flag;
	}

	//public Boolean bookAppointment(String name, String datetime, int duration, String organisation) 

	public Boolean cancelAppointment(String datetime) {
		SimpleDateFormat dateFormat = new SimpleDateFormat ("dd/MM/yy HH:mm:ss");
		boolean flag = false;
		Date canceldate = null;
		try {
		 	 canceldate = dateFormat.parse(datetime);
		 }
		 catch(Exception e) {
		 	System.out.println(e);
		 }
		for(int i=0;i<slots.size();i++) {
			if((slots.get(i).getDateTime()).equals(canceldate))
			{
				bookings.remove(i);
				flag = true;
			}
		}
		return flag;
	}
}