package ArrayExamples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;


/**
 * @author Guillermo Vigueras
 *
 */

public class Tester2 {

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
			String[] arr1 = null;
			String[] arr2 = null;
			do_check(arr1,arr2,true);
		}			
		
		{
			String[] arr1 = null;
			String[] arr2 = new String[]{};
			do_check(arr1,arr2,false);
		}	

		{
			String[] arr1 = new String[]{};
			String[] arr2 = null;
			do_check(arr1,arr2,false);
		}		
		
		{
			String[] arr1 = null;
			String[] arr2 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}					
		
		{
			String[] arr1 = new String[]{};
			String[] arr2 = new String[]{};
			do_check(arr1,arr2,true);
		}		
		
		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}		

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("ae"), new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}		
		
		
	    ////////////////////////////// BEGIN AUTO-GENERATED TEST CASES //////////////////////////////		
		{
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,true);
		}

		{
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			String[] arr2 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			String[] arr2 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			do_check(arr1,arr2,true);
		}

		{
			String[] arr1 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			String[] arr2 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			String[] arr2 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			String[] arr2 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			String[] arr2 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,true);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			String[] arr2 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			String[] arr2 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			String[] arr2 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			do_check(arr1,arr2,true);
		}

		{
			String[] arr1 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			String[] arr2 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			String[] arr2 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			String[] arr2 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			String[] arr2 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			String[] arr2 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			String[] arr2 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			String[] arr2 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			do_check(arr1,arr2,true);
		}

		{
			String[] arr1 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			String[] arr2 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			String[] arr2 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			String[] arr2 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			String[] arr2 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			String[] arr2 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			String[] arr2 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			do_check(arr1,arr2,true);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			String[] arr2 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			String[] arr2 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			String[] arr2 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			String[] arr2 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			String[] arr2 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			String[] arr2 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			String[] arr2 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			do_check(arr1,arr2,true);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			String[] arr2 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			String[] arr2 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			String[] arr2 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			String[] arr2 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			String[] arr2 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			String[] arr2 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			do_check(arr1,arr2,true);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			String[] arr2 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			String[] arr2 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			String[] arr2 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			String[] arr2 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			String[] arr2 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			String[] arr2 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			String[] arr2 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			do_check(arr1,arr2,true);
		}

		{
			String[] arr1 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			String[] arr2 = new String[]{null, null, null, null, null, null, null, null, new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("hbe"), new String("hbe"), new String("hbe"), new String("hbe"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			String[] arr2 = new String[]{new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae"), new String("ae")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			String[] arr2 = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("hbe"), new String("ae"), new String("eah")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			String[] arr2 = new String[]{new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), new String("ebag"), null, null, null, null, null, new String(""), new String(""), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("cg"), new String("cg"), new String("hgba")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			String[] arr2 = new String[]{new String("cg"), new String("agb"), new String("agb"), new String("agb"), new String("dceg"), new String("cg"), new String("hbe"), new String("hbe"), new String("ebag"), new String(""), new String(""), new String(""), new String(""), new String("dceg"), new String("dceg"), new String("dceg"), new String("dceg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			String[] arr2 = new String[]{new String("cg"), new String("cg"), new String("ebag"), new String("ebag"), new String("cg"), new String("cg"), new String("cg"), new String("cg")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			String[] arr2 = new String[]{new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("cg"), new String("hdaeb"), new String("hdaeb"), new String("hbe"), new String("hbe"), new String("hdaeb")};
			do_check(arr1,arr2,false);
		}

		{
			String[] arr1 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			String[] arr2 = new String[]{new String("hgba"), new String("hgba"), null, null, null, new String("cg"), new String("cg"), new String("cg"), new String("cg"), null};
			do_check(arr1,arr2,true);
		}

		////////////////////////////// END AUTO-GENERATED TEST CASES //////////////////////////////		
		
		System.out.println("\n Tester2: Test finalizado correctamente.");
	}
	
	static void do_check(String[] strArr1,String[] strArr2, boolean expected) {

	    Example2 checker = new Example2();

	    boolean result = false;

	    try {
		result = checker.compareArrays(strArr1,strArr2);
	    } catch (Exception exc) {
			System.out.println("\n*** Tester2 Error: returns exception\n"+exc.toString());	    	
//		System.out.println("\n*** Tester2 Error: compareArrays returns "+ result +
//				 "\n instead of " + expected + "\n when comparing the array:\n    " +
//				 printArray(strArr1)+".\n" +	
//				 " and array:\n" +
//				 printArray(strArr2)+".\n\n");
//		exc.printStackTrace();
//		System.out.println("\n");
		throw new Error("Error en test: resultado incorrecto");		
	    }
	    
	    if (result != expected) {
			System.out.println("\n*** Tester2 Error: compareArrays returns "+ result +
					 "\n instead of " + expected + "\n when comparing the array:\n    " +
					 printArray(strArr1)+".\n" +	
					 " and array:\n" +
					 printArray(strArr2)+".\n\n");
			throw new Error("Error en test: resultado incorrecto");		    
	    }
	}

    static String printArray(String[] arr) {
    	if(arr == null) return "null";
    	
		StringBuffer result = new StringBuffer();
		result.append("[");
		for (int i=0; i<arr.length; i++) {
		    result.append(arr[i]);
		    if (i<arr.length-1)
			result.append(",");
		}
		result.append("]");
		return result.toString();
    }
}
