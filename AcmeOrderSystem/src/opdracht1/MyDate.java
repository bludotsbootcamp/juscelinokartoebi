package opdracht1;

public class MyDate {
	
	int day;
	int year;
	int month;

public MyDate(){
}

public MyDate (int d, int y, int m) {
	
setDate (d, y, m);

}

public String toString() {
	
	return day + "/" + year + "/" + month ;
	
}

void setDate(int d, int y, int m){
	
	day = d;
	year = y;
	month = m;

}
}