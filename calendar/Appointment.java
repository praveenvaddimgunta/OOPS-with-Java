import java.util.Date;
import java.text.SimpleDateFormat;

public class Appointment {
	private Date dateTime;
	private int duration;
	private String name = " ";
	private String organisation = " ";

	public Appointment(String dateString, int duration) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
		try {
			dateTime = sdf.parse(dateString);
		} catch (Exception e) {
			System.out.println(e);
		}
		this.dateTime = dateTime;	
		this.duration = duration;
	}

	public  Date getDateTime() {
		return dateTime;
	}
	public void setDateTme() {
		this.dateTime = dateTime;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration() {
		this.duration = duration;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation() {
		this.organisation = organisation;
	}

	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		String str = "";
		str = sdf.format(dateTime) + " - ";
		str = str + duration;
		return str;		
	}
}