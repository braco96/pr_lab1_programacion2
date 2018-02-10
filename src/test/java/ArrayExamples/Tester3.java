package ArrayExamples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.util.Arrays;


/**
 * @author Guillermo Vigueras
 *
 */

public class Tester3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
		      String[] ids = ManagementFactory.getRuntimeMXBean().getName()
			  .split("@");
		      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
		      bw.write(ids[0]);
		      bw.close();
		} catch (Exception e) {
		    System.out.println("Avisa al profesor de fallo sacando el PID");
		}

		{
			String strArr1[] = new String[]{new String("abc")};
			String strArr2[] = new String[]{new String("abc")};	
			String strArrRes[] = new String[]{new String("abc")};
			do_check(strArr1,strArr2,strArrRes);
		}		

		{
			String strArr1[] = new String[]{new String("abc"),new String("dft"),new String("abc")};
			String strArr2[] = new String[]{new String("klo"),new String("abc")};	
			String strArrRes[] = new String[]{new String("abc")};
			do_check(strArr1,strArr2,strArrRes);
		}		
		
		
		{
			String strArr1[] = null;
			String strArr2[] = new String[]{new String("klo"),new String("abc")};	
			String strArrRes[] = null;//{};
			do_check(strArr1,strArr2,strArrRes);
		}		

		{
			String strArr1[] = new String[]{new String("klo"),new String("abc")};
			String strArr2[] = null;	
			String strArrRes[] = null;//{};
			do_check(strArr1,strArr2,strArrRes);
		}		
		
		{
			String strArr1[] = new String[]{new String("klo"),new String("abc")};
			String strArr2[] = new String[]{};	
			String strArrRes[] = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}		
		
		{
			String strArr1[] = null;
			String strArr2[] = null;	
			String strArrRes[] = null;
			do_check(strArr1,strArr2,strArrRes);
		}		
		
		{
			String strArr1[] = new String[]{};
			String strArr2[] = new String[]{};	
			String strArrRes[] = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}		
		
		{
			String strArr1[] = new String[]{null,new String("dft"),null};
			String strArr2[] = new String[]{new String("klo"),null};	
			String strArrRes[] = new String[]{null};
			do_check(strArr1,strArr2,strArrRes);
		}		
		

		{
			String strArr1[] = new String[]{new String(""),new String("dft"),new String("")};
			String strArr2[] = new String[]{new String("klo"),new String("")};	
			String strArrRes[] = new String[]{new String("")};
			do_check(strArr1,strArr2,strArrRes);
		}		
		
		{
			String strArr1[] = new String[]{new String("abc"),new String("dft")};
			String strArr2[] = new String[]{new String("klo"),new String("abc"),new String("tkt"),new String("abc")};	
			String strArrRes[] = new String[]{new String("abc")};
			do_check(strArr1,strArr2,strArrRes);
		}		

		{
			String strArr1[] = new String[]{new String("hgb"),new String("hgb")};
			String strArr2[] = new String[]{new String("hgb"),new String("hgb")};	
			String strArrRes[] = new String[]{new String("hgb"),new String("hgb")};
			do_check(strArr1,strArr2,strArrRes);
		}		
		
		
				
		
	    ////////////////////////////// BEGIN AUTO-GENERATED TEST CASES //////////////////////////////		
		{
			String[] strArr1 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArr2 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArrRes = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArr2 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("cab"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArr2 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArr2 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("b"), new String("cab"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArr2 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArrRes = new String[]{new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArrRes = new String[]{new String("eadh"), new String("eadh")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArr2 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArrRes = new String[]{new String("eadh")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArr2 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArrRes = new String[]{new String("cab"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArr2 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArr2 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArrRes = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArr2 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArr2 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArr2 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArr2 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArrRes = new String[]{new String("ecg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArr2 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArrRes = new String[]{new String("cab"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("cab"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArrRes = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("abc"), new String("abc"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArrRes = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("ge")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArrRes = new String[]{new String("ge"), new String("bg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("ge"), new String("bg"), new String("bg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArrRes = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArrRes = new String[]{new String("b"), new String("cab"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("cab"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("ge")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArrRes = new String[]{new String("b")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArrRes = new String[]{new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("b"), new String("ge"), new String("ge"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArr2 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArrRes = new String[]{new String("cab"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArr2 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArrRes = new String[]{new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArr2 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArr2 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArr2 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("b")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArr2 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArrRes = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArrRes = new String[]{new String("eadh")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("b"), new String("b"), new String("b"), new String("hcd"), new String("eadh")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArr2 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArrRes = new String[]{new String("eadh"), null, null};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArr2 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArrRes = new String[]{null, null};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArr2 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArrRes = new String[]{new String("eadh"), new String("eadh")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArr2 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArr2 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("ge"), new String("bg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArr2 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArr2 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArrRes = new String[]{new String("eadh")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArrRes = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("abc"), new String("abc"), new String("eadh"), new String("ge"), new String("bg"), new String("ge")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArr2 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArrRes = new String[]{new String("eadh"), new String("bg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArr2 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArrRes = new String[]{new String("abc"), new String("abc"), new String("abc")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArrRes = new String[]{new String("cab"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArrRes = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("abc"), new String("abc"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("ge"), new String("bg"), new String("bg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("cab"), new String("ge"), new String("ge"), new String("b")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArrRes = new String[]{new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArrRes = new String[]{new String("abc"), new String("abc"), new String("ge"), new String("ge"), new String("eadh"), new String("bg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArrRes = new String[]{new String("ecg"), new String("eadh"), new String("bg"), new String("bg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArr2 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArrRes = new String[]{new String("abc"), new String("abc"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArr2 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArrRes = new String[]{new String("eadh")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArr2 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArrRes = new String[]{new String("ecg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArr2 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArr2 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArr2 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArrRes = new String[]{new String("eadh"), null, null};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArrRes = new String[]{new String("bg"), new String("eadh")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("bg"), new String("bg"), new String("eadh"), new String("ecg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArr2 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArrRes = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArr2 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArrRes = new String[]{null, null};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArr2 = new String[]{new String("eadh"), new String("eadh"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), new String("cab"), new String("cab"), new String(""), new String("")};
			String[] strArrRes = new String[]{new String("cab"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArr2 = new String[]{new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg"), new String("gdh"), new String("gdh"), new String("gdh"), new String("ecg"), new String("ecg"), new String("ecg"), new String("ecg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("cab"), new String("cab"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArr2 = new String[]{new String("ge"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArr2 = new String[]{new String("b"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("cab"), new String("cab")};
			String[] strArrRes = new String[]{new String("cab"), new String("cab")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArr2 = new String[]{new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("hcd"), new String("hcd"), new String("eadh"), null, null, new String("hcd"), new String("hcd"), new String("hcd"), new String("hcd"), new String("b"), new String("b"), new String("b"), new String("b")};
			String[] strArrRes = new String[]{null, null};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("abc"), new String("eadh"), new String("eadh"), new String("ge"), new String("bg"), new String("ge"), new String("ge"), new String("ge"), new String("ge"), new String("ge")};
			String[] strArrRes = new String[]{new String("abc"), new String("abc"), new String("abc")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArr2 = new String[]{new String("abc"), new String("abc"), new String("ecg"), new String("ecg"), new String("cab"), new String("ge"), new String("ge"), new String("eadh"), new String("b"), new String("b"), new String("hcd"), new String("b"), new String("ecg"), new String("ecg"), new String("ecg"), new String("bg"), new String("bg")};
			String[] strArrRes = new String[]{new String("cab"), new String("abc"), new String("abc")};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArr2 = new String[]{new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("bg"), new String("eadh"), null, null, new String("ecg")};
			String[] strArrRes = new String[]{null, null};
			do_check(strArr1,strArr2,strArrRes);
		}

		{
			String[] strArr1 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArr2 = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			String[] strArrRes = new String[]{null, null, null, null, new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("cab"), new String("abc"), new String("abc"), new String("abc"), null};
			do_check(strArr1,strArr2,strArrRes);
		}

		////////////////////////////// END AUTO-GENERATED TEST CASES //////////////////////////////		
		
		System.out.println("\nTester3: Test finalizado correctamente.");
	}
	
	static void do_check(String[] strArr1,String[] strArr2, String[] arrExpected) {

	    Example3 checker = new Example3();

	    String [] result = null;

	    try {
		result = checker.commons(strArr1,strArr2);
	    } catch (Exception exc) {
			System.out.println("\n*** Tester3 Error: returns exception\n"+exc.toString());	    	
//		System.out.println("\n*** Tester3 Error: commons returns "+ printArray(result) +
//				 "\n instead of " + printArray(arrExpected) + " for input arrays: \n" +
//				 printArray(strArr1) + "\n  and: \n    " +
//				 printArray(strArr2)+".\n\n");
//		exc.printStackTrace();
//		System.out.println("\n");
		throw new Error("Error en test: resultado incorrecto");		
	    }
	
//	    if (!compareArrays(result,arrExpected)) {	    
	    if (!compareArraysUnsorted(result,arrExpected)) {
			System.out.println("\n*** Tester3 Error: commons returns "+ printArray(result) +
					 "\n instead of " + printArray(arrExpected) + " for input arrays: \n" +
					 printArray(strArr1) + "\n  and: \n    " +
					 printArray(strArr2)+".\n\n");
			throw new Error("Error en test: resultado incorrecto");		    
	    }
	}

//	static boolean compareArrays(String[] arr1,String[] arr2) {
//		if(arr1 == null && arr2 == null) return true;
//		if(arr1 == null || arr2 == null) return false;		
//		if(arr1.length != arr2.length) return false;
//		
//		int i;
//		for(i=0;i<arr1.length && eqNull(arr1[i],arr2[i]);i++)
//			;
//		return i==arr1.length;
//		
//	}

	// Need to do a unsorted array comparison (i.e. like a set) because the
	// the output might content the correct elements but in a different order
	// with respect to the tester, depending on which array is selected for the outer loop
	// and which one for the inner loop. For example, the following case should flagged as correct:
//	*** Tester3 Error: commons returns [b,b,b,hcd,hcd,eadh]
//			                instead of [eadh,b,b,b,hcd,hcd] for input arrays: 
//			                [eadh,eadh,b,b,b,hcd,hcd,eadh,cab,cab,"",""]
//			                and: 
//			                [b,b,b,b,b,hcd,hcd,eadh,null,null,hcd,hcd,hcd,hcd,b,b,b,b].	
	static boolean compareArraysUnsorted(String[] arr1,String[] arr2) {
		if(arr1 == null && arr2 == null) return true;
		if(arr1 == null || arr2 == null) return false;		
		if(arr1.length != arr2.length) return false;
		
		boolean[] valid = new boolean[arr2.length];
		for(int j = 0; j<arr2.length;j++)
			valid[j] = true;
		  
		int cont = 0;
		for(int i=0;i<arr1.length;i++)
			for(int j=0;j<arr2.length;j++)
				if(eqNull(arr1[i],arr2[j]) && valid[j]){
					cont++;
					valid[j] = false;
					break;
				}
		
		return cont==arr1.length;
		
	}
	
	
	static boolean eqNull(String s1, String s2) {
		 return s1 == null && s2 == null || s1 != null && s1.equals(s2);
	}
	
	
    static String printArray(String[] arr) {
	StringBuffer result = new StringBuffer();
	if(arr==null)
		result.append("null");
	else{
		result.append("[");
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==null)
				result.append("null");			
			else if(arr[i].length()==0)
				result.append("\"\"");				
			else
				result.append(arr[i]);
			
			if (i<arr.length-1)
				result.append(",");
		}
		result.append("]");
	}
	return result.toString();
    }
}
