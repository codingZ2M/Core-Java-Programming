package compile_polymorphism;

public class SecondsMinutesHoursConvertorTest {

	public static void main(String[] args) {
		

        System.out.println(SecondsMinutesHoursConvertor.getDurationString(65, 45));
        System.out.println(SecondsMinutesHoursConvertor.getDurationString(3945L));
        System.out.println(SecondsMinutesHoursConvertor.getDurationString(-41));
        System.out.println(SecondsMinutesHoursConvertor.getDurationString(65, 9));
        
        
        //System.out.println(SecondsMinutesHoursConvertor.INVALID_VALUE_MESSAGE);
        
	}

}
