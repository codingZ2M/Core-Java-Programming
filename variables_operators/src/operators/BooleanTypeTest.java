package operators;

public class BooleanTypeTest {
	
	public static void main(String a[]){
		
		boolean isStatusUpdate = false;
		
		if ( !isStatusUpdate  ) {
			System.out.println("Status is not updated! check it later");
		}
		
		for (int i=0; i <5 ; i++ ) {
			
			try {
				System.out.println("Checking for staus updates..." + i + "(Time in seconds)" );
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			  }
			isStatusUpdate = true;
		}
			
		if ( isStatusUpdate) {
			System.out.println("Status is updated! check it now");
		}
		
	}

}
