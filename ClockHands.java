import java.util.*;

class calcAngle{
	public Double findAngle(Integer hour, Integer minute){
		Double angle = 0.5*(60*hour - 11*minute);
		if(angle < 0)
			return Math.abs(angle);
		return angle;
	}
}

class ClockHands{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer hour = sc.nextInt();
		Integer minute = sc.nextInt();
		System.out.println(new calcAngle().findAngle(hour, minute));
		sc.close();
	}
}